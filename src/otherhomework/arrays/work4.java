package otherhomework.arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 14:07
 Создайте массив из 8 случайных целых чисел из отрезка [1;10].
 Выведите массив на экран в строку.
 Замените каждый элемент с нечётным индексом на ноль.
 Снова выведете массив на экран на отдельной строке.
 */
public class work4
{
    public static void main (String[] args)
    {
        double[] array = new double[8];

        for (int i = 0; i < array.length; i++)
        {
            array[i] =  Math.floor(Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
            {}
            else array[i] = 0.0;

            System.out.print(array[i] + " ");
        }

    }
}
