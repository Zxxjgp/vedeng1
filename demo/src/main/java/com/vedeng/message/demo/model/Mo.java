package com.vedeng.message.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能描述
 * className
 *
 * @author Bert
 * @date 2019/1/3 10:21
 * @Description //TODO
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mo implements Serializable {
	private String id;
	private String name;
}
