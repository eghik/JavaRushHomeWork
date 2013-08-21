package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);

        if(a < b && a < c && b < c)
            System.out.println(b);
        else if(b < a && b < c && a < c)
            System.out.println(a);
        else if(c < b && c < a && b < a)
            System.out.println(b);
        else if(c < a && c < b && a < b)
            System.out.println(a);
        else if(a < c && a < b && c < b)
            System.out.println(c);
        else if(b < c && b < a && c < a)
            System.out.println(c);





    }
}
