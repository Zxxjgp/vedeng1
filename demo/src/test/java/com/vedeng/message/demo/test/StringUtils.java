package com.vedeng.message.demo.test;

/**
 * 功能描述
 * className
 *
 * @author Bert
 * @date 2019/1/16 15:58
 * @Description //TODO
 * @version: 1.0
 */
public class StringUtils {
	public static void main(String[] args) {
		String tr = "  ab  lkol ";
		String trim = trim(tr);
/*		System.out.println("".equals(trim));
		System.out.println("".equals(trim(tr)));*/
		boolean b = trim.startsWith("*");
		System.out.println(b);
		boolean c = trim.startsWith("a");
		System.out.println(c);
	}
	
	public static String trim(String str){
		String temp = str.trim();
		return temp;
	}
	
	
}
