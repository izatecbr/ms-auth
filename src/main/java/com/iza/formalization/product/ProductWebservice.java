package com.iza.formalization.product;

import com.iza.formalization.product.domain.ProductRequest;
import com.iza.infra.http.Response;
import com.iza.infra.http.ResponseFactory;
import com.iza.infra.http.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static com.iza.core.Entitys.*;
@RestController
@RequestMapping("/products")
public class ProductWebservice {

    @Autowired
    private ProductService service;
    @PostMapping
    public Response post(@RequestBody ProductRequest request) {
        return ResponseFactory.create(service.save(request), ResponseMessage.create(PRODUCT.getName())) ;
    }
    @PutMapping("/{id}")
    public Response put(@PathVariable("id") Integer id, @RequestBody ProductRequest request) {
        return ResponseFactory.create(service.update(id,request), ResponseMessage.update(PRODUCT.getName())) ;
    }
    @GetMapping("/{id}")
    public Response get(@PathVariable("id") Integer id) {
        return ResponseFactory.create(service.find(id), ResponseMessage.update(PRODUCT.getName())) ;
    }
}

