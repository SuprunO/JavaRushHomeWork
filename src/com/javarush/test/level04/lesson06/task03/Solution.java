package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader ab=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(ab.readLine());
        int b=Integer.parseInt(ab.readLine());
        int c=Integer.parseInt(ab.readLine());
        if (a<=b&&b<=c)System.out.print("\n"+c+" "+b+" "+a);
        else if (a<=c&&c<=b)System.out.print("\n"+b+" "+c+" "+a);
        else if (b<=a&&a<=c)System.out.print("\n"+c+" "+a+" "+b);
        else if (b<=c&&c<=a)System.out.print("\n"+a+" "+c+" "+b);
        else if (c<=a&&a<=b)System.out.print("\n"+b+" "+a+" "+c);
        else if (c<=b&&b<=a)System.out.print("\n"+a+" "+b+" "+c);


    }
}
