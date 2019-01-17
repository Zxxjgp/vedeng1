package com.vedeng.message.demo.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.vedeng.message.demo.dao.ReplyMessageDao;
import com.vedeng.message.demo.model.ReplyMessage;
import com.vedeng.message.demo.service.ReplyMessageService;
import com.vedeng.message.demo.utils.DateUtils;
import com.vedeng.message.demo.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/6
 * @Description:
 * @version:
 */
@Service
public class ReplyMessageServiceImpl extends ServiceImpl<ReplyMessageDao, ReplyMessage> implements ReplyMessageService {

    /**
     * 得到一条帖子的留言
     * @param messageId
     * @return
     */
    @Override
    public List<ReplyMessage> getReplyMessage(Integer messageId) {
        //查询留言
        List<ReplyMessage> list = baseMapper.getReplyMessage(messageId);
        //判断留言是否存在，如果留言存在看有没有，如果留言存在看有没有回复留言的存在
        if (list.size() >= 1){
            //对所有留言的
            list.stream().forEach(x ->{
                if (x.getReplyReplyId() != 0){
                    //查询留言的回复信息
                    x.setAddTimes(DateUtils.stampToDate(x.getAddTime().toString()));
                    List<ReplyMessage> byReplyId = baseMapper.findByReplyId(x.getReplyReplyId());
                    if (list.size() >= 1){
                        x.setList(byReplyId);
                    }
                }
            });
        }
        //将回复的留言全部干掉
        List<ReplyMessage> collect = list.stream().filter(x -> x.getReplyReplyId() == 0).collect(Collectors.toList());
        return collect;
    }

    /**
     * 留言
     * @param entity
     * @return
     */
    @Override
    public boolean insertOrUpdate(ReplyMessage entity) {
        entity.setAddTime(System.currentTimeMillis());
        /**
         * 创建人
         */
        entity.setCreator(1);
        return super.insertOrUpdate(entity);
    }
}
