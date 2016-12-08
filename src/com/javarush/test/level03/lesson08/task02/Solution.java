package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();
        int num3 = Integer.parseInt(num1);
        int num4 = Integer.parseInt(num2);
        System.out.println(name +  " получает " + num3 + " через " + num4 + " лет.");
    }
}