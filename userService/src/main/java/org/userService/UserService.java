package org.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.userDao.UserDao;
import org.userDomain.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public User getUserById(Long id){
		return userDao.getUserById(id);
	}
}
