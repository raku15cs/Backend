package com.example.demo.todo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.todo.model.TodoModel;
import com.example.demo.todo.model.Userinfo;

@RestController
@CrossOrigin(origins = "http://localhost:3006")
public class Mycontroller {

	@Autowired
	private TodoService todoservice;

	@RequestMapping("/hello")
	public String hello() {
		return "hello todo app";
	}

	@RequestMapping("/hello{name}")
	public String hello(@PathVariable String name) {
		return "hjk";
	}

	// @CrossOrigin(origins="http://localhost:3006")
	@RequestMapping("/user/{username}/todo")
	public List<TodoModel> getAllTodo(@PathVariable String username) {
		return todoservice.getAlltodo();
	}

	@RequestMapping("/user/{username}/todo/{id}")
	public Optional<TodoModel> getTodo(@PathVariable String username, @PathVariable long id) {
		return todoservice.findById(id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{username}/todo/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {

		todoservice.deleteTodoByid(id);
		return ResponseEntity.noContent().build();

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/user/{username}/todo/{id}")
	public ResponseEntity<TodoModel> updateTodo(@PathVariable String username, @PathVariable long id,
			@RequestBody TodoModel todos) {
		// .out.println("fhbvtjmukmvbnm,");
		todos.setUsername(username);
		todoservice.save(todos);
		return new ResponseEntity<TodoModel>(todos, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/user/{username}/todo")
	public ResponseEntity<TodoModel> saveTodo(@PathVariable String username, @RequestBody TodoModel todos) {
		todos.setUsername(username);
		todoservice.save(todos);
		return new ResponseEntity<TodoModel>(todos, HttpStatus.OK);

	}
	
	@RequestMapping(method=RequestMethod.POST ,value="/sinup")
	public void usersinup(@RequestBody Userinfo userinfo) {
		todoservice.saveuserinfo(userinfo);
		
		
	}
}
