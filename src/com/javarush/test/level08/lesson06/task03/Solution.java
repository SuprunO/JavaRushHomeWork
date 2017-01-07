package com.javarush.test.level08.lesson06.task03;

import java.util.*;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Object> arrayList =new ArrayList<Object>();
        System.out.println(getTimeMsOfInsert(arrayList));
        LinkedList<Object> linkedList = new LinkedList<Object>();
        System.out.println(getTimeMsOfInsert(linkedList));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        long currentTime = new Date().getTime();
        insert10000(list);
        return new Date().getTime() -currentTime;
        //напишите тут ваш код
    }

    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}
