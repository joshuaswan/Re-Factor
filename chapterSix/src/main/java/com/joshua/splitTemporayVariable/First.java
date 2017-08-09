package com.joshua.splitTemporayVariable;

/**
 * Created by joshua on 2017/8/9.
 */
public class First {

    private double _height;
    private double _width;

    public First(double _height, double _width) {
        this._height = _height;
        this._width = _width;
    }

    public void printPerimeterArea(){
        double temp = 2 * (_height + _width);
        System.out.println(temp);
        temp = _height * _width;
        System.out.println(temp);
    }

    public void rePrintPerimeterArea(){
        final double perimeter =  2 * (_height + _width);
        System.out.println(perimeter);
        final double area = _height * _width;
        System.out.println(area);
    }
}
