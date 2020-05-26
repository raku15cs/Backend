package com.example.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/home")
	public String home() {
		return  "Welcome  to Sring boot project";
	}	
	@Autowired
	private UserService uservice;
	
	@GetMapping("/userDetails")
      public List<UserDetails> getAllData() {
		return uservice.getAllData();
	}  
	
	@GetMapping("/userDetails/{id}")
    public Optional<UserDetails> getSingleData(@PathVariable int id ) {
		return  uservice.getSingleData(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/saveDetails")
		public void saveDetails(@RequestBody UserDetails user)
		{
		      uservice.saveDetails(user);
	     }
	
	@RequestMapping(method=RequestMethod.PUT,value="/updateDetails/{id}")
	 public void updateDetails(@PathVariable int id,@RequestBody  UserDetails user )
	 {
		uservice.updateDetails(id,user);
	 }
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/deleteData/{id}")
	public void deleteData(@PathVariable int id)
	{
		uservice.deleteData(id);
	}
	
}
