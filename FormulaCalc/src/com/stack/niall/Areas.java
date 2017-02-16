/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stack.niall;

/**
 *
 * @author t00174406
 */
public class Areas {
    public static double Triangle(double base, double height)
    {
        double answer = (base * height) / 2;
        return answer;
    }
    public static double Circle(double radius)
    {
        double answer = Math.PI * (radius * radius);
        return answer;
    }
    public static double Rectangle(double length, double width)
    {
        double answer = length * width;
        return answer;
    }
    public static double Parallelogram(double base, double height)
    {
        double answer = base * height;
        return answer;
    }
}
