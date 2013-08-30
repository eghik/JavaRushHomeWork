package otherhomework.arrays.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 16:51
 * Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 * Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
public class work8
{
    public static void main(String[] args)
    {
        double[] array = new double[12];
        double max = array[0];
        int imax = 0;

        for (int i = 0; i < array.length; i++)
        {
            array[i] = Math.floor((Math.random()*31-15));
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
                imax = i;
            }
        }
        System.out.println(imax);
    }
}
