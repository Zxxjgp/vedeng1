package com.vedeng.message.demo.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.vedeng.message.demo.common.constant.CodeConstants;
import com.vedeng.message.demo.model.ReplyMessage;

import com.vedeng.message.demo.service.impl.ReplyMessageServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description: 回复的相关的
 * @version:1.0
 */
@Controller
@RequestMapping("/eply/message")
public class ReplyMessageController {

    @Resource
    private ReplyMessageServiceImpl replyMessageService;

    /**
     * 留言
     * @param replyMessage
     * @return
     */
    @PostMapping("/add")
    @ResponseBody
    public String addReplyMessage(@RequestBody ReplyMessage replyMessage){
        //留言的插入
        boolean insertReplyMessage = replyMessageService.insertOrUpdate(replyMessage);
        //判断留言是否插入成功
        if (insertReplyMessage){
            return CodeConstants.INSERT_SUCCESS;
        }else {
            return CodeConstants.INSERT_EXCEPTION;
        }
    }

    /**
     * 分页获取留言
     * @param page
     * @return
     */
    @GetMapping("/getListPage")
    @ResponseBody
    public Page<ReplyMessage> getListPage(Page page){
        Page page1 = replyMessageService.selectPage(page);
        return page;
    }

}
