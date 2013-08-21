package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String dog = null;

    public Dog(String name)
    {
        this.dog = name;
    }

    public Dog(String name, int height)
    {
        this.dog = name + height;
    }

    public Dog(String name, int height, String color)
    {
        this.dog = name + height + color;
    }

}
