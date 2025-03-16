package com.jwt.tcswings.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.tcswings.entity.MyEntity;



@Repository
public interface MyRepo extends JpaRepository<MyEntity, Integer>{

}
