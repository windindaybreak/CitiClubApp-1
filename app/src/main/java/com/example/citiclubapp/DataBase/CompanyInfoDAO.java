package com.example.citiclubapp.DataBase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.citiclubapp.Entity.CompanyInfo;

import java.util.List;

/**
 * 构建DAO接口
 */
@Dao
public interface CompanyInfoDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertCompanyInfo(CompanyInfo... users);

    @Update
    public void updateCompanyInfo(CompanyInfo... users);
    @Query("SELECT * FROM CompanyInfo")
    public CompanyInfo[] loadAllCompanyInfo();
    @Query("SELECT * FROM CompanyInfo WHERE accountID =:id")
    public CompanyInfo loadExactInfo(int id);
    @Query("DELETE  FROM CompanyInfo WHERE accountID =:id")
    public void deleteExactInfo(int id);
    @Query("SELECT * FROM CompanyInfo WHERE companyName=:name")
    public CompanyInfo[] loadExactInfo(String name);
}
