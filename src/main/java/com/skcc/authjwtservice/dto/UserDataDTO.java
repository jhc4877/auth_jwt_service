package com.skcc.authjwtservice.dto;

import java.util.List;

import com.skcc.authjwtservice.model.Role;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserDataDTO {
	@ApiModelProperty(position = 0)
	private String username;

	@ApiModelProperty(position = 1)
	private String email;

	@ApiModelProperty(position = 2)
	private String password;
	
	@ApiModelProperty(position = 3)
	private String name;

	@ApiModelProperty(position = 4)
	List<Role> roles;

	@ApiModelProperty(position = 5)
	private String city;

	@ApiModelProperty(position = 6)
	private Float lon;

	@ApiModelProperty(position = 7)
	private Float lat;
}
