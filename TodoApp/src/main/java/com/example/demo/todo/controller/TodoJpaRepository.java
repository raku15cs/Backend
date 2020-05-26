package com.example.demo.todo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.todo.model.TodoModel;

@Repository
public interface TodoJpaRepository extends JpaRepository<TodoModel,Long> {
	
	List<TodoModel> findByUsername(String username);

}
