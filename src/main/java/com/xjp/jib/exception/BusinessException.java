package com.xjp.jib.exception;

/**
 * @Author: xujunping_vendor
 * @Date: 2020/10/30 9:54
 */
public class BusinessException extends RuntimeException {

    private String message;

    private String code = "500";


    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(String message,String errCode) {
        super(message);
        this.message = message;
        this.code = errCode;
    }

    public BusinessException(String message, String errCode,Throwable cause) {
        super(message, cause);
        this.message = message;
        this.code = errCode;
    }

    public String getCode() {
        return code;
    }
}
