package com.example.extendeddemo.adminanduser.service;

import java.util.List;

import com.example.extendeddemo.admin.model.Categories;
import com.example.extendeddemo.adminanduser.dao.CategoryDAOImpl;
import com.example.extendeddemo.adminanduser.dao.ICategoryDAO;

public class CategoryServiceImpl implements ICategoryService {
	
	//fields
	//we need the DAO class/interface specifically
	//for Categores, to complete our SERVICE.
	
	private ICategoryDAO categoryDao;
	
	
	//constructors --special method for instantiating an object
	

	public CategoryServiceImpl() {
	categoryDao	= new CategoryDAOImpl();
	}
	
	
	

	@Override
	public Categories getCategory(long id) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<Categories> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCategory(Categories object) {
		// TODO Auto-generated method stub
		categoryDao.save(object);
		
	}

	@Override
	public void updateCategory(Categories object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(long id) {
		// TODO Auto-generated method stub
		
	}



}
