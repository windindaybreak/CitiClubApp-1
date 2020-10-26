package com.example.citiclubapp.Entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

/**
 * 构建仓单的实体类方便之后的数据处理
 */


@Entity(tableName = "Warrant"
)
public class Warrant implements Serializable {
    @NonNull
    @PrimaryKey()
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
    @ColumnInfo(name = "preparingDate")
    private String preparingDate;//填发日期(xxxx年xx月xx日）
    @ColumnInfo(name = "StorageCompany")
    private String StorageCompany;//仓储公司(填发地）
    @ColumnInfo(name = "value")
    private int value;//折合市值
    @ColumnInfo(name = "debtvalue")
    private int debtvalue;//贷款额
    @ColumnInfo(name = "isZhiya")
    private boolean isZhiya;//能否质押，能true，不能false
    @ColumnInfo(name = "conditionNode")
    private  int conditionNode;//当前状态
    @ColumnInfo(name = "isConditionChange")
    private boolean isConditionChange;//状态改变的标志
    @Ignore
    public static int count = 0;//总单数

    public Warrant(int warrantID, int companyAccount, String cargoItem, int cargoWeight,
                   String owner, int storageExpand, String storagePlace,
                   String preparingPlace, String preparingDate, String storageCompany,
                   int value, int debtvalue, int conditionNode, boolean isConditionChange) {
        this.warrantID = warrantID;
        this.companyAccount = companyAccount;
        this.cargoItem = cargoItem;
        this.cargoWeight = cargoWeight;
        this.owner = owner;
        this.storageExpand = storageExpand;
        StoragePlace = storagePlace;
        this.preparingPlace = preparingPlace;
        this.preparingDate = preparingDate;
        StorageCompany = storageCompany;
        this.value = value;
        this.debtvalue = debtvalue;
        this.conditionNode = conditionNode;
        this.isConditionChange = isConditionChange;
    }


    public Warrant() {

    }
    public int getConditionNode() {
        return conditionNode;
    }

    public void setConditionNode(int conditionNode) {
        this.conditionNode = conditionNode;
    }

    public boolean isConditionChange() {
        return isConditionChange;
    }

    public void setConditionChange(boolean conditionChange) {
        isConditionChange = conditionChange;
    }

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

    public String getPreparingDate() {
        return preparingDate;
    }

    public void setPreparingDate(String date) {
        this.preparingDate = date;
    }

    public void setPreparingDate(int year, int month, int day) {

        setPreparingDate(year + "年" + month + "月" + "日");
    }


}
