package com.vedeng.message.demo.config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

//整合和servlet
@WebServlet(name="FirstServlet",urlPatterns="/first")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwww");
/*		response.sendRedirect("http://www.baidu.com");*/
		System.out.println("请求首行信息");
		String type = request.getMethod();
		String url = request.getRequestURI();
		System.out.println("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww"+request.getAttribute("gg"));
		String protocol = request.getProtocol();
		System.out.println("首行信息："+type+url+protocol);
		
		System.out.println("请求头信息");
		System.out.println("---下面是根据一个指定的头获取指定值--");
		String accept = request.getHeader("accept");
		System.out.println("accept信息："+accept);
		
		System.out.println("-------下面是获取所有的头Head信息----------");
		Enumeration<String> enumer = request.getHeaderNames();
		while(enumer.hasMoreElements()){
			String key = enumer.nextElement();
			System.out.println(key+"=="+request.getHeader(key));
	    }
		response.sendRedirect("/firstq");
	}
}
