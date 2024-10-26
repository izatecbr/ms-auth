package com.iza.infra.business.exceptions;

import com.iza.infra.business.BusinessException;
import com.iza.infra.business.BusinessMessage;

public class RequiredFillingException extends BusinessException {
    public RequiredFillingException(String field) {
        super(BusinessMessage.E100, field);
    }
}
