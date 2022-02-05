/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aed_assign1;

import java.io.*;
/**
 *
 * @author gloriasingh
 */
public class addCar implements Serializable
        
{
    private static final long serialVersionUID= -897626244093472561L;
    private String brand;
    private String model;
    private String color;
    private int year;
    private int engine;
    private String servcRec;
    private int seatNumber;
    private int telephone;
    private String license;
    private String ownerName;
    private String ownerAddress;
    private String ownerEmail;
    private String ownerDL;
    private String ownerSSN;
    private int warrantYear;
    private String photo;

    public addCar(String brand, String model, String color, int year, String servcRec,int engine, int seatNumber, String license, String ownerName,int telephone, String ownerEmail, String ownerDL, String ownerSSN,String ownerAddress, int warrantYear,String photo) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engine=engine;
        this.servcRec = servcRec;
        this.seatNumber = seatNumber;
        this.telephone= telephone;
        this.license = license;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerAddress= ownerAddress;
        this.ownerDL = ownerDL;
        this.ownerSSN = ownerSSN;
        this.warrantYear = warrantYear;
        this.photo=photo;
        
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getServcRec() {
        return servcRec;
    }

    public void setServcRec(String servcRec) {
        this.servcRec = servcRec;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerDL() {
        return ownerDL;
    }

    public void setOwnerDL(String ownerDL) {
        this.ownerDL = ownerDL;
    }

    public String getOwnerSSN() {
        return ownerSSN;
    }

    public void setOwnerSSN(String ownerSSN) {
        this.ownerSSN = ownerSSN;
    }

    public int getWarrantYear() {
        return warrantYear;
    }

    public void setWarrantYear(int warrantYear) {
        this.warrantYear = warrantYear;
    }

  
    
    public boolean equal(addCar c)
    {
        return (this.brand==c.brand && this.model==c.model && this.color==c.color && this.year==c.year && this.servcRec==c.servcRec && this.seatNumber==c.seatNumber && this.engine==c.engine && this.license==c.license && this.ownerName==c.ownerName && this.telephone==c.telephone && this.ownerEmail== c.ownerEmail && this.ownerDL==c.ownerDL && this.ownerSSN==c.ownerSSN && this.ownerAddress==c.ownerAddress && this.warrantYear==warrantYear
                );
    }
 
    
}
    
