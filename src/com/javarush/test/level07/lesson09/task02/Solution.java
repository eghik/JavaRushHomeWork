package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int N = 5;
       ArrayList<String>list =  new ArrayList<String>();
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       for (int i = 0; i < N; i++)
       {
           list.add(reader.readLine());
       }
        for (int i = 0; i < list.size(); i++)
        {
            int M = list.size() - i - 1;
            System.out.println(list.get(M));
        }

    }
}
