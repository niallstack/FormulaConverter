package com.stack.niall;

/**
 *
 * @author niall
 */
public class Conversions { 
    //decimal to hex code from http://introcs.cs.princeton.edu/java/31datatype/Hex2Decimal.java.html
    public static String decimalToHex(int d) 
    {
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;                // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            d = d / 16;
        }
        return hex;
    }
    //hex to decimal code from http://introcs.cs.princeton.edu/java/31datatype/Hex2Decimal.java.html
    public static int hexToDecimal(String s) 
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public static double FahrenheitToCelius(int fTemp)
    {
        double answer = ((fTemp-32) * 0.5556);
        return answer;
    }
    public static double CelciusToFahrenheight(int cTemp)
    {
        double answer = ((cTemp*1.8)+32);
        return answer;
    }
    public static float EuroToDollar(float euro)
    {
        ExchangeRate exchange = new ExchangeRate();
        
        double rateUsd = exchange.getEuroUsdRate();
        float answer = (float) (euro*rateUsd);
        return answer;
    }
    public static float DollarToEuro(float dollar)
    {
        ExchangeRate exchange = new ExchangeRate();
        
        double rateEuro = exchange.getUsdEuroRate();
        float answer = (float) (dollar*rateEuro);
        return answer;
    }
    public static float EuroToGBP(float euro)
    {
        ExchangeRate exchange = new ExchangeRate();
        
        double rateEuro = exchange.getEuroGBPRate();
        float answer = (float) (euro*rateEuro);
        return answer;
    }
    public static float GBPToEuro(float pound)
    {
        ExchangeRate exchange = new ExchangeRate();
        
        double ratePound = exchange.getGBPEuroRate();
        float answer = (float) (pound*ratePound);
        return answer;
    }
    
}