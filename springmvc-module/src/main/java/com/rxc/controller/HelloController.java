package com.rxc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author RanXuCan
 * @Date 2020/9/27 23:34
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        String username = request.getParameter("username");
        modelAndView.addObject("username",username);
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
