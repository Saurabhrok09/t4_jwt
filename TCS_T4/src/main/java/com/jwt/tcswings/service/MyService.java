package com.jwt.tcswings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jwt.tcswings.entity.MyEntity;
import com.jwt.tcswings.repo.MyRepo;



@Service
public class MyService {
	@Autowired
	private MyRepo repo;

	public Object getdata() {
		// TODO Auto-generated method stub
		List<MyEntity> li = repo.findAll();
		if(li.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
		return ResponseEntity.ok(li);
	}

	public Object postData(MyEntity data) {
		// TODO Auto-generated method stub
//		Optional<MyEntity>data = repo.findById();
		if(data.equals(null) || data == null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		MyEntity newData= new MyEntity(data.getEmpId(), data.getName(), data.getPassword());
		repo.save(newData);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

	public ResponseEntity<MyEntity> putData(MyEntity data, Integer empId) {
		// TODO Auto-generated method stub
		Optional<MyEntity>justData = repo.findById(empId);
		if(justData.isEmpty()) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		MyEntity newerData = justData.get();
		newerData.setEmpId(data.getEmpId());
		newerData.setName(data.getName());
		newerData.setPassword(data.getPassword());
		repo.save(newerData);
		
		return ResponseEntity.status(HttpStatus.OK).build();
	}


}
