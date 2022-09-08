package com.bean;

public class Purchasing {
       private int id;
       private String customerName;
       private String stbType;
       private int stbMacId;
       private int stbSerialNum;
       private int stbPrice;
       private int installCharge;
       private int refundDepositAmount;
       private int discount;
       private double tax;
       private double amountPayable;
	
       public Purchasing(int id, String customerName, String stbType, int stbMacId, int stbSerialNum, int stbPrice,
			int installCharge, int refundDepositAmount, int discount, double tax, double amountPayable) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.stbType = stbType;
		this.stbMacId = stbMacId;
		this.stbSerialNum = stbSerialNum;
		this.stbPrice = stbPrice;
		this.installCharge = installCharge;
		this.refundDepositAmount = refundDepositAmount;
		this.discount = discount;
		this.tax = tax;
		this.amountPayable = amountPayable;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStbType() {
		return stbType;
	}

	public void setStbType(String stbType) {
		this.stbType = stbType;
	}

	public int getStbMacId() {
		return stbMacId;
	}

	public void setStbMacId(int stbMacId) {
		this.stbMacId = stbMacId;
	}

	public int getStbSerialNum() {
		return stbSerialNum;
	}

	public void setStbSerialNum(int stbSerialNum) {
		this.stbSerialNum = stbSerialNum;
	}

	public int getStbPrice() {
		return stbPrice;
	}

	public void setStbPrice(int stbPrice) {
		this.stbPrice = stbPrice;
	}

	public int getInstallCharge() {
		return installCharge;
	}

	public void setInstallCharge(int installCharge) {
		this.installCharge = installCharge;
	}

	public int getRefundDepositAmount() {
		return refundDepositAmount;
	}

	public void setRefundDepositAmount(int refundDepositAmount) {
		this.refundDepositAmount = refundDepositAmount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public double getAmountPayable() {
		return amountPayable;
	}

	public void setAmountPayable(int amountPayable) {
		this.amountPayable = amountPayable;
	}
	   
       
}
