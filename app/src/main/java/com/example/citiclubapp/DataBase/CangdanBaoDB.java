package com.example.citiclubapp.DataBase;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.citiclubapp.Entity.CompanyInfo;
import com.example.citiclubapp.Entity.Warrant;

@Database(entities = {CompanyInfo.class, Warrant.class}, version = 1, exportSchema = false)

public abstract class CangdanBaoDB extends RoomDatabase {

    private static CangdanBaoDB cangdanBaoDB;

    public static CangdanBaoDB getInstance(Context context) {
        if (cangdanBaoDB == null) {
            synchronized (CangdanBaoDB.class) {
                if (cangdanBaoDB == null) {
                    cangdanBaoDB = Room.databaseBuilder(context.getApplicationContext(), CangdanBaoDB.class,
                            "CangDanBao.db")
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return cangdanBaoDB;

    }

    public static void onDestroy() {
        cangdanBaoDB = null;
    }

    public abstract CompanyInfoDAO getCompanyInfoDAO();
    public abstract WarrantDAO getWarrantDAO();
}
