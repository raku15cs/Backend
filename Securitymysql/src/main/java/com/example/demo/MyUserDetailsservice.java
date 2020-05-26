package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsservice implements UserDetailsService {
    
	@Autowired
	UserRepository repository;
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Optional<User> user=repository.findByUserName(userName);
		
		user.orElseThrow(() -> new UsernameNotFoundException("USer NOt FOUNd:"+userName));
		
		return  user.map(MyUserDetails::new).get();
	}

}
