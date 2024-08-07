package com.shop.e_cart.service;

import javax.servlet.http.HttpServletRequest;

import com.shop.e_cart.entity.Users;


public interface UserService {

	
	String getUserDetails(HttpServletRequest request);

	Users addUser(HttpServletRequest request);

}
