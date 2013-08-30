package otherhomework.arrays.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 17:23
 * Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
 * Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
 * Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */
public class work10
{
    public static void main (String[] args)
    {
        double[] array = new double[10];
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < array.length; i++)
        {
            array[i]=Math.floor(Math.random()*3-1);
            System.out.print(array[i]+ " ");
        }
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 0.0)
                a++;
            else if (array[i]  == -1.0)
                b++;
            else c++;
        }
        System.out.println();
        System.out.println( "0 встречается " + a + " раз. -1.0 встречается " + b + " раз. 1.0 встречается " + c + " раз.");

        if (a > b && a > c)
            System.out.println("Чаще встречается 0.0");
        else if (b >a && b > c)
            System.out.println("Чаще встречается -1.0" );
        else if (c > a && c > b)
            System.out.println("Чаще встречается 1.0");
        else
            System.out.println("Есть одинаково встречающиеся числа");


    }
}
