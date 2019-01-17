package com.vedeng.message.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.vedeng.message.demo.model.ReplyMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ReplyMessageDao extends BaseMapper<ReplyMessage> {
    /**
     * 得到回复信息
     * @return
     */
    List<ReplyMessage> getReplyMessage(@Param("messageId") Integer messageId);

    /**
     * 得到留言信息
     * @param replyReplyId
     * @return
     */
    List<ReplyMessage> findByReplyId(@Param("replyReplyId") Integer replyReplyId);
}
