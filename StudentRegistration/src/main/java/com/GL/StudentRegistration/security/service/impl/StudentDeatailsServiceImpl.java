package com.GL.StudentRegistration.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.GL.StudentRegistration.security.entity.StudentsDetails;
import com.GL.StudentRegistration.security.entity.User;
import com.GL.StudentRegistration.security.repository.UserRepository;

public class StudentDeatailsServiceImpl implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = userRepository.getUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		return new StudentsDetails(user);
	}

}
