package com.huatuo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huatuo.bean.User;
import com.huatuo.feign.UserService;

@RestController
public class FeignTypeController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "getUser/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PostMapping(value = "saveUser")
    public String saveUser(User user){

        return userService.saveUser(user);
    }

    @GetMapping(value = "deleteUser/{userId}")
    public Boolean deleteUser(@PathVariable("userId") String userId){

        return userService.deleteUser(userId);
    }

    @RequestMapping(value = "findUserByUserNameAndPassword")
    public User findUserByUserNameAndPassword(String userName, String password){

        System.out.println("userService--->" + userName + "  password--->" + password);

        return userService.findUserByUserNameAndPassword(userName, password);
    }
    
    @GetMapping(value = "findUser/{userId}/{userName}")
    public User findUser(@PathVariable("userId")String userId, @PathVariable("userName")String userName){

        System.out.println("userService--->" + userId + "  userName--->" + userName);

        return userService.findUser(userId, userName);
    }

}
