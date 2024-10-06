/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mayurshiroya
 */
public class Address {
    private String streetadd;
    private String aptnum;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public Address(String streetadd,String aptnum,String city, String state, String zip, String phone){
    
        this.streetadd=streetadd;
        this.aptnum=aptnum;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone=phone;
    }
    
    public String getStreetadd() {
        return streetadd;
    }

    public void setStreetadd(String streetadd) {
        this.streetadd = streetadd;
    }

    public String getAptnum() {
        return aptnum;
    }

    public void setAptnum(String aptnum) {
        this.aptnum = aptnum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

