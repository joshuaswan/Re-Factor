package com.joshua.extractMethod.Enumeration;

import java.util.Enumeration;

/**
 * Created by joshua on 2017/2/16.
 */
public class MyEnumeration implements Enumeration {
    int count;
    int length;
    Object[] dataArray;

    /**
     * Constructor
     * @param count
     * @param length
     * @param dataArray
     */
    public MyEnumeration(int count, int length, Object[] dataArray) {
        //计数器
        this.count = count;
        //存储的数组的长度
        this.length = length;
        //存储数据数组的引用
        this.dataArray = dataArray;
    }

    @Override
    public boolean hasMoreElements() {
        return count<length;
    }

    @Override
    public Object nextElement() {
        return dataArray[count++];
    }
}
