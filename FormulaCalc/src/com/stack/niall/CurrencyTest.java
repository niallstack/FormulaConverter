/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stack.niall;

/**
 *
 * @author niall
 */
public class CurrencyTest {
    public static void main(String args[]){
        float answer = Conversions.EuroToDollar(5);
        float roundOff = (float) ((double) Math.round(answer * 100) / 100);
        System.out.println("Euro to Dollar: "+roundOff);
        
        float answer2 = Conversions.DollarToEuro(5);
        float roundOff2 = (float) ((double) Math.round(answer2 * 100) / 100);
        System.out.println("Dollar to Euro: "+roundOff2);
        
        float answer3 = Conversions.EuroToGBP(5);
        float roundOff3 = (float) ((double) Math.round(answer3 * 100) / 100);
        System.out.println("Euro to Pounds: "+roundOff3);
        
        float answer4 = Conversions.GBPToEuro(5);
        float roundOff4 = (float) ((double) Math.round(answer4 * 100) / 100);
        System.out.println("Pounds to Euro: "+roundOff4);
    }
}
