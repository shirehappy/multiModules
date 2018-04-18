package org.userDao;

import org.springframework.stereotype.Repository;
import org.userDomain.User;

@Repository
public interface UserDao {

	public User getUserById(Long id);
}
