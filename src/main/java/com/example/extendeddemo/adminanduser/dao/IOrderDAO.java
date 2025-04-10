package com.example.extendeddemo.adminanduser.dao;

import com.example.extendeddemo.admin.model.Orders;
import com.example.extendeddemo.admin.model.Users;

public interface IOrderDAO {
	
	public Boolean placeOrder(Users users, Orders order);
	
	public Orders getOrderDetails(int orderId);

}
