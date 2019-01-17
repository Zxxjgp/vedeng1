package com.vedeng.message.demo.service;


import com.vedeng.message.demo.model.Message;
import com.vedeng.message.demo.utils.Page;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description: 帖子的相关接口
 * @version:1.0
 */
public interface MessageService {
    /**
     * 分页查询帖子数据
     * @param page
     * @return
     */
    Page<Message> selectUserList(Page<Message> page);
}
