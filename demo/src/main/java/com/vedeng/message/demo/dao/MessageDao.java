package com.vedeng.message.demo.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import com.vedeng.message.demo.model.Message;
import com.vedeng.message.demo.utils.Page;


import java.util.List;

public interface MessageDao extends BaseMapper<Message> {

/*    @Select("selectUserList")*/
    List<Message> selectUserList(Page page);


}
