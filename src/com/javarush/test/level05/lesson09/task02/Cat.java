package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String cat = null;

    public Cat(String name)
    {
        this.cat = name;
    }

    public Cat(String name, int weight, int age)
    {
        this.cat = name + weight + age;
    }

    public Cat(String name, int age)
    {
        int weight = 1;
        this.cat = name + age + weight;
    }

    public Cat(int weight, String color)
    {
        String name = null, adress = null;
        int age = 1;
        this.cat = weight + color + name + adress + age;

    }

    public Cat(int weight, String color, String adress)
    {
        this.cat = weight + color + adress;
    }
}
