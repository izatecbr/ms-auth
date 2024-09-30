package com.aml.auth.infra.business;

import org.springframework.http.HttpStatus;

public enum BusinessMessage {
    E404("404", "Não existe um(a) %s com o(a) %s informado(a)","O registro deve existir previamente"){
        @Override
        public int getHttpStatus() {
            return HttpStatus.NOT_FOUND.value();
        }
    },
    E204("204", "Consulta sem registros","Realize uma operação de cadastro"){
        @Override
        public int getHttpStatus() {
            return HttpStatus.NOT_FOUND.value();
        }
    },

    E100("100", "Usuário ou senha inválida","Verifique se os campos foram digitados corretamente"),
    E101("101", "Campo obrigatório: %s","Preencha o campo obrigatório"),
    E102("102", "Já existe um registro com %s igual a(o) %s","O registro deve ser único"),
    E103("103", "Senha expirada","É necessário você alterar a senha"),
    E114("104", "Usuário ou Senha Inválida","Revise os dados inseridos na autenticação"),
    E115("105", "Usuário %s","Consulta seu acesso junto ao suporte"),

    E116("116", "O campo %s não contem o tamanho mínimo de %s caracteres","Preencha o campo com a quantidade mínima de caracteres"),
    E117("117", "O campo %s ultrapassa o tamanho máximo de %s caracteres","Preencha o campo com a quantidade máxima de caracteres"),
    E118("118", "O campo %s não contem o tamanho mínimo de %s e máximo de %s caracteres","Preencha o campo com a quantidade mínima e máxima de caracteres"),

    E127("127", "%s","O campo precisa atender aos requisitos de negócio"),
    E134("134", "O campo %s %s","O campo precisa ser preenchido conforme regra(s) de negócio"),
    E135("135", "%s","O campo precisa ser preenchido conforme regra(s) de negócio"),

    E199("199", "Erro na tentativa de concluir a transação de persistência %s","Reporte ao suporte técnico"),
    E900("900", "Token inválido ou expirado","Realize uma nova autenticação"),
    E501("501", "Erro ao tentar acessar o recurso","Contacte o Suporte Técnico"){

        @Override
        public int getHttpStatus() {
            return 500;
        }
    },
    E502("502", "Método não implementado","Contacte o Suporte Técnico"){
        @Override
        public int getHttpStatus() {
            return 500;
        }
    },
    E500("500", "Erro não mapeado","Contacte o Suporte Técnico"){

        @Override
        public int getHttpStatus() {
            return 500;
        }
    },
    ;
    private final String code;
    private final String message;
    private final String suggestion;

    private int httpStatus;

    private BusinessMessage(String code, String mensagem, String suggestion) {
        this.code = code;
        this.message = mensagem;
        this.suggestion = suggestion;
    }

    public int getHttpStatus() {
        return HttpStatus.CONFLICT.value();
    }

    public String getSuggestion() {
        return suggestion;
    }

    public String getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }

}
