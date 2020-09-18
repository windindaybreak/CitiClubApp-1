package com.example.citiclubapp.data.model;

public class Infoitem_2 {
    String item_name;
    String text;
    public Infoitem_2(String item_name,String hint) {
        this.item_name = item_name;
        text = hint;
    }
    public String getText(){
        return text;
    }
}
