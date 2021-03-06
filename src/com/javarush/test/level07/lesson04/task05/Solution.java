package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int N = 20;
        int M = 10;
        int[] arrInt = new int[N];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arrInt.length; i++)
        {
            arrInt[i] = Integer.parseInt(reader.readLine());
        }

        int[] arrMiniInt = new int[M];
        int[] arrMiliInt = new int[M];

        for (int i = 0; i < arrInt.length/2 ; i++)
        {
            arrMiniInt[i] = arrInt[i];
        }

        for (int i = arrInt.length/2, j=0; i < arrInt.length; i++, j++)
        {
            arrMiliInt[j] = arrInt[i];
        }

        for (int i = 0; i < arrMiliInt.length; i++)
        {
        System.out.println(arrMiliInt[i]);
        }
    }
}
