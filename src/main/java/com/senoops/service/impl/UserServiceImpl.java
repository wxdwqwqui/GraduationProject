package com.senoops.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senoops.dao.UserDao;
import com.senoops.model.User;
import com.senoops.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User selectById(Integer id) {
		User user = userDao.selectById(id);
		return user;
	}

	@Override
	public void save(User user) {
		userDao.insert(user);

	}

	@Override
	public User selectByUsername(String username) {
		return userDao.selectByUsername(username);
	}

	@Override
	public boolean userIsExist(String username) {
		User user = userDao.selectByUsername(username);
		if(user == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}

	@Override
	public void deleteById(Integer id) {
		userDao.deleteById(id);
	}

}
