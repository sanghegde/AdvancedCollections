package com.collections;

public class Parked_CarOwner_Details {

	private String ownerName;
	private int carModel;
	private String carNo;
	private long ownerMobileNo;
	private String ownerAddress;

	public String getOwnerName() {
		return ownerName;
	}

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo
				+ ", ownerMobileNo=" + ownerMobileNo + ", ownerAddress=" + ownerAddress + "]";
	}
	// getters and setters

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getCarModel() {
		return carModel;
	}

	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public long getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	// constructor
	public Parked_CarOwner_Details(String ownerName, int carModel, String carNo, long ownerMobileNo,
			String ownerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNo = carNo;
		this.ownerMobileNo = ownerMobileNo;
		this.ownerAddress = ownerAddress;
	}

}
