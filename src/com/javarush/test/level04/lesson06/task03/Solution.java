package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        String num2 = reader.readLine();
        String num3 = reader.readLine();

        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);

        if (a < b && a < c)   {
            if (b < c)
                System.out.println(c + " " + b + " " + a);
            else
                System.out.println(b + " " + c + " " + a);
         }
        if (b < a && b < c)   {
            if (a < c)
                System.out.println(c + " " + a + " " + b);
            else
                System.out.println(a + " " + c + " " + b);
        }
        if (c < a && c < b)   {
            if (a < b)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(a + " " + b + " " + c);
        }

    }
}
