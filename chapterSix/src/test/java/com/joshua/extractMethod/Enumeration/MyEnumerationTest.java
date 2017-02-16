package com.joshua.extractMethod.Enumeration;

import org.junit.Test;

import java.util.Enumeration;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/2/16.
 */
public class MyEnumerationTest {

    @Test
    public void enumerationTest(){
        //实例化MyDataStruct类型的对象
        MyDataStruct myDataStruct = new MyDataStruct();
        //得到描述myDataStruct类型对象的enumeration对象
        Enumeration enumeration =myDataStruct.getEnum();
        //使用对象循环显示myDataStruct类型的对象中的每一个元素
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}