package com.github.wushujing.cloud.simple.dao;

import com.github.wushujing.cloud.simple.model.User;

import java.util.List;

/**
 * Created by wushujing on 20/12/2016.
 */
public interface UserDao {
	List<User> findAll();
}
