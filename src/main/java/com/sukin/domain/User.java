package com.sukin.domain;

/**
 * @author: sukin
 * Date：2019/4/3
 * Time：09:21
 * To change this template use File | Settings | File Templates.
 */
public class User {
//	nihao2

	private Integer id;
	private String name;
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}
}
