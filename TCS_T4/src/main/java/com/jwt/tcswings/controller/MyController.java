package com.jwt.tcswings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.tcswings.entity.MyEntity;
import com.jwt.tcswings.service.MyService;



@RestController
public class MyController {
	@Autowired
	private MyService serv;
	@GetMapping("/hi")
	public String hiMtd() {
			return "hii";
	}
	
	
	@GetMapping("/getData")
	public Object getMethodName() {
		return serv.getdata();
	};
	@PostMapping("/postData")
	public Object postMethodName(@RequestBody MyEntity data) {
		//TODO: process POST request
		
		return serv.postData(data);
	}
	@PutMapping("/putData/{empId}")
	public ResponseEntity<MyEntity> puMethodName(@RequestBody MyEntity data,@PathVariable Integer empId ) {
		//TODO: process POST request
		
		return serv.putData(data,empId);
	}
	
	

}
