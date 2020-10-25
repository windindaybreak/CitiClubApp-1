package com.example.citiclubapp.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;

import java.util.Date;

/**
 * 构建仓单的实体类方便之后的数据处理
 */


@Entity(tableName = "Warrant",
        primaryKeys = "warrantID"
        )
public class Warrant {
    @NonNull
    @ColumnInfo(name = "warrantID")
    private int warrantID;//仓单号(主键）
    @ColumnInfo(name = "companyAccount")
    private int companyAccount;//所属公司
    @ColumnInfo(name = "cargoItem")
    private String cargoItem;//货物种类
    @ColumnInfo(name = "cargoWeight")
    private int cargoWeight;//货物数量
    @ColumnInfo(name = "owner")
    private String owner;//存货人
    @ColumnInfo(name = "storageExpand")
    private int storageExpand;//货物存储期限(年)
    @ColumnInfo(name = "StoragePlace")
    private String StoragePlace;//存储地点
    @ColumnInfo(name = "preparingPlace")
    private String preparingPlace;//填发
//    @ColumnInfo(name = "preparingDate")
//    private Date preparingDate;//填发日期
    @ColumnInfo(name = "StorageCompany")
    private String StorageCompany;//仓储公司(填发地）
    @ColumnInfo(name = "value")
    private  int value;//折合市值
    @ColumnInfo(name = "debtvalue")
    private  int debtvalue;//贷款额
    @ColumnInfo(name = "isZhiya")
    private boolean isZhiya;//能否质押，能true，不能false
    @Ignore
    public static int count=0;//总单数

    public int getCompanyAccount() {
        return companyAccount;
    }

    public void setCompanyAccount(int companyAccount) {
        this.companyAccount = companyAccount;
    }

    public boolean isZhiya() {
        return isZhiya;
    }

    public void setZhiya(boolean zhiya) {
        isZhiya = zhiya;
    }

    public Warrant() {
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


    public int getWarrantID() {
        return warrantID;
    }

    public void setWarrantID(int warrantID) {
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

    public int getStorageExpand() {
        return storageExpand;
    }

    public void setStorageExpand(int storageExpand) {
        this.storageExpand = storageExpand;
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

//    public Date getPreparingDate() {
//        return preparingDate;
//    }
//
//    public void setPreparingDate(int year,int month,int day) {
//        this.preparingDate = new Date(year,month,day);
//    }


}
