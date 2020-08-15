package com.example.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.entity.User;
import com.example.study.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public User sel(int id) {
		return userMapper.sel(id);
	}
}
