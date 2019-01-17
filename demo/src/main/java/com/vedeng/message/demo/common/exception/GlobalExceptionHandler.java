package com.vedeng.message.demo.common.exception;


import com.vedeng.message.demo.common.constant.CodeConstants;
import com.vedeng.message.demo.common.exception.base.BaseException;
import com.vedeng.message.demo.common.exception.base.BaseResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@ControllerAdvice("com.vedeng.message.demo")
@ResponseBody
public class GlobalExceptionHandler {
    @ExceptionHandler(AuthException.class)
    public BaseResponse baseExceptionHandler(HttpServletResponse response, BaseException ex){
        return new BaseResponse(ex.getStates(),ex.getMessage());

    }

    @ExceptionHandler(Exception.class)
    public BaseResponse otherExceptionHandler(HttpServletResponse response, Exception ex){
        return new BaseResponse(CodeConstants.EX_OTHER_CODE,ex.getMessage());

    }
}
