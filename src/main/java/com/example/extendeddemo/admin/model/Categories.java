package com.example.extendeddemo.admin.model;

import java.time.LocalDate;

public class Categories {

	private Integer categoryId;
	private String categoryName;
	private String categoryDescription;
	private String categoryImageUrl;
	private Integer active;
	private LocalDate addedOn;
	
	public Categories() {
		super();
	}

	public Categories(Integer categoryId, String categoryName, String categoryDescription, String categoryImageUrl,
			Integer active, LocalDate addedOn) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryImageUrl = categoryImageUrl;
		this.active = active;
		this.addedOn = addedOn;
	}

	
	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}

	public void setCategoryImageUrl(String categoryImageUrl) {
		this.categoryImageUrl = categoryImageUrl;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}


	public LocalDate getAddedOn() {
		return addedOn;
	}


	public void setAddedOn(LocalDate addedOn) {
		this.addedOn = addedOn;
	}


	@Override
	public String toString() {
		return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryDescription="
				+ categoryDescription + ", categoryImageUrl=" + categoryImageUrl + ", active=" + active + ", addedOn="
				+ addedOn + "]";
	}

}

