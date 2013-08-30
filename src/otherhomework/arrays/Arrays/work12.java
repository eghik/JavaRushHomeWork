package otherhomework.arrays.Arrays;

/**   переделать!!! работает не правильно
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 30.08.13
 * Time: 11:02
 * Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
 * чтобы отрицательных и положительных элементов там было поровну и не было нулей.
 * При этом порядок следования элементов должен быть случаен
 * (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных,
 * а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
 * Вывести полученный массив на экран.
 */
public class work12
{
    public static void main(String[] args)
    {
        double[] array = new double[12];
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < array.length; i++)
        {
            double N = Math.floor(Math.random()*21-10);
            System.out.print(N + " ");
            if (N > 0 && pos <= 6)
            {
                array[i]=N;
                pos++;
            }
            else if (N < 0 && neg <= 6)
                    {
                    neg++;
                    array[i]=N;
                    }
            else
                break;
        }

        System.out.println();

        for (int i = 0; i < array.length; i++)
        {
        System.out.print(array[i] + " ");
        }
    }
}
