package com.example.citiclubapp.Entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 用来记录仓单入库的状态
 */
public class condition {
    private static Map<Integer,String> conditonMap;
    public static final int REQUEST=0;
    public static final int WAIT_FOR_CHECK=1;
    public static final int SIGN_ASSIGNMENT=2;
    public static final int SEND_CARGO=3;
    public static final int CERTIFICATE_CARGO=4;
    public static final int MAKE_WARRANT=5;
    public static final int GURANTEE=6;
    public static final int FINISH=7;
    static {
        conditonMap.put(0,"申请");
        conditonMap.put(1,"等待审核");
        conditonMap.put(2,"签署合同");
        conditonMap.put(3,"发货");
        conditonMap.put(4,"仓储公司确认收货");
        conditonMap.put(5,"制单");
        conditonMap.put(6,"担保机构背书");
        conditonMap.put(7,"已生成");
    }
    private int currentConditionNode;
    public condition() {
        this.currentConditionNode = 0;
    }
    public condition(int currentConditionNode) {
        this.currentConditionNode = currentConditionNode;
    }
    public String getCondition(int number){
        Integer integer=number;
        String result=conditonMap.get(integer);
        return result;
    }
    public int getKeyByValue(String value){
        Set<Integer> keys=conditonMap.keySet();
        Iterator<Map.Entry<Integer, String>> it = conditonMap.entrySet().iterator();
        int result=-1;
        while(it.hasNext()){
            Map.Entry<Integer, String> entry=it.next();
            String res=entry.getValue();
            if(res.equals(value)) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
    public void setCurrentConditionNode(int node){
        currentConditionNode=node;
    }

    public String getValue(int id) {
        return conditonMap.get(id);
    }
}
