package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int a1=Integer.parseInt(reader.readLine());
        int b1=Integer.parseInt(reader.readLine());
        int c1=Integer.parseInt(reader.readLine());

        if (a1==b1 & b1==c1 & c1==a1){
            System.out.println(a1+" "+b1+" "+c1);
        }
        else if (a1==c1){
            System.out.println(a1 +" "+ c1);

        }
        else if (b1==c1){
            System.out.println(b1+" "+ c1);

        }
        else if (a1==b1){
        System.out.println(a1+" "+b1);
        }
    }
}