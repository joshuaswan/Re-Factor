package com.joshua.extractMethod.Enumeration;

import java.util.Enumeration;

/**
 * Created by joshua on 2017/2/16.
 */
public class MyDataStruct {
    String[] data;

    /**
     * Constructor
     */
    public MyDataStruct() {
        data = new String[4];
        data[0] = "zero";
        data[1] = "one";
        data[2] = "two";
        data[3] = "three";
    }

    // 返回一个enumeration对象给使用程序
    public Enumeration getEnum(){
        return new MyEnumeration(0,data.length,data);
    }
}
