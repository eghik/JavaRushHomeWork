package com.javarush.test.level03.lesson06.task01;

public class Solution
{
    public static void main(String[] args)
    {
       String a = "Мама";
       String b = "Мыла";
       String c = "Раму";

       System.out.println(a + " " + b + " " + c );
       System.out.println(a + " " + c + " " + b );
       System.out.println(b + " " + a + " " + c );
       System.out.println(b + " " + c + " " + a );
       System.out.println(c + " " + a + " " + b );
       System.out.println(c + " " + b + " " + a );
    }
}