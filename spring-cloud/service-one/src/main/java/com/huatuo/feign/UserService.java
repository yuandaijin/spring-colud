package com.huatuo.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huatuo.bean.User;
import com.huatuo.hystrix.ServiceFeignFakkback;

@FeignClient(value="service-B",fallback = ServiceFeignFakkback.class)//表示调用B服务
public interface UserService {

    @RequestMapping(value = "/getUser/{userId}", method = RequestMethod.GET)
    public User getUser(@PathVariable("userId") String userId);

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(User user);

    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.GET)
    public Boolean deleteUser(@PathVariable("userId") String userId);

    @RequestMapping(value = "/findUserByUserNameAndPassword", method = RequestMethod.GET)
    public User findUserByUserNameAndPassword(@RequestParam("userName") String userName, @RequestParam("password") String password);    
    
    @RequestMapping(value = "/findUser/{userId}/{userName}", method = RequestMethod.GET)
    public User findUser(@RequestParam("userId") String userId, @RequestParam("userName") String userName);    

}