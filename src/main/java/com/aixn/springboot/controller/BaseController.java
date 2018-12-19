package com.aixn.springboot.controller;

import com.aixn.springboot.error.BusinessException;
import com.aixn.springboot.error.EmBusinessError;
import com.aixn.springboot.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zxx
 * @date 2018/12/13 12:33
 */
public class BaseController {

    public static final String CONTENT_TYPE_FORMED="application/x-www-form-urlencoded";

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest httpServletRequest,Exception ex){
        Map<String,Object> responseData = new HashMap<>();
        if(ex instanceof BusinessException){
            BusinessException businessException = (BusinessException)ex;
            responseData.put("errCode",businessException.getErrCode());
            responseData.put("errMsg",businessException.getErrMsg());
        }else {
            responseData.put("errCode",EmBusinessError.UNKNOWN_ERROR);
            responseData.put("errMsg",EmBusinessError.UNKNOWN_ERROR);
        }

        return CommonReturnType.create(responseData,"fail");
    }
}
