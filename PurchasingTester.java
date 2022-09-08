package com.tester;

import java.sql.DriverManager;
import java.sql.Connection;	
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.SQLSyntaxErrorException;

import com.bean.Purchasing;
import com.dao.PurchasingDAO;

public class PurchasingTester {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
        String url = "jdbc:derby:testdb1;create=true";
        Connection con = DriverManager.getConnection(url);
        System.out.println("The connection is established");
        
        PurchasingDAO dao = new PurchasingDAO();
        Scanner sc = new Scanner(System.in);
        //dao.createTable(con);
        
        while(true) {
        	System.out.println("-----------------------------------------------");
        	System.out.println("          Purchase Set Top Box");
        	System.out.println("-----------------------------------------------");
        	System.out.println("All fields are mandatory. Amount is in Dollars.");
        	System.out.println("-----------------------------------------------");
        	System.out.println("1.Display\n2.Insert\n3.Delete\n4.Update");
        	
        	switch(Integer.parseInt(sc.nextLine())) {
        	 case 1:
        		 dao.displayRecords(con);
             break;
        	 case 2:
        		System.out.println("Enter your ID:");
 				int id = Integer.parseInt(sc.nextLine());
 				System.out.println("Enter your Name:");
 				String customerName = sc.nextLine();
 				System.out.println("Set Top Box Type:");
 				String stbType = sc.nextLine();
 				System.out.println("Set Top Box MAC ID:");
 				int stbMacId = Integer.parseInt(sc.nextLine());
 				System.out.println("Set Top Box Serial Number:");
 				int stbSerialNum = Integer.parseInt(sc.nextLine());
 				System.out.println("Set Top Box Price:");
 				int stbPrice = Integer.parseInt(sc.nextLine());
 				System.out.println("Installation Charge:");
 				int installCharge = Integer.parseInt(sc.nextLine());
 				System.out.println("Refundable Deposit Amount:");
 				int refundDepositAmount = Integer.parseInt(sc.nextLine());
 				System.out.println("Discount:");
 				int discount = Integer.parseInt(sc.nextLine());
 				System.out.println("Tax:");
 				double tax = Double.parseDouble(sc.nextLine());
 				System.out.println("Amount Payable:");
 				double amountPayable = Double.parseDouble(sc.nextLine());
 				Purchasing p1 = new Purchasing(id,customerName,stbType,stbMacId,stbSerialNum,stbPrice,installCharge,refundDepositAmount,discount,tax,amountPayable);
 				dao.addPurchase(con, p1);
 			 break;
        	 case 3:
        		 System.out.println("Enter your ID:");
        		 id = Integer.parseInt(sc.nextLine());
        		 dao.deletePurchase(con, id);
        	 break;
        	 case 4:
        		System.out.println("Enter your Name:");
  				String customerName1 = sc.nextLine();
  				System.out.println("Set Top Box Type:");
  				String stbType1 = sc.nextLine();
  				System.out.println("Set Top Box MAC ID:");
  				int stbMacId1 = Integer.parseInt(sc.nextLine());
  				System.out.println("Set Top Box Serial Number:");
  				int stbSerialNum1 = Integer.parseInt(sc.nextLine());
  				System.out.println("Set Top Box Price:");
  				int stbPrice1 = Integer.parseInt(sc.nextLine());
  				System.out.println("Installation Charge:");
  				int installCharge1 = Integer.parseInt(sc.nextLine());
  				System.out.println("Refundable Deposit Amount:");
  				int refundDepositAmount1 = Integer.parseInt(sc.nextLine());
  				System.out.println("Discount:");
  				int discount1 = Integer.parseInt(sc.nextLine());
  				System.out.println("Tax:");
  				double tax1 = Double.parseDouble(sc.nextLine());
  				System.out.println("Amount Payable:");
  				double amountPayable1 = Double.parseDouble(sc.nextLine());
  				System.out.println("Enter your ID:");
 				int id1 = Integer.parseInt(sc.nextLine());
 				dao.updatePurchase(con, customerName1, stbType1, stbMacId1, stbSerialNum1, stbPrice1, installCharge1, refundDepositAmount1, discount1, tax1, amountPayable1, id1);
 			break;
        	}
        	System.out.println("Press 'e' to exit!");
        	if(sc.nextLine().equals("e")) {
        		break;
        	}
        }
        con.close();
	}

}
