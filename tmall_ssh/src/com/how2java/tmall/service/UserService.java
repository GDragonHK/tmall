

package com.how2java.tmall.service;

import com.how2java.tmall.pojo.User;

public interface UserService extends BaseService{

	boolean isExist(String name);
	
	User get(String name, String password);

}


