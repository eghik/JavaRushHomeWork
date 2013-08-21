package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
   private int rectangle = 0;

   public Rectangle(int left, int top, int width, int height)
   {
       this.rectangle = left + top + width + height;
   }

   public Rectangle(int left, int top)
   {
       int width = 0, height = 0;
       this.rectangle = left + top + width + height;
   }

   public Rectangle(int left, int top, int width)
   {
      int height = width;
      this.rectangle = left + top + width + height;
   }

    public Rectangle(int rectangle1)
    {
        this.rectangle = rectangle1;
    }



}
