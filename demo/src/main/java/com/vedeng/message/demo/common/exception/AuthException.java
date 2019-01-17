package com.vedeng.message.demo.common.exception;


import com.vedeng.message.demo.common.exception.base.BaseException;

public class AuthException extends BaseException {
    public AuthException(String message, int states) {
        super(message, states);
    }
}
