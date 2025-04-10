package com.example.extendeddemo.admin.model;

import java.util.Date;
import java.util.List;

public class Products {

	private Integer productId;
	private String productTitle;
	private String productDescription;
	private String productCode;
	List<String> images; //["FrontView", "SideView", "view with humanModel"]
	private Integer thumbnailImage;
	private Integer price;
	private Date addedOn;
	private Integer rating;

	public Products(Integer productId, String productTitle, String productDescription, String productCode,
			List<String> images, Integer thumbnailImage, Integer price, Date addedOn, Integer rating) {
		super();
		this.productId = productId;
		this.productTitle = productTitle;
		this.productDescription = productDescription;
		this.productCode = productCode;
		this.images = images;
		this.thumbnailImage = thumbnailImage;
		this.price = price;
		this.addedOn = addedOn;
		this.rating = rating;
	}

	public Products() {
		super();
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

	public Integer getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(Integer thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getAddedOn() {
		return addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productTitle=" + productTitle + ", productDescription="
				+ productDescription + ", productCode=" + productCode + ", images=" + images + ", thumbnailImage="
				+ thumbnailImage + ", price=" + price + ", addedOn=" + addedOn + ", rating=" + rating + "]";
	}

}
