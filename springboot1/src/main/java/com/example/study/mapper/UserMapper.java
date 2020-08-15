package com.example.study.mapper;

import org.springframework.stereotype.Repository;

import com.example.study.entity.User;

@Repository
public interface UserMapper {
	User sel(int id);
}
