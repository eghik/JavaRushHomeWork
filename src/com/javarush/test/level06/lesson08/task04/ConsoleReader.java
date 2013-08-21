package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        return read.readLine();

    }

    public static int readInt() throws Exception
    {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(num.readLine());

    }

    public static double readDouble() throws Exception
    {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(num.readLine());

    }

    public static void readLn() throws Exception
    {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        while ( br.read() != '\n' )
        {
            ;
        }

    }
}
