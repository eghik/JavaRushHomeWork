package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        String number1 = reader.readLine();
        String number2 = reader.readLine();

        int nnumber1 = Integer.parseInt(number1);
        int nnumber2 = Integer.parseInt(number2);

        if (nnumber1 < nnumber2)
            System.out.println(nnumber1);
        else
            System.out.println(nnumber2);

    }
}