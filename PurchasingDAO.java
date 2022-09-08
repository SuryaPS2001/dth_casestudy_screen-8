package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import com.bean.Purchasing;

public class PurchasingDAO {
	public void createTable(Connection con) throws SQLException{
		String sql = "create table Purchasing(id int NOT NULL PRIMARY KEY, customerName varchar2(25), stbType varchar2(25), stbMacId int, stbSerialNum int, stbPrice int, installCharge int, refundDepositAmount int, discount int, tax double(3,2),amountPayable double(5,2))";
	    Statement st = con.createStatement();
	    st.execute(sql);
	}
	
	public int addPurchase(Connection con,Purchasing p) throws SQLException {
		int rows = 0;
		String sql = "insert into Purchasing values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, p.getId());
		ps.setString(2, p.getCustomerName());
		ps.setString(3,p.getStbType());
		ps.setInt(4, p.getStbMacId());
		ps.setInt(5, p.getStbSerialNum());
		ps.setInt(6, p.getStbPrice());
		ps.setInt(7, p.getInstallCharge());
		ps.setInt(8, p.getRefundDepositAmount());
		ps.setInt(9, p.getDiscount());
		ps.setDouble(10, p.getTax());
		ps.setDouble(11, p.getAmountPayable());
		rows = ps.executeUpdate();
		return rows;
	}
	
	public int updatePurchase(Connection con,String customerName, String stbType, int stbMacId, int stbSerialNum, int stbPrice, int installCharge, int refundDepositAmount, int discount, double tax, double amountPayable, int id) throws SQLException {
		int updated = 0;
		String sql = "update Purchasing set customerName=?, stbType=?, stbMacId=?, stbSerialNum=?, stbPrice=?, installCharge=?, refundDepositAmount=?, discount=?, tax=?, amountPayable=? where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, customerName);
		ps.setString(2, stbType);
		ps.setInt(3, stbMacId);
		ps.setInt(4, stbSerialNum);
		ps.setInt(5, stbPrice);
		ps.setInt(6, installCharge);
		ps.setInt(7, refundDepositAmount);
		ps.setInt(8, discount);
		ps.setDouble(9, tax);
		ps.setDouble(10, amountPayable);
		ps.setInt(11, id);
		updated = ps.executeUpdate();
		return updated;
	}
	
	public void deletePurchase(Connection con,int id) throws SQLException{
		String sql = "delete from Purchasing where id=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.executeUpdate();
		
	}
	
	public static void displayRecords(Connection con) throws SQLException{
		String sql = "select * from Purchasing";
		Statement st = con.createStatement();
		ResultSet resultObj = st.executeQuery(sql);
		while(resultObj.next()) {
			System.out.println(String.format("ID: %d",resultObj.getInt("id")));
			System.out.println(String.format("Customer Name: %s",resultObj.getString("customerName")));
			System.out.println(String.format("Set Top Box Type: %s",resultObj.getString("stbType")));
			System.out.println(String.format("Set Top Box MAC ID: %d",resultObj.getInt("stbMacId")));
			System.out.println(String.format("Set Top Box Serial Number: %d",resultObj.getInt("stbSerialNum")));
			System.out.println(String.format("Set Top Box Price: %d",resultObj.getInt("stbPrice")));
			System.out.println(String.format("Installation Charge: %d",resultObj.getInt("installCharge")));
			System.out.println(String.format("Refundable Deposit Amount: %d",resultObj.getInt("refundDepositAmount")));
			System.out.println(String.format("Discount: %d",resultObj.getInt("discount")));
			System.out.println(String.format("Tax: %f",resultObj.getDouble("tax")));
			System.out.println(String.format("Amount Payable: %f",resultObj.getDouble("amountPayable")));
		}
		
	}

}
