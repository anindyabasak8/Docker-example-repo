package com.curd.docker.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curd.docker.entity.Students;

@RestController
public class ControllerClass {
	
	List<Students> st = new LinkedList<>();
	
	public ControllerClass() {
		st.add(new Students("Anindya",10,1,'a'));
		st.add(new Students("Sarbajit",10,2,'b'));
		st.add(new Students("Mayukh",12,4,'a'));
		st.add(new Students("Souradeep",10,10,'a'));
	}
	
	
	@GetMapping("/get")
	public List<Students> getAll(){
		return st;
	}
	
	@GetMapping("/get/{roll}")
	public Students getAllByRoll(@PathVariable int roll){
		for(Students s:st) {
			if(s.getRoll() == roll) {
				return s;
			}
		}
		return null;
	}
	
	@PostMapping("/save")
	public List<Students> addAll(@RequestBody Students std){
		 st.add(std);
		 return st;
	}
	
	
	

}
