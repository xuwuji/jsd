package com.puruan.application;

// 自定义的业务错误
public class BizException extends RuntimeException {

    //状态码，代表具体的异常或者错误
    private String statusCode;
    // 错误的原因
    private String message;

    public BizException() {
        super();
    }

    public BizException(String message) {
        this.message = message;
    }

    public BizException(String status, String message) {
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
