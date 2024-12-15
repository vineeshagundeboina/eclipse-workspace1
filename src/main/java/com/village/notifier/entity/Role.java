package com.village.notifier.entity;

import com.village.notifier.common.BaseEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Role extends BaseEntity{
	
	private String roleName;
	
	private String roleType;
	
	private String description;

}
