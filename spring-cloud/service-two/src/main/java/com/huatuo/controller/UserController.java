package com.huatuo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.huatuo.bean.User;

@RestController
public class UserController {

	@RequestMapping(value = "/getUser/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable("userId") String userId) throws InterruptedException{

        System.out.println("获取User,根据UserId，查询User-->" + userId);
        Thread.sleep(50000l);
        User user = new User();
        user.setUserName("kim");
        user.setPassword("123");
        user.setUserType(1);
        user.setRegisterTime(new Date());
        user.setValidity("0");

        return user;

    }

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@RequestBody User user){

        System.out.println("保存User--->" + JSON.toJSONString(user));

        return "userId:010100100101";
    }

	@RequestMapping(value = "deleteUser/{userId}", method = RequestMethod.GET)
    public Boolean deleteUser(@PathVariable("userId") String userId){

        System.out.println("删除用户--->" + userId);

        return true;
    }

    /**
     * 不指定请求类型的写法
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "findUserByUserNameAndPassword")
    public User findUserByUserNameAndPassword(String userName, String password){

        System.out.println("userService--->" + userName + "  password--->" + password);

        User user = new User();
        user.setUserName("Tomcat");
        user.setPassword("123");
        user.setUserType(1);
        user.setRegisterTime(new Date());
        user.setValidity("0");

        return user;
    }
    
    @RequestMapping(value = "findUser/{userId}/{userName}", method = RequestMethod.GET)
    public User findUser(@PathVariable("userId")String userId,@PathVariable("userName") String userName){

        System.out.println("userService--->" + userId + "  userName--->" + userName);

        User user = new User();
        user.setUserName("Tomcat");
        user.setPassword("123");
        user.setUserType(1);
        user.setRegisterTime(new Date());
        user.setValidity("0");

        return user;
    }
}