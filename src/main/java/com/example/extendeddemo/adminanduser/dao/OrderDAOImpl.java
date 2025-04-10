package com.example.extendeddemo.adminanduser.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.extendeddemo.admin.model.Orders;
import com.example.extendeddemo.admin.model.Users;

public class OrderDAOImpl implements IOrderDAO {
	
	//fields
	
	private Map<Integer, Users> userEntry;
	private Map<Integer, Orders> orderEntry;
	
	

	public OrderDAOImpl() {
		userEntry = new HashMap<>();
		orderEntry = new HashMap<>();
	}

	@Override
	public Boolean placeOrder(Users users, Orders order) {
		// Business Logic goes here
		return true;
	}

	@Override
	public Orders getOrderDetails(int orderId) {
		Orders order = new Orders();
		// Business Logic goes here
		return order;
	}
	
	

}
