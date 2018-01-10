package com.huatuo.hystrix;

import org.springframework.stereotype.Component;

import com.huatuo.bean.User;
import com.huatuo.feign.UserService;

/**
 * 断路器设置
 * @author kim
 *
 */
@Component
public class ServiceFeignFakkback implements UserService {
	

		@Override
		public User getUser(String userId) {
			// TODO Auto-generated method stub
			User user=new User();
			user.setPassword("999999");
			user.setValidity("服务器忙，请稍后再试");
			return user;
		}

		@Override
		public String saveUser(User user) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Boolean deleteUser(String userId) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public User findUserByUserNameAndPassword(String userName, String password) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public User findUser(String userId, String userName) {
			// TODO Auto-generated method stub
			return null;
		}

}
