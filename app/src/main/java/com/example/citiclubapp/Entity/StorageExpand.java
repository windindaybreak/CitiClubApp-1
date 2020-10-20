package com.example.citiclubapp.Entity;

/**
 * 用于记录货物存储的期限
 */
public class StorageExpand {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setStorageExpand(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public String returnExpand(){
        String t=String.valueOf(year)+"年"+String.valueOf(month)+"月"+String.valueOf(day)+"日";
        return t;
    }
}
