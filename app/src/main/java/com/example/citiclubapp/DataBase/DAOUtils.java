package com.example.citiclubapp.DataBase;

import android.content.Context;

public class DAOUtils {
    public static CompanyInfoDAO getCompanyInfoDao(Context context) {
        return CangdanBaoDB.getInstance(context).getCompanyInfoDAO();
    }
    public static WarrantDAO getWarrantDao(Context context) {
        return CangdanBaoDB.getInstance(context).getWarrantDAO();
    }
}
