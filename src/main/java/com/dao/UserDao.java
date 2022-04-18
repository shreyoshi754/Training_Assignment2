package com.dao;

import com.entity.Login;
import com.entity.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);

}
