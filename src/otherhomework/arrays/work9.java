package otherhomework.arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 17:06
 * Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
 * Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
 * к элементу из второго массива с i-ым индексом.
 * Вывести все три массива на экран (каждый на отдельной строке),
 * затем вывести количество целых элементов в третьем массиве.
 */
public class work9
{
    public static void main(String[] args)
    {
        int N = 10;
        double[] array1 = new double[N];
        double[] array2 = new double[N];
        double[] array3 = new double[N];
        int num = 0;

        for (int i = 0; i < N; i++ )
        {
            array1[i] = Math.floor(Math.random()*9+1);
            array2[i] = Math.floor(Math.random()*9+1);
            array3[i] = array1[i]/array2[i];
                if (array3[i] % 1 == 0)
                    num++;
        }
        for (int i = 0; i < N; i++ )
        {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < N; i++ )
        {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < N; i++ )
        {
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.println("Число целых чисел равно " + num);
    }
}
