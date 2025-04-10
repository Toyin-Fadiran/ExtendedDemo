package com.example.extendeddemo.adminanduser.service;

import java.util.List;

import com.example.extendeddemo.admin.model.Categories;

public interface ICategoryService {
	
	public Categories getCategory(long id);
	
	public List<Categories> getAllCategories();
	
	public void saveCategory(Categories object);
	
	public void updateCategory(Categories object);
	
	public void deleteCategory(long id);
	

}
