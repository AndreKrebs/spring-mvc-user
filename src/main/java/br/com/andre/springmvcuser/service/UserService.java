package br.com.andre.springmvcuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andre.springmvcuser.domain.User;
import br.com.andre.springmvcuser.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public List<User> findUsers(String username, String name, String email) {
		List<User> userList = userMapper.findByDynamicFilter(username, name, email);
		
		return userList;
	}
	
}
