package com.puruan.application;

// 技术上的错误
public class TechException extends RuntimeException {

    //状态码，代表具体的异常或者错误
    private String statusCode;
    // 错误的原因
    private String message;

    public TechException() {
        super();
    }

    public TechException(String message) {
        this.message = message;
    }

    public TechException(String status, String message) {
        this.statusCode = status;
        this.message = message;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
