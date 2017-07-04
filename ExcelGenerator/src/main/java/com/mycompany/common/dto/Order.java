/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.common.dto;

/**
 *
 * @author Nantawat
 */
public class Order {
    
    private String quotationId;
    private String billNumber;
    private String orderDate;
    private String receiveDate;
    private String customerName;
    private String sellerName;
    private String comment1;

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }
    
    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
    
    public static void main(String[] arg){
        autoCalculateNumberOfSlot();
    }
    
    private static void autoCalculateNumberOfSlot(){
        //    mHeight = height - (2+(10.5*2)+1)
        //
        //30 <= ( mHeight / 10 ) / x
        //x <= ( mHeight / 10 ) / 30
        int height = 2500;//Integer.parseInt(heightTxtNH.getText());
        double mHeight = height - (2 + (10.5 * 2) + 1);
        System.out.println("mHeight ::" + mHeight);
        
        double slotNumber = Math.ceil((mHeight / 10) / 30);
        System.out.println("slotNumber:::" + slotNumber);
    }
    
}
