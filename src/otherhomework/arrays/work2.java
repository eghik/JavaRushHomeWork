package otherhomework.arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 13:47
 *Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
public class work2
{
    public static void main (String[] args)
    {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = 1 + 2*i;
        }

        for (int i = 0 ; i < array.length; i++ )
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0 ; i < array.length; i++)
        {
            int j = array.length - i - 1;
            System.out.print(array[j] + " ");

        }

    }
}
