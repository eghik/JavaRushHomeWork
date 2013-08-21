package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12/*высота, см*/ /*длинна хвоста, см */

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tom = new Cat("Tom", 8, "red");
        Dog dog = new Dog("Dog", 5, 7);
        Mouse jerryMouse1 = new Mouse("Jerry1", 12 , 5);
        Cat tom1 = new Cat("Tom1", 18, "blue");
        Dog dog1 = new Dog("Dog1", 15, 17);

        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class Dog
    {
        String name;
        int weight;
        int age;

        public Dog(String name, int weight, int age)
        {
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
    }

    public static class Cat
    {
        String name;
        int longy;
        String color;

        public Cat(String name, int longy, String color)
        {
            this.name = name;
            this.longy = longy;
            this.color = color;
        }

    }

}
