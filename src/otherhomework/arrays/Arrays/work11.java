package otherhomework.arrays.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 17:41
 *Пользователь должен указать с клавиатуры чётное положительное число,
 *  а программа должна создать массив указанного размера из случайных целых чисел из [-5;5]
 *  и вывести его на экран в строку. После этого программа должна определить
 *  и сообщить пользователю о том, сумма модулей какой половины массива больше:
 *  левой или правой, либо сообщить, что эти суммы модулей равны.
 *  Если пользователь введёт неподходящее число, то программа должна требовать
 *  повторного ввода до тех пор, пока не будет указано корректное значение.
 */
public class work11
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N;
        int m1 = 0;
        int m2 = 0;

        while (true)
        {
            N = Integer.parseInt(reader.readLine());
            if (N % 2 == 0 && N > 0)
                break;
            else
                System.out.println("Введите положительное четное число ");
        }

        System.out.println(N); //проверка, что выводит цикл

        double[] array = new double[N];

        for (int i = 0; i < N; i ++)  //заполнение массива числами от -5 до 5
        {
            array[i] = Math.floor(Math.random()*11-5);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < N/2; i ++)
        {
            m1 += Math.abs(array[i]);
        }
        for (int i = N/2; i < N; i ++)
        {
            m2 += Math.abs(array[i]);
        }
        System.out.println("Сумма модуля первой половины массива равна " + m1);
        System.out.println("Сумма модуля второй половины массива равна " + m2);

        if (m1 > m2)
            System.out.println("Сумма модуля первой половины больше второй");
        else if (m1 == m2)
            System.out.println("Суммы модулей равны");
        else
            System.out.println("Сумма модуля второй половины больше первой");


    }

}
