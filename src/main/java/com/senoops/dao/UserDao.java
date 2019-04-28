package com.senoops.dao;

import java.util.List;

import com.senoops.model.User;



public interface UserDao {

	void deleteById(Integer id);
	
	int insert(User record);
	
	int insertSelective(User record);
	
	List<User> selectAll();
	
	User selectById(Integer id);
	
	User selectByUsername(String username);
	
	int updateByIdSelective(User record);
	
	int updateById(User record);
}
