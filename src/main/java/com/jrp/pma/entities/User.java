package com.jrp.pma.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	private String name;
	private String email;
	private String licenseNo;
	private String licenseExpiry;
	private String phone;
	private String licenseType;
	private String regiType;
	private String rescheduleCount;
	private String prefGLocation;
	private String prefG2location;
	private String prefDateStart;
	private String prefDateEnd;
	
	
	public User() {}
	
	public User(String name, String email, String licenseNo, String licenseExpiry, String phone, String licenseType,
			String regiType, String rescheduleCount, String prefGLocation, String prefG2location, String prefDateStart,
			String prefDateEnd) {
		super();
		this.name = name;
		this.email = email;
		this.licenseNo = licenseNo;
		this.licenseExpiry = licenseExpiry;
		this.phone = phone;
		this.licenseType = licenseType;
		this.regiType = regiType;
		this.rescheduleCount = rescheduleCount;
		this.prefGLocation = prefGLocation;
		this.prefG2location = prefG2location;
		this.prefDateStart = prefDateStart;
		this.prefDateEnd = prefDateEnd;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLicenseNo() {
		return licenseNo;
	}


	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}


	public String getLicenseExpiry() {
		return licenseExpiry;
	}


	public void setLicenseExpiry(String licenseExpiry) {
		this.licenseExpiry = licenseExpiry;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getLicenseType() {
		return licenseType;
	}


	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}


	public String getRegiType() {
		return regiType;
	}


	public void setRegiType(String regiType) {
		this.regiType = regiType;
	}


	public String getRescheduleCount() {
		return rescheduleCount;
	}


	public void setRescheduleCount(String rescheduleCount) {
		this.rescheduleCount = rescheduleCount;
	}


	public String getPrefGLocation() {
		return prefGLocation;
	}


	public void setPrefGLocation(String prefGLocation) {
		this.prefGLocation = prefGLocation;
	}


	public String getPrefG2location() {
		return prefG2location;
	}


	public void setPrefG2location(String prefG2location) {
		this.prefG2location = prefG2location;
	}


	public String getPrefDateStart() {
		return prefDateStart;
	}


	public void setPrefDateStart(String prefDateStart) {
		this.prefDateStart = prefDateStart;
	}


	public String getPrefDateEnd() {
		return prefDateEnd;
	}


	public void setPrefDateEnd(String prefDateEnd) {
		this.prefDateEnd = prefDateEnd;
	}


	

}
