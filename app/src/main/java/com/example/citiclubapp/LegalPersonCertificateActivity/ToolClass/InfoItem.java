package com.example.citiclubapp.data.model;


public class InfoItem {
    private int type;
    private String item_name;
    private String item_content_hint;
    public InfoItem(String item_name,int type){
        this.item_name = item_name;
        this.type = type;
    }

    public InfoItem(String item_name,String hint,int type){
        this.item_name = item_name;
        this.type = type;
        this.item_content_hint = hint;
    }
    public String getInfoName(){
        return item_name;
    }
    public String getItem_content_hint(){
        return item_content_hint;
    }
    public int getItemType(){
        return -1;
    }

    public Infoitem_2 getInfoItem2(){
        return new Infoitem_2(item_name,item_content_hint);
    }

    public InfoItem_1 getInfoItem1(){
        return new InfoItem_1(item_name,item_content_hint);
    }

    public int getType(){
        return type;
    }


};





