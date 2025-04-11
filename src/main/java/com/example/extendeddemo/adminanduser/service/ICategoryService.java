package com.example.extendeddemo.adminanduser.service;

import java.util.List;

import com.example.extendeddemo.admin.model.Categories;

public interface ICategoryService {
	
	/**
	 * This method retrieves a Category Record from DB as a service using a given ID
	 * @param id the ID in DB we intend to retrieve
	 * @return The entire Cateogories record in the DATABASE
	 */
	public Categories getCategory(long id);
	
	public List<Categories> getAllCategories();
	
	public void saveCategory(Categories object);
	
	public void updateCategory(Categories object);
	
	public void deleteCategory(long id);
	

}
