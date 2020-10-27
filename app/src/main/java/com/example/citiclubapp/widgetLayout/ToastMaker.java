package com.example.citiclubapp.widgetLayout;

import android.content.Context;
import android.widget.Toast;

public class ToastMaker {
    public final static void makeShortToast(String string, Context context){
        Toast.makeText(context,string,Toast.LENGTH_SHORT).show();
    }
    public final static void makeLongToast(String string, Context context){
        Toast.makeText(context,string,Toast.LENGTH_LONG).show();
    }
}
