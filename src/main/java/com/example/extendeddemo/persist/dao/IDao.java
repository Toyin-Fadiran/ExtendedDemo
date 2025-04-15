package com.example.extendeddemo.persist.dao;

import java.util.List;

public interface IDao<T> {
	T get(long id); // REtrieve operation using PK ID (from the DB)
	
	List<T> getAll(); // Retrieve All operation
	/**
	 * CREATE! Service/DAO Method to SAVE Generic object into RDBMS
	 * @param object generic object to be created as a record in DB.
	 */
	void save(T object); // Create new record in DB
	
	void update(T object);// Update existing record in DB
	
	void delete(long id); // Delete existing record using PK from DB
}
