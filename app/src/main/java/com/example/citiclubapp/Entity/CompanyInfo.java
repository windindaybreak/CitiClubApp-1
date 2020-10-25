package com.example.citiclubapp.Entity;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;

/**
 * 公司基本信息
 */

@Entity(tableName = "CompanyInfo", //表名
        primaryKeys = {"accountID"},//主键
        indices = {//索引
                @Index(value = "accountID", unique = true) //唯一性
        })
public class CompanyInfo {
    @NonNull
    @ColumnInfo(name = "accountID")
    int accountID;//账户ID（主键）
    @ColumnInfo(name = "creditNumber")
    String creditNumber;//统一社会信用代码
    @ColumnInfo(name = "companyName")
    String companyName;//公司名称
    @ColumnInfo(name = "conditionNode")
    int conditionNode;//状态码
    @ColumnInfo(name = "registerNum")
    String registerNum;//工商注册号
    @ColumnInfo(name = "regiterAuthority")
    String regiterAuthority;//工商注册机关
    @ColumnInfo(name = "regiterCondition")
    String regiterCondition;//登记状态
    @ColumnInfo(name = "taxRegisterNumber")
    String taxRegisterNumber;//税务登记证号
    @ColumnInfo(name = "companyAddress")
    String companyAddress;//公司地址
    @ColumnInfo(name = "companyPhoneNumber")
    long companyPhoneNumber;//公司电话
    @ColumnInfo(name = "legalPersonName")
    String legalPersonName;//法人姓名
    @ColumnInfo(name = "legalPersonID")
    String legalPersonID;//法人证字号号
    @ColumnInfo(name = "legalPersonPhone")
    String legalPersonPhone;//法人联系电话
    @ColumnInfo(name = "bankAccount")
    String bankAccount;//银行账号
    @Ignore
    static int count=0;//总账户数

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getConditionNode() {
        return conditionNode;
    }

    public void setConditionNode(int conditionNode) {
        this.conditionNode = conditionNode;
    }
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(String registerNum) {
        this.registerNum = registerNum;
    }

    public String getRegiterAuthority() {
        return regiterAuthority;
    }

    public void setRegiterAuthority(String regiterAuthority) {
        this.regiterAuthority = regiterAuthority;
    }

    public String getRegiterCondition() {
        return regiterCondition;
    }

    public void setRegiterCondition(String regiterCondition) {
        this.regiterCondition = regiterCondition;
    }

    public String getTaxRegisterNumber() {
        return taxRegisterNumber;
    }

    public void setTaxRegisterNumber(String taxRegisterNumber) {
        this.taxRegisterNumber = taxRegisterNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public long getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(long companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String getLegalPersonName() {
        return legalPersonName;
    }

    public void setLegalPersonName(String legalPersonName) {
        this.legalPersonName = legalPersonName;
    }

    public String getLegalPersonID() {
        return legalPersonID;
    }

    public void setLegalPersonID(String legalPersonID) {
        this.legalPersonID = legalPersonID;
    }

    public String getLegalPersonPhone() {
        return legalPersonPhone;
    }

    public void setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone;
    }
}
