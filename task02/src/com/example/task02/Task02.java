package com.example.task02;


import java.util.Scanner;
public class Task02
{

    public static String solution(String   input)
    {

        double x =  Double.valueOf(input);
        String s = "";
        if( x >= -128 && x <= 127 )
        {
            byte y = 0;
            x = y;
            s = "byte";
        }
        else if( x >= -32768 && x <= 32767)
        {
            short y = 0;
            x = y;
            s = "short";
        }
        else if( x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE)
        {
            int y = 0;
            x = y;
            s = "int";
        }
        else if( x >= Long.MIN_VALUE && x <= Long.MAX_VALUE)
        {
            long y = 0;
            x = y;
            s = "long";
        }
        else if( x >= Float.MIN_VALUE && x <= Float.MAX_VALUE)
        {
            float y = 0;
            x = y;
            s = "float";
        }
        else if( x >= Double.MIN_VALUE && x <= Double.MAX_VALUE)
        {
            s = "double";
        }

        return s;
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
