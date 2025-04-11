package com.example.extendeddemo.adminanduser.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.extendeddemo.admin.model.Categories;
import com.example.extendeddemo.persist.dao.IDao;
import com.example.extendeddemo.persist.database.Database;

public class CategoryDAOImpl implements ICategoryDAO {
//	public class CategoryDAOImpl implements IDao<Categories> {
	
	//fields
	private Database db = Database.getInstance();
	
	
	
	private static final Logger logger = LogManager.getLogger(CategoryDAOImpl.class.getName());

	@Override
	public Categories get(long id) {
		// TODO Auto-generated method stub
		String readCategoriesSql = "Select * FROM categories where categoryId = ?";
		//placeholder
		
		Categories category = new Categories();
		
		try(Connection connection = db.getConnection();
		PreparedStatement ps = connection.prepareStatement(readCategoriesSql)) {
			ps.setInt(1, (int) id);
			
			//ACTUAL ATTEMPT TO SEND TO DB HERE:
			ResultSet categoryResultSet= db.executeQuery(ps);
									//getINt to extract an integer from a string column name
			category.setCategoryId( categoryResultSet.getInt("categoryId"));
			category.setCategoryName ( categoryResultSet.getString("categoryName"));
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("error occured in Retrieve Category DB: " + e);
		}
		
		
		
		
		
		
		return null;
	}

	@Override
	public List<Categories> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Categories object) {
		// TODO Auto-generated method stub
		// SQL query placeholder to insert Categories object into the database
		String insertCategoriesSql = "INSERT INTO Categories (categoryName, categoryDescription, categoryImageUrl, active, addedOn) VALUES (?, ?, ?, ?, ?)";
		
		try (Connection connection = db.getConnection();
			PreparedStatement ps = connection.prepareStatement(insertCategoriesSql)) {
			ps.setString(1, object.getCategoryName());
			ps.setString(2, object.getCategoryDescription());
			ps.setString(3, object.getCategoryImageUrl());
			ps.setInt(4, object.getActive());
			
			// Convert java.util.LocalDate to java.sql.Date
			java.sql.Date sqlDate = Date.valueOf(object.getAddedOn());
			// Set the date on the PreparedStatement
			ps.setDate(5, sqlDate);
			
			//ACTUAL ATTEMPT TO SEND TO DB HERE:
			int successOrFail= db.executeUpdate(ps);
			
			if (successOrFail > 0) {
				logger.info("successfully proccessed " + object + "to the DB");
			} else {
				logger.info("check DB for issues");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			logger.error("SQL Exception occurred in save Category method",e);
			
		}
		
		
	}


	@Override
	public void update(Categories object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
