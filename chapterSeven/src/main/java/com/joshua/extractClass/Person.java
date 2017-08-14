package com.joshua.extractClass;

/**
 * Created by joshua on 2017/8/14.
 */
public class Person {

    private String name;
    private TelephoneNumber officeNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getOfficeAreaCode() {
//        return officeAreaCode;
//    }
//
//    public void setOfficeAreaCode(String officeAreaCode) {
//        this.officeAreaCode = officeAreaCode;
//    }
//
//    public String getOfficeNumber() {
//        return officeNumber;
//    }
//
//    public void setOfficeNumber(String officeNumber) {
//        this.officeNumber = officeNumber;
//    }


    public Person(String name, TelephoneNumber officeNumber) {
        this.name = name;
        this.officeNumber = officeNumber;
    }

    public String getTelephoneNumber(){
//        return ("(" + officeAreaCode + ") " + officeNumber);
        return officeNumber.getTelephoneNumber();
    }
}
