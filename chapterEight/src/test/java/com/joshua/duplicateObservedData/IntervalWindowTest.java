package com.joshua.duplicateObservedData;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/15.
 */
public class IntervalWindowTest {

    @Test
    public void intervalWindowTest(){
        IntervalWindow intervalWindow = new IntervalWindow("test",new TextField("0"),new TextField("0"),new TextField("0"));

        intervalWindow.setVisible(true);
        while (true){

        }
    }

    @Test
    public void frameTest(){
        Frame frame = new Frame("testFrame");

        frame.setSize(100,100);
        frame.setVisible(true);
    }
}