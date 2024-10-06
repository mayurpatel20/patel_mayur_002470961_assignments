/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author mayurshiroya
 */
public class Person {
     private String fName;
     private String lname;
     private char middleInitial;
     private int age;

     private float height;
     private double weight;
     private String ssn;
     private Address homeAddress;
     private Address workAddress;

     public Person(String fName, String lname, char minitial, int age,float height, double weight, String ssn, Address home, Address work){
      
     this.fName=fName;
     this.lname=lname;
     this.middleInitial=minitial;
     this.age=age;
     this.weight=weight;
     this.height=height;
     this.ssn=ssn;
     this.homeAddress=home;
     this.workAddress=work;
     
     }
     
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }
    
    @Override
    public String toString(){
       return getfName(); 
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
