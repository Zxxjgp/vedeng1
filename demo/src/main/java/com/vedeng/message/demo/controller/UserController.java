package com.vedeng.message.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.vedeng.message.demo.model.Message;
import com.vedeng.message.demo.model.Mo;
import com.vedeng.message.demo.model.User;
import com.vedeng.message.demo.service.impl.MessageServiceImpl;
import com.vedeng.message.demo.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author Bert
 * @date 2018/11/5
 * @Description: 用户的相关操作
 * @version:1.0
 */
@RestController

public class UserController {

    @Resource
    private UserServiceImpl userService;
    @Resource
    private MessageServiceImpl messageService;

    EntityWrapper<User> queryWrapper = new EntityWrapper<User>();
    EntityWrapper<Message> messageEntityWrapper = new EntityWrapper<Message>();

    /**
     * 用户进行登陆
     * @param user
     * @return
     */
    @RequestMapping(value = "test" ,method = RequestMethod.POST)
    public ModelAndView getView(User user){
        ModelAndView mv = new ModelAndView("main");
        /**
         * 获取用户名
         */
        mv.addObject("user",user.getUserName());
	    List<Message> messages = messageService.selectList(messageEntityWrapper);
	    mv.addObject("size",messages.size());
	    //获取留言信息
        mv.addObject("message",messages);

        return mv;
    }
    
    @ResponseBody
    @RequestMapping("list")
    public List<Message> get(){
    	
    	//messageService.selectPage(,messageEntityWrapper);
    	
	    List<Message> messages = messageService.selectList(messageEntityWrapper);
	    return messages;
    }
    
    

    /**
     * 页面的跳转
     * @return
     */
    @RequestMapping("page")
    public ModelAndView getPage(){

        return new ModelAndView("/login");
    }
    
    /**
     * 页面的跳转
     * @return
     */
    @RequestMapping("pages")
    public ModelAndView getPages(){
        
        return new ModelAndView("/page");
    }
    
    /**
     * 方法实现说明
     *
     * @return a
     * author Bert
     * @date 2018/11/6 21:10
     */
    @RequestMapping("user")
    public User user(){
        return userService.selectOne(queryWrapper);
    }
    
    
    @ResponseBody
    @RequestMapping(value = {"test1","test2",""})
    public String testss(){
        return "我是测试为二位";
    }
	
	
	/**
	 *
	 * @Title: toDemo
	 * @Description: 跳转freemarker页面
	 * @param mv
	 * @return
	 */
	@RequestMapping(value = "/firstq")
	public ModelAndView toDemo(HttpServletRequest request, HttpServletResponse resp) {
		request.setAttribute("wewew","ewqeqweqwewq");
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "jack");
		mv.setViewName("freemarker");
		return mv;
	}
	
	
	
	@RequestMapping(value = "/first" , method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
	public @ResponseBody Object edit(Mo vo1) {
		JSONObject obj = new JSONObject();
		obj.put("flag", true);
		return obj;
	}
	
	@RequestMapping(value = "/fileUpLoad", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("fileName") MultipartFile file){
			if(file.isEmpty()){
				return "false";
			}
			String fileName = file.getOriginalFilename();
			int size = (int) file.getSize();
			System.out.println(fileName + "-->" + size);
			
			String path = "D:/test" ;
			File dest = new File(path + "/" + fileName);
			if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
				dest.getParentFile().mkdir();
			}
			try {
				file.transferTo(dest); //保存文件
				return "true";
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "false";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "false";
			}
		}
}



