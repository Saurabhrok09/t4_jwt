package com.jwt.tcswings.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MyEntity implements UserDetails{
@Id
private Integer empId;

private String name;

private String password;

public Integer getEmpId() {
	return empId;
}

public void setEmpId(Integer empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "MyEntity [empId=" + empId + ", name=" + name + ", password=" + password + "]";
}

public MyEntity(Integer empId, String name, String password) {
	super();
	this.empId = empId;
	this.name = name;
	this.password = password;
}

public MyEntity() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public Collection<? extends GrantedAuthority> getAuthorities() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getUsername() {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean isAccountNonExpired() {
    return true;
}

@Override
public boolean isAccountNonLocked() {
    return true;
}

@Override
public boolean isCredentialsNonExpired() {
    return true;
}

@Override
public boolean isEnabled() {
    return true;
}


}
