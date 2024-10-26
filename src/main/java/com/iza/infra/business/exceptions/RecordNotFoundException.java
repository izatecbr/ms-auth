package com.iza.infra.business.exceptions;

import com.iza.infra.business.BusinessException;
import com.iza.infra.business.BusinessMessage;

public class RecordNotFoundException extends BusinessException {
    public RecordNotFoundException(String field, Object id) {
        super(BusinessMessage.E404, field, id);
    }
}
