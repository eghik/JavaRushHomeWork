package otherhomework.arrays.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 14:24
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках.
 * Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 * для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */
public class work5
{
    public static void main(String[] args)
    {
        int N = 5;
        double[] arr1 = new double[N];
        double[] arr2 = new double[N];
        double arfm1 = 0;
        double arfm2 = 0;
        double sum1 = 0;
        double sum2 = 0;

        for (int i = 0; i < arr1.length; i ++)
        {
            arr1[i] = Math.floor(Math.random() * 5);
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i ++)
        {
            arr2[i] = Math.floor(Math.random() * 5);
            System.out.print(arr2[i] + " ");
        }

        for (int i = 0; i < N; i ++)
        {
            sum1 = sum1 + arr1[i];
            sum2 = sum2 + arr1[i];
        }

        arfm1 = sum1/arr1.length;
        arfm2 = sum2/arr2.length;

        System.out.println();

        if (arfm1 > arfm2)
            System.out.println("Среднее арифметическое первого массива больше " + arfm1 + " > " + arfm2);
        else if (arfm1 < arfm2)
            System.out.println("Среднее арифметическое второго массива больше " + arfm1 + " < " + arfm2);
        else
            System.out.println("Среднее арифметическое массивов равны " + arfm1 + " = " + arfm2);





    }

}
