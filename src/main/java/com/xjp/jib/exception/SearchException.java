package com.xjp.jib.exception;

/**
 * @Author: xujunping_vendor
 * @Date: 2020/10/30 10:13
 */
public class SearchException extends BusinessException {
    public SearchException(String message) {
        super(message);
    }

    public SearchException(String message, String errCode) {
        super(message, errCode);
    }

    public SearchException(String message, String errCode, Throwable cause) {
        super(message, errCode, cause);
    }
}
