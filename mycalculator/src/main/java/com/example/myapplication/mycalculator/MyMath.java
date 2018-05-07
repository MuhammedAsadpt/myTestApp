package com.example.myapplication.mycalculator;

public class MyMath
{
    public static int plus(int a,int b)
    {
        return a+b;
    }
    public static int Minus(int a,int b)
    {
        return a-b;
    }
    public static int Times(int a,int b)
    {
        return a*b;
    }
    public static int Div(int a,int b)
    {
        if(b==0)
            throw new IllegalArgumentException("Div by zero error");
        else
        return a/b;
    }
}
