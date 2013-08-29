package otherhomework.arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 13:58
 Создайте массив из 15 случайных целых чисел из отрезка [0;9].
 Выведите массив на экран.
 Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */
public class work3
{
    public static void main (String[] arsg)
    {
        double[] array = new double[15];

        for (int i = 0; i < array.length; i++)
        {
            array[i] =  Math.floor(Math.random() * 10);
            System.out.print(array[i] + "  ");
        }

        int odd = 0;
        int enu = 0;

        for (int i = 0; i < array.length; i++)
        {

            if (array[i] % 2 == 0)
                odd++;
            else enu++;

        }
        System.out.println();
        System.out.println( "Количество четных чисел " + odd );
        System.out.println( "Количество нечетных чисел " + enu );

    }
}
