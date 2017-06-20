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
    private Integer rope1;
    private Integer rope2;
    private Integer rope3;
    private Integer rope4;
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
    
    public Integer getRope1() {
        return rope1;
    }

    public void setRope1(Integer rope1) {
        this.rope1 = rope1;
    }

    public Integer getRope2() {
        return rope2;
    }

    public void setRope2(Integer rope2) {
        this.rope2 = rope2;
    }

    public Integer getRope3() {
        return rope3;
    }

    public void setRope3(Integer rope3) {
        this.rope3 = rope3;
    }

    public Integer getRope4() {
        return rope4;
    }

    public void setRope4(Integer rope4) {
        this.rope4 = rope4;
    }
}
