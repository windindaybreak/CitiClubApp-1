package com.example.citiclubapp.Entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * 用来记录仓单入库的状态
 */
public class condition {
    private static Map<Integer,String> conditonMap;
    static {
        conditonMap.put(new Integer(0),"申请");
        conditonMap.put(new Integer(1),"等待审核");
        conditonMap.put(new Integer(2),"签署合同");
        conditonMap.put(new Integer(3),"发货");
        conditonMap.put(new Integer(4),"仓储公司确认收货");
        conditonMap.put(new Integer(5),"制单");
        conditonMap.put(new Integer(6),"担保机构背书");
        conditonMap.put(new Integer(7),"已生成");
    }
    private int currentConditionNode;

    public condition(int currentConditionNode) {
        this.currentConditionNode = currentConditionNode;
    }
}
