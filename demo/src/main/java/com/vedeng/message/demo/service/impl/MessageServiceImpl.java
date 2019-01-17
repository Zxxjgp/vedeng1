package com.vedeng.message.demo.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.vedeng.message.demo.dao.MessageDao;
import com.vedeng.message.demo.dao.UserDao;
import com.vedeng.message.demo.model.Message;
import com.vedeng.message.demo.model.User;
import com.vedeng.message.demo.service.MessageService;

import com.vedeng.message.demo.utils.DateUtils;
import com.vedeng.message.demo.utils.ObjectUtils;
import com.vedeng.message.demo.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description:
 * @version:
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageDao, Message>  implements MessageService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean insert(Message entity) {
        entity.setAddTime(System.currentTimeMillis());
        entity.setModTime(System.currentTimeMillis());
        entity.setCreator(1);
        return super.insert(entity);
    }

    @Override
    public Page<Message> selectUserList(Page<Message> page) {
        List<Message> list = baseMapper.selectUserList(page);
        page.setCount(page.getTotal());
        page.setList(list);
        return page;
    }

    @Override
    public Message selectById(Serializable id) {
        //查询帖子信息
        Message message = super.selectById(id);
        if (!ObjectUtils.isEmpty(message)){
            //如果帖子存在信息，就将用户名放在Message里面去
            message.setAddTimes(DateUtils.stampToDate(message.getAddTime().toString()));
            User user = userDao.selectById(message.getCreator());
            if (!ObjectUtils.isEmpty(user)){
                message.setCreatorName(user.getUserName());
            }
        }
        return message;
    }
}
