package com.example.extendeddemo.adminanduser.service;
import com.example.extendeddemo.admin.model.Orders;
import com.example.extendeddemo.admin.model.Users;
import com.example.extendeddemo.adminanduser.dao.IOrderDAO;
import com.example.extendeddemo.adminanduser.dao.OrderDAOImpl;

public class OrderServiceImpl implements IOrderService {
	
	private IOrderDAO dao;
	
	public OrderServiceImpl() {
		dao = new OrderDAOImpl();
	}

	@Override
	public Boolean placeOrder(Users users, Orders order) {
		// TODO Auto-generated method stub
		//code needs to be added here to implement ORDER service methods
		return null;
	}
	
	

}
