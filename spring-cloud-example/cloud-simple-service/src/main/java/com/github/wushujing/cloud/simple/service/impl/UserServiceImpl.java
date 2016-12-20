package com.github.wushujing.cloud.simple.service.impl;

import com.github.wushujing.cloud.simple.dao.UserDao;
import com.github.wushujing.cloud.simple.model.User;
import com.github.wushujing.cloud.simple.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wushujing on 20/12/2016.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}

}
