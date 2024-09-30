package com.aml.infra.business;

public class LoginInvalidoException extends BusinessException {
    public LoginInvalidoException() {
        super(BusinessMessage.E100);
    }
}