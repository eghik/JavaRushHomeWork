package otherhomework.arrays.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 30.08.13
 * Time: 11:37
 Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
 Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
public class work13
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите натуральное число больше трех:");
        int n;
        while(true)
        {
            n = Integer.parseInt(reader.readLine());
            if (n > 3)
                break;
            else
                System.out.println("Введите натуральное число больше трех:");
        }
        System.out.println("Массив из " + n + " чисел из отрезка [0;" + n + "]. ");
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++)
        {
            array[i]=Math.floor(Math.random()*(n+1));
            System.out.print(array[i] + " ");
        }


    }
}
