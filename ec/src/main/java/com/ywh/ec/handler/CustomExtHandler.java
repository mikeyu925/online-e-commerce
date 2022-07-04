package com.ywh.ec.handler;


import com.ywh.ec.utils.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


//@ControllerAdvice
@RestControllerAdvice  // 处理异常的注解 返回Json数据
public class CustomExtHandler {

    @ExceptionHandler(value=Exception.class)
    JsonData handlerException(Exception e, HttpServletRequest request){
        return JsonData.buildCode("服务端Error",-2);
    }

//    @ExceptionHandler(value=Exception.class)
//    Object handlerException(Exception e, HttpServletRequest request){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error.html"); //错误页面的路径
//        modelAndView.addObject("msg",e.getMessage());
//        return modelAndView;
//    }
}
