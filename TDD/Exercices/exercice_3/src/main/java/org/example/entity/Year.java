package org.example.entity;
public class Year {

    public boolean yearIsLeapYear(int year){
        if ((year%4000 == 0) || year%4 == 0 && year%100 != 0 || year%400 == 0){
            return true;
        }else {
            return false;
        }
    }


}
