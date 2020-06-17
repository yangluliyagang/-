package cn.itcast.bean;

import lombok.Data;

/**
 * bean对象
 */
@Data
public class User {
	private String username;
	private String money;
	public String city;
	private Integer number;
	private Integer age;
	private String house;
}
