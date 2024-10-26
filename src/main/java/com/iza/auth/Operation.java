package com.iza.auth;

public enum Operation {
    INSERT,//POST
    UPDATE, //PUT
    CHANGE, //PATCH
    FIND, //GET one
    SEARCH, //GET with params
    SELECT, //GET combos/dropdown
    DELETE, //DELETE
    PRINT, //PRINT view/download
    EXPORT,//EXPORT csv/xls/doc
    VIEW, //VIEW readonly
    MENU, //GET Menu hierarchy
    FULL, //FULL access operation
}
