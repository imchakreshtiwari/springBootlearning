package com.test.LearningBoot.interceptor;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class ProductServiceInterceptor implements HandlerInterceptor  {

	@Override
	public boolean preHandle(HttpServletRequest req,HttpServletResponse res,Object handler) throws Exception
	{
		System.out.println("pre handle method is calling");
		return true;
	}
	@Override
	public void postHandle(HttpServletRequest req,HttpServletResponse res,Object handler,ModelAndView modelview) throws Exception 
	{
		System.out.println("post handle is called");
	}
	@Override
	public void afterCompletion(HttpServletRequest req,HttpServletResponse res,Object handler,Exception exception) throws Exception
	{
		System.out.println("request and respomnse finished");
	}
}
