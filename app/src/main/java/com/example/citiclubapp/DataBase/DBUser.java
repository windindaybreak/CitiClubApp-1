package com.example.citiclubapp.DataBase;

import android.content.Context;

import androidx.room.util.DBUtil;

import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.Entity.Warrant;

import java.util.ArrayList;

/**
 * 数据库使用类
 */
public class DBUser {
    //向两个数据表中插入数据
    public void insert(CompanyInfo companyInfo, Context context){
        DAOUtils.getCompanyInfoDao(context).insertCompanyInfo(companyInfo);
    }
    public void insert(Warrant warrant,Context context){
        DAOUtils.getWarrantDao(context).insertWarrnts(warrant);
    }
    //返回两个表中的所有数据
    public CompanyInfo[] returnAllCompanyInfo(Context context){
        return DAOUtils.getCompanyInfoDao(context).loadAllCompanyInfo();
    }
    public Warrant[] returnAllWarrant(Context context){
        return  DAOUtils.getWarrantDao(context).loadAllWarrant();
    }
    //删除两表中特定数据
    public void DeleteFromCompanyInfo(Context context,int accountID){
        DAOUtils.getCompanyInfoDao(context).deleteExactInfo(accountID);
    }
    public  void DeleteFronWarrant(Context context,int warrantID){
        DAOUtils.getWarrantDao(context).deleteExactWarrant(warrantID);
    }

    //获取可销售（condition不为8）的Warrant
    public Warrant[] getSaleableWarrant(Context context){
        return  DAOUtils.getWarrantDao(context).getSaleableWarrant();
    }
    public CompanyInfo findCompanyByID(Context context,int accountID){
        return DAOUtils.getCompanyInfoDao(context).loadExactInfo(accountID);
    }
    public CompanyInfo[] findCompanyByName(Context context,String name){
        return DAOUtils.getCompanyInfoDao(context).loadExactInfo(name);
    }
    public Warrant findWarrantByID(Context context,int warrantID){
        return  DAOUtils.getWarrantDao(context).findWarrantinfoByid(warrantID);
    }
    public Warrant[] findWarrantByCompany(Context context,int companyAccount){
        return  DAOUtils.getWarrantDao(context).findWarrantByCompany(companyAccount);
    }
    public Warrant[] findNoticeWarrantByCompany(Context context,int companyAccount){
        return  DAOUtils.getWarrantDao(context).findNoticeWarrantinfoByid(companyAccount,true);
    }
}
