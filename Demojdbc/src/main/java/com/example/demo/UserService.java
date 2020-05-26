package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository urepository;
	
	
	public List<UserDetails> getAllData() {
		
		return (List<UserDetails>) urepository.findAll();
	}

	public void saveDetails(UserDetails user) {
		  urepository.save(user);
	}

	public Optional<UserDetails> getSingleData(int id) {
		
		return urepository.findById(id);
	}

	public void updateDetails(int id, UserDetails user) {
		  urepository.save(user);
		
	}

	public void deleteData(int id) {
		urepository.deleteById(id);
		
	}
 

}
