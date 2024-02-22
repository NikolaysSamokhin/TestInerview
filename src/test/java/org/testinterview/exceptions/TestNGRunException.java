package org.testinterview.exceptions;

public class TestNGRunException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public TestNGRunException(String msg) {
        super(msg);
    }
}
