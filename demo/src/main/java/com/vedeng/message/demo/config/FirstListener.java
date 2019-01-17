package com.vedeng.message.demo.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

//整合监听器

@WebListener
public class FirstListener implements ServletContextListener {
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
// TODO Auto-generated method stub
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvv");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Listener...init......");
	}
}