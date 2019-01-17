package com.vedeng.message.demo.common.exception;

import com.vedeng.message.demo.common.exception.base.BaseException;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description:
 * @version:
 */
public class CrudException extends BaseException {
    public CrudException(String message, int states) {
        super(message, states);
    }
}
