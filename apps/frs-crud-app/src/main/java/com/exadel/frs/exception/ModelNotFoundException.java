package com.exadel.frs.exception;

import static com.exadel.frs.handler.ExceptionCode.MODEL_NOT_FOUND;
import static java.lang.String.format;

public class ModelNotFoundException extends BasicException {

    public static final String MESSAGE = "Model %s not found";

    public ModelNotFoundException(final Long modelId) {
        super(MODEL_NOT_FOUND, format(MESSAGE, modelId));
    }

}
