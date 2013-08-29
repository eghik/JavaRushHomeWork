package otherhomework.arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 16:34
 * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
 * Напоминаем, что первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
public class work7
{
    public static void main (String[] args)
    {
        int[] array = new int[20];

        array[0] =1;
        array[1] =1;
        for (int i = 2; i < array.length; i++)
    {
        array[i] = array[i-2]+array[i-1];

    }
        for (int i = 0; i < array.length; i++)
        {
           System.out.print(array[i] + " ");
        }
    }
}
