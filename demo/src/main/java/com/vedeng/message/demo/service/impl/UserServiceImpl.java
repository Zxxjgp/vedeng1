package com.vedeng.message.demo.service.impl;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.vedeng.message.demo.dao.UserDao;
import com.vedeng.message.demo.model.User;
import com.vedeng.message.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description:用户的相关操作
 * @version:1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Override
    public List<User> userListPage() {
        return null;
    }

    @Override
    public User selectOne(Wrapper<User> wrapper) {
        return super.selectOne(wrapper);
    }
}
