package com.github.wushujing.cloud.simple.web;

import com.github.wushujing.cloud.simple.model.User;
import com.github.wushujing.cloud.simple.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wushujing on 20/12/2016.
 */
@RestController
public class SimpleController {

	@Resource
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getAllUser() {
		return userService.getAll();
	}
}
