package com.village.notifier.entity;

import java.util.List;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.village.notifier.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter

@Setter

public class User extends BaseEntity{
	
	
	private String userName;
	
	private String mobileNumber;
	
	private String password;
	
	private String email;
	
	
	@Column(columnDefinition="BOOLEAN DEFAULT TRUE")
	private boolean deleteAllowed=true;
	
	
	@ManyToMany
	@JoinTable(name="users_roles",joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name="role_id",referencedColumnName = "id"))
	private List<Role> roles;
	
	

}
