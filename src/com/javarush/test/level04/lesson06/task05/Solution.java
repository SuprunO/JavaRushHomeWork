package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String a=reader.readLine();
        int b=Integer.parseInt(reader.readLine());

        if (b<18){
            System.out.println("Подрасти еще");
        }
    }
}
