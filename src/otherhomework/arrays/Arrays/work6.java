package otherhomework.arrays.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 15:07
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
 * Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
public class work6
{
    public static void main(String[] args)
    {
        double[] array= new double[4];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Math.floor((int)(Math.random()*89+10));
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean ascending = true;
        for (int i=1; i< array.length; i++) {
            if(array[i]<array[i-1]) {
                ascending = false;
            }
        }

        System.out.println("Последовательность возрастающая " + ascending);
    }
}
