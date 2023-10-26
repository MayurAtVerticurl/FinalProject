package com.medicines.project;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Medicine {
	
	@Id
	private String id;
	private String medicineName;
	private String price;
	
	public Medicine() {
		super();
	}
	
	public Medicine(String id, String medicineName, String price) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.price = price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
