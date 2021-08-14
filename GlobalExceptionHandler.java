package com.puruan.application;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 对全局的异常进行捕捉和对应的处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 针对bizException业务异常处理的统一方式
     *
     * @param bizException
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ErrorResponse catchBizException(BizException bizException) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus("error");
        errorResponse.setMessage(bizException.getMessage());
        return errorResponse;
    }

    /**
     * 针对TechException技术上的异常处理的统一方式
     *
     * @param techException
     * @return
     */
    @ExceptionHandler(value = TechException.class)
    @ResponseBody
    public ErrorResponse catchTechException(TechException techException) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus("error");
        errorResponse.setMessage("发生技术故障");
        return errorResponse;
    }


}
