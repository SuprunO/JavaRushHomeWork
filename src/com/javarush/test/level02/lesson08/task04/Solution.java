package com.javarush.test.level02.lesson08.task04;

/* Минимум четырех чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
Подсказка:
Нужно написать тело обеих существующих функций min и исправить их возвращаемые значения.
*/
public class Solution
{


    public static int min(int a, int b, int c, int d)
    {
        int min2;
        if (min(a,b)<min(c,d))
            min2=min(a,b);
        else
            min2=min(c,d);
        return min2;
    }
    public static int min(int a, int b)
    {
        int min1;
        if (a<b)
            min1=a;
        else
            min1=b;
        return min1;
    }


    public static void main(String[] args) throws Exception
    {
        System.out.println( min(-20, -10) );
        System.out.println( min(-20, -10, -30, -40) );
        System.out.println( min(-20, -10, -30, 40) );
    }
}