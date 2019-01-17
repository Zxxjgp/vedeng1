package com.vedeng.message.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description: 留言信息以及留言的回复
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_repkly")
public class ReplyMessage implements Serializable {
    @TableId(value = "REPLY_ID", type = IdType.AUTO)
    private Integer replyId;
    //创建时间
    @TableField(value = "ADD_TIME")
    private Long addTime;
    @TableField(exist = false)
    private String addTimes;
    //创建人
    @TableField(value = "CREATOR")
    private Integer creator;
    @TableField(exist = false)
    private String creators;
    //帖子的id
    @TableField(value = "MESSAGE_ID")
    private Integer messageId;
    //回复的id
    @TableField(value = "REPLY_REPLY_ID")
    private Integer replyReplyId;
    //回复的内容以及留言的内容
    @TableField(value = "REPLY_CONTENT")
    private String replyContent;

    /**
     * 作者的姓名
     */
    @TableField(exist = false)
    private String userName;

    /**
     * 留言的回复
     */
    @TableField(exist = false)
    private List<ReplyMessage> list;
}
