package com.vedeng.message.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description: 用户实体
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_user")
public class User implements Serializable {
    //用户ID
    @TableId(value = "USER_ID", type = IdType.AUTO)
    private Integer userId;
    //用户名
    @TableField(value = "USER_NAME")
    private String userName;
    //用户密码
    @TableField(value = "USER_PASSWORD")
    private String userPassword;
    //用户性别
    @TableField(value = "USER_SEX" )
    private Integer userSex;
    //用户邮件
    @TableField(value = "USER_MAIL")
    private String userMail;
    //用户地址
   // @TableField(exist = false)
    @TableField(value = "USER_ADDR")
    private String userAddr;

  //  @TableField(exist = false)
  @TableField(value = "USER_IMG")
    private String userImg;
    //创建时间
    @TableField(value = "ADD_TIME")
    private Long addTime;
    //创建人
    @TableField(value = "CREATOR")
    private Integer creator;
    //更新时间
    @TableField(value = "MOD_TIME")
    private Long modTime;
    //更新人
    @TableField(value = "UPDATER")
    private Integer updater;
    //是否删除 0 未删除 1 已经删除
    @TableField(value = "IS_DELETE")
    private Integer isDelete;
    //用户的登陆IP
    @TableField(value = "USER_IP")
    private Integer userIp;
    //用户的登陆时间
    @TableField(value = "USER_LOGIN_TIME")
    private Integer userLoginTime;
    //用户夫人登出时间
    @TableField(value = "USER_OUT_TIME")
    private Integer userOutTime;
}
