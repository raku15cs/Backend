package com.example.demo.todo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.todo.model.Userinfo;

@Repository
public interface UserinfoRepository extends JpaRepository<Userinfo ,String> {

	
}
