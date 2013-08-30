package otherhomework.arrays.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 29.08.13
 * Time: 13:23
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера.
  */
public class work1
{
    public static void main (String[] args)
    {
      int[] array = new int[10];

       for (int i = 0; i < array.length; i++)
       {
           array[i] = 2 + 2*i;
       }
       for (int i = 0; i < array.length; i++)
       {
           System.out.print(array[i] + " ");
       }
        System.out.println();
       for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }




    }
}
