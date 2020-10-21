package com.example.citiclubapp.Entity;

import java.util.Date;

/**
 * 构建仓单的实体类方便之后的数据处理
 */
public class warrant {
    private String warrantID;//仓单号
    private String cargoItem;//货物种类
    private int cargoWeight;//货物重量
    private String owner;//存货人
    private StorageExpand storageExpand;//货物存储期限，年 月 日
    private String StoragePlace;//存储地点
    private String preparingPlace;//填发
    private Date preparingDate;//填发日期
    private String StorageCompany;//仓储公司
    private  int value;//折合市值
    private  int debtvalue;//贷款额
    private boolean isZhiya;//能否质押，能true，不能false

    public boolean isZhiya() {
        return isZhiya;
    }

    public void setZhiya(boolean zhiya) {
        isZhiya = zhiya;
    }

    public warrant() {
        isZhiya=true;
    }

    public String getStorageCompany() {
        return StorageCompany;
    }

    public void setStorageCompany(String storageCompany) {
        StorageCompany = storageCompany;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getDebtvalue() {
        return debtvalue;
    }

    public void setDebtvalue(int debtvalue) {
        this.debtvalue = debtvalue;
    }


    public String getWarrantID() {
        return warrantID;
    }

    public void setWarrantID(String warrantID) {
        this.warrantID = warrantID;
    }

    public String getCargoItem() {
        return cargoItem;
    }

    public void setCargoItem(String cargoItem) {
        this.cargoItem = cargoItem;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public StorageExpand getStorageExpand() {
        return storageExpand;
    }

    public void setStorageExpand(int year,int month, int day) {
        this.storageExpand = new StorageExpand();
        this.storageExpand.setStorageExpand(year,month,day);
    }

    public String getStoragePlace() {
        return StoragePlace;
    }

    public void setStoragePlace(String storagePlace) {
        StoragePlace = storagePlace;
    }

    public String getPreparingPlace() {
        return preparingPlace;
    }

    public void setPreparingPlace(String preparingPlace) {
        this.preparingPlace = preparingPlace;
    }

    public Date getPreparingDate() {
        return preparingDate;
    }

    public void setPreparingDate(int year,int month,int day) {
        this.preparingDate = new Date(year,month,day);
    }


}
