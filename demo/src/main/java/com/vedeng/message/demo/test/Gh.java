package com.vedeng.message.demo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能描述
 * className
 *
 * @author Bert
 * @date 2019/1/3 16:57
 * @Description //TODO
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gh implements Serializable {
	
	private String str;
	private int age;
	private double pr;
}
