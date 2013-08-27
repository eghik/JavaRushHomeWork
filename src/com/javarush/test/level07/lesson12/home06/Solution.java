package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandpa1 = new Human("дед1", true, 78, null, null);
        Human grandpa2 = new Human("дед2", true, 68, null, null);
        Human grandma1 = new Human("бабка1", false, 77, null, null);
        Human grandma2 = new Human("бабка2", false, 67, null, null);
        Human father = new Human("отец", true, 45, grandpa1, grandma1);
        Human mother = new Human("мать", false, 45, grandpa2, grandma2);
        Human child1 = new Human("дочь1", false, 10, father,mother);
        Human child2 = new Human("сын1", true, 12, father, mother);
        Human child3 = new Human("сын2", true, 4, father, mother);

        //ArrayList<String> family = new ArrayList<String>();
        //Collections.addAll(family,grandpa1,grandma1,grandpa2, grandma2, father, mother, child1, child2,child3);
        System.out.println(grandpa1);
        System.out.println(grandma1);
        System.out.println(grandpa2);
        System.out.println(grandma2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);



        }

    public static class Human
    {
        private String name;
        private Boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
