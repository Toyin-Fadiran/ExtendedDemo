package com.example.extendeddemo.admin.model;

import java.util.Date;
import java.util.List;

public class Orders {

	Integer orderId;
	Date orderDate;
	String orderStatus;
	List<OrderItems> products; //[OrderItem1, OrderItem2, OrderItem3]
	Integer totalItems;
	Double itemsSubTotal;
	Double shipmentCharges;
	Double totalAmount;
	Integer paymentStatus;
	String paymentStatusTitle;
	Integer paymentMethod;
	String paymentMethodTitle;
	Integer userId;

	public Orders(Integer orderId, Date orderDate, String orderStatus, List<OrderItems> products, Integer totalItems,
			Double itemsSubTotal, Double shipmentCharges, Double totalAmount, Integer paymentStatus,
			String paymentStatusTitle, Integer paymentMethod, String paymentMethodTitle, Integer userId) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.products = products;
		this.totalItems = totalItems;
		this.itemsSubTotal = itemsSubTotal;
		this.shipmentCharges = shipmentCharges;
		this.totalAmount = totalAmount;
		this.paymentStatus = paymentStatus;
		this.paymentStatusTitle = paymentStatusTitle;
		this.paymentMethod = paymentMethod;
		this.paymentMethodTitle = paymentMethodTitle;
		this.userId = userId;
	}

	public Orders() {
		super();
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderItems> getProducts() {
		return products;
	}

	public void setProducts(List<OrderItems> products) {
		this.products = products;
	}

	public Integer getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Double getItemsSubTotal() {
		return itemsSubTotal;
	}

	public void setItemsSubTotal(Double itemsSubTotal) {
		this.itemsSubTotal = itemsSubTotal;
	}

	public Double getShipmentCharges() {
		return shipmentCharges;
	}

	public void setShipmentCharges(Double shipmentCharges) {
		this.shipmentCharges = shipmentCharges;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Integer getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Integer paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentStatusTitle() {
		return paymentStatusTitle;
	}

	public void setPaymentStatusTitle(String paymentStatusTitle) {
		this.paymentStatusTitle = paymentStatusTitle;
	}

	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethodTitle() {
		return paymentMethodTitle;
	}

	public void setPaymentMethodTitle(String paymentMethodTitle) {
		this.paymentMethodTitle = paymentMethodTitle;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
				+ ", products=" + products + ", totalItems=" + totalItems + ", itemsSubTotal=" + itemsSubTotal
				+ ", shipmentCharges=" + shipmentCharges + ", totalAmount=" + totalAmount + ", paymentStatus="
				+ paymentStatus + ", paymentStatusTitle=" + paymentStatusTitle + ", paymentMethod=" + paymentMethod
				+ ", paymentMethodTitle=" + paymentMethodTitle + ", userId=" + userId + "]";
	}

}

