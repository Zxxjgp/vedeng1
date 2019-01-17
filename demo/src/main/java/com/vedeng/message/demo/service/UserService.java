package com.vedeng.message.demo.service;

import com.vedeng.message.demo.model.User;

import java.util.List;
/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description: 用户的相关接口
 * @version:1.0
 */
public interface UserService {
    /**
     * 查询所有的用户
     * @return
     */
    List<User> userListPage();
}
