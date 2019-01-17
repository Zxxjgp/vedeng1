package com.vedeng.message.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description: 帖子的实体
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("t_message")
public class Message implements Serializable {
    //
    @TableId(value = "MESSAGE_ID", type = IdType.AUTO)
    private Integer messageId;
    //帖子类型

    @TableField(value = "MESSAGE_TYPE")
    private Integer messageType;
    //帖子标题
    @TableField(value = "MESSAGE_TITLE")
    private String  messageTitle;
    //帖子内容
    @TableField(value = "MESSAGE_CONTENT")
    private String messageContent;
    //创建时间
    @TableField(value = "ADD_TIME")
    private Long addTime;

    //创建时间
    @TableField(exist = false)
    private String addTimes;
    //创建人
    @TableField(value = "CREATOR")
    private Integer creator;
    //创建人
    @TableField(exist = false)
    private String creatorName;
    //更新时间
    @TableField(value = "MOD_TIME")
    private Long modTime;
    //更新人
    @TableField(value = "UPDATER")
    private Integer updater;
    //访问次数
    @TableField(value = "MESSAGE_VISITS")
    private Integer messageVisits;
    //帖子的状态；0未删除 1 已删除
    @TableField(value = "IS_DELETE")
    private Integer isDelete;
}
