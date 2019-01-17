package com.vedeng.message.demo.config;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


//整合过滤其（先进入过滤器）
@WebFilter(filterName = "FirstFilter", urlPatterns = "/first")
public class FirstFilter implements Filter {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
	                     FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("进入 Filter");
		arg2.doFilter(arg0, arg1);
		System.out.println("离开 Filter");
	}
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}
}
