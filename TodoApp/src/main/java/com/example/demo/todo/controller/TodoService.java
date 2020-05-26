package com.example.demo.todo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.todo.email.EmailService;
import com.example.demo.todo.model.TodoModel;
import com.example.demo.todo.model.Userinfo;

@Service
public class TodoService {
	
	@Autowired
	private EmailService emailService;

	public static List<TodoModel> tododetails = new ArrayList<>();

//	static {
//		  tododetails.add(new TodoModel(1,"raju","learn java",new Date(),"Yes"));
//		  tododetails.add(new TodoModel(2,"shashi","learn python",new Date(),"Nno"));
//		  tododetails.add(new TodoModel(3,"raju","learn React js ",new Date(),"Yes"));
//		  tododetails.add(new TodoModel(4,"shashi","learn spring boot",new Date(),"No"));
//		 
//	}
	@Autowired
	private TodoJpaRepository todorespository;

	@Autowired
	private UserinfoRepository userrespository;

	public List<TodoModel> getAlltodo() {
		// return todorespository.findByUsername(username) ;
		return todorespository.findAll();

	}

	public void deleteTodoByid(long id) {

		todorespository.deleteById(id);
	}

	public Optional<TodoModel> findById(long id) {

		return todorespository.findById(id);
	}

	public TodoModel save(TodoModel todos) {
		// todos.setUsername(username);
		return todorespository.save(todos);

	}

	public void saveuserinfo(Userinfo userinfo) {
		System.out.println(userinfo.getPassword());
		System.out.println(userinfo.getConformpassword());
		System.out.println(userinfo.getEmail());
	
		  
//		Userinfo user = new Userinfo();
//		user.setEmail(userinfo.getEmail());
//		user.setPassword(userinfo.getPassword());
//		user.setConformpassword(userinfo.getConformpassword());
//		user.setUsername(userinfo.getUsername());
		    Userinfo user=userrespository.save(userinfo);
		//EmailService emailService=new EmailService();
		    
		  emailService.sendEmail(user.getEmail(),user.getPassword());

	}

}
