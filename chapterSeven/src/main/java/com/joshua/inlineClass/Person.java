package com.joshua.inlineClass;

/**
 * Created by joshua on 2017/8/14.
 */
public class Person {
    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }

    public void setOfficeTelephone(TelephoneNumber officeTelephone) {
        this.officeTelephone = officeTelephone;
    }

    private class TelephoneNumber{
        private String number;
        private String areaNumber;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getAreaNumber() {
            return areaNumber;
        }

        public void setAreaNumber(String areaNumber) {
            this.areaNumber = areaNumber;
        }
    }
    public String getNumber() {
        return officeTelephone.getNumber();
    }

    public void setNumber(String number) {
        this.officeTelephone.setNumber(number);
    }

    public String getAreaNumber() {
        return officeTelephone.getAreaNumber();
    }

    public void setAreaNumber(String areaNumber) {
        this.officeTelephone.setAreaNumber(areaNumber);
    }
}
