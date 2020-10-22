package com.example.citiclubapp.Entity;

import android.graphics.Bitmap;

/**
 * 公司基本信息
 */
public class CompanyInfo {
    String creditNumber;//统一社会信用代码
    String companyName;//公司名称
    String registerNum;//工商注册号
    String regiterAuthority;//工商注册机关
    String regiterCondition;//登记状态
    String taxRegisterNumber;//税务登记证号
    String companyAddress;//公司地址
    long companyPhoneNumber;//公司电话
    Bitmap ID_card_zheng,ID_card_fan;//身份证正反面图片
    Bitmap lisence;//营业执照图片
    String legalPersonName;//法人姓名
    String legalPersonID;//法人证字号号
    String legalPersonPhone;//法人联系电话
    String bankAccount;//银行账号

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

    public Bitmap getID_card_zheng() {
        return ID_card_zheng;
    }

    public void setID_card_zheng(Bitmap ID_card_zheng) {
        this.ID_card_zheng = ID_card_zheng;
    }

    public Bitmap getID_card_fan() {
        return ID_card_fan;
    }

    public void setID_card_fan(Bitmap ID_card_fan) {
        this.ID_card_fan = ID_card_fan;
    }

    public Bitmap getLisence() {
        return lisence;
    }

    public void setLisence(Bitmap lisence) {
        this.lisence = lisence;
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
