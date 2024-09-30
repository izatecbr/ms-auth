package com.aml.auth.infra.business;

public class LoginInvalidoException extends BusinessException {
    public LoginInvalidoException() {
        super(BusinessMessage.E100);
    }
}