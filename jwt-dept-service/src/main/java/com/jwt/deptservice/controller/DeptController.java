package com.jwt.deptservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/dept")
public class DeptController {
	
	@GetMapping(path="/testDept")
	public ResponseEntity<?> testDept(){
		
		return ResponseEntity.status(HttpStatus.OK).body("dept works");
	}
}
