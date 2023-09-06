package org.apache.coyote.http11.response;

public enum StatusCode {

    OK(200);

    private final int code;

    StatusCode(final int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}