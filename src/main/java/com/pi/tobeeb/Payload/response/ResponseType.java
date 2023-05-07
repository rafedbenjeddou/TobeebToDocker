package com.pi.tobeeb.Payload.response;

import java.io.Serializable;

public class ResponseType implements Serializable {
    private int statusCode;
    private String message;

    public ResponseType() {

    }

    public ResponseType(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BackendReponse [statusCode=" + statusCode + ", message=" + message + "]";
    }


}

