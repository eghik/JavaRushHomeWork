package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man = new Man("Aleksandr", 18, "Moscow");
        Man man1 = new Man("Aleksandr1", 19, "Moscow1");
        Woman woman = new Woman("Aleksandrа", 17, "Moscow3");
        Woman woman1 = new Woman("Aleksandrа1", 19, "Moscow2");
        System.out.println(man );
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);




    }

    public static class Man
    {
    String name;
    int age;
    String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
    String name;
    int age;
    String address;

        public Woman(String name, int age,String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}
