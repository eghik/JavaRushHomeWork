package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius  width, color
*/

public class Circle
{
    private String circle = null;

    public Circle(int centerX, int centerY, String radius)
    {
        this.circle = centerX + centerY + radius;
    }
    public Circle(int centerX, int centerY, String radius, int width)
    {
        this.circle = centerX + centerY + radius + width;
    }
    public Circle(int centerX, int centerY, String radius, int width, String color)
    {
        this.circle = centerX + centerY + radius + width + color;
    }

}
