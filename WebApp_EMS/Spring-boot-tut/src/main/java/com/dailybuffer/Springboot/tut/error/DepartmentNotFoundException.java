package com.dailybuffer.Springboot.tut.error;

public class DepartmentNotFoundException extends Exception{
    public DepartmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }

    public DepartmentNotFoundException() {
        super();
    }

    protected DepartmentNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DepartmentNotFoundException(Throwable cause) {
        super(cause);
    }
}
