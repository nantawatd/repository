/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excelgenerator.dto;

/**
 *
 * @author Nantawat
 */
public class OrderDetail {
    
    private String no;
    private String comment;
    private String detail;
    private String type;
    private String wide;
    private String height;
    private String netColor;
    private Integer ropeNo;
    private byte[] image;
    private String aluColor;
    
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNetColor() {
        return netColor;
    }

    public void setNetColor(String netColor) {
        this.netColor = netColor;
    }

    public String getAluColor() {
        return aluColor;
    }

    public void setAluColor(String aluColor) {
        this.aluColor = aluColor;
    }
    
     public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public int getRopeNo() {
        return ropeNo;
    }

    public void setRopeNo(Integer ropeNo) {
        this.ropeNo = ropeNo;
    }
}
