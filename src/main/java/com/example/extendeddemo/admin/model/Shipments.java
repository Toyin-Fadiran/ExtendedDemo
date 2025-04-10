package com.example.extendeddemo.admin.model;

import java.util.Date;

public class Shipments {

	private Integer shipmentId;
	private Integer shipmentStatus;
	private String shipmentTitle;
	private Date shipmentDate;
	private String shipmentMethod;
	private String shipmentCompany;

	public Shipments(Integer shipmentId, Integer shipmentStatus, String shipmentTitle, Date shipmentDate,
			String shipmentMethod, String shipmentCompany) {
		super();
		this.shipmentId = shipmentId;
		this.shipmentStatus = shipmentStatus;
		this.shipmentTitle = shipmentTitle;
		this.shipmentDate = shipmentDate;
		this.shipmentMethod = shipmentMethod;
		this.shipmentCompany = shipmentCompany;
	}

	public Shipments() {
		super();
	}

	public Integer getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}

	public Integer getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(Integer shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getShipmentTitle() {
		return shipmentTitle;
	}

	public void setShipmentTitle(String shipmentTitle) {
		this.shipmentTitle = shipmentTitle;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getShipmentMethod() {
		return shipmentMethod;
	}

	public void setShipmentMethod(String shipmentMethod) {
		this.shipmentMethod = shipmentMethod;
	}

	public String getShipmentCompany() {
		return shipmentCompany;
	}

	public void setShipmentCompany(String shipmentCompany) {
		this.shipmentCompany = shipmentCompany;
	}

	@Override
	public String toString() {
		return "Shipments [shipmentId=" + shipmentId + ", shipmentStatus=" + shipmentStatus + ", shipmentTitle="
				+ shipmentTitle + ", shipmentDate=" + shipmentDate + ", shipmentMethod=" + shipmentMethod
				+ ", shipmentCompany=" + shipmentCompany + "]";
	}

}

