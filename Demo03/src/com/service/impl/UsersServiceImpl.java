package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.model.Users;
import com.service.UsersService;
@Service("usersService")
@Transactional
public class UsersServiceImpl implements UsersService{
	@Resource(name="usersDao")
	private UsersDao usersDao;
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}


	@Override
	public Users loginValidate(String username) {
		
		return this.usersDao.findByUsers(username);
	}

}
