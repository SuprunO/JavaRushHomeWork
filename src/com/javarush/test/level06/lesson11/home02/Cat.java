package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
        //        System.out.println("constructor");
        //        System.out.println(this);
        //System.out.println(cats[0]);
    }
    //add your code here - добавь свой код тут
    public static ArrayList<Cat> cats=new ArrayList<Cat>();
    public static void main(String[] args) {

        for (int i=0;i<10;i++) cats.add(new Cat());
        printCats();
    }
    public static void printCats() {
        //add your step 3 code here - добавь свой код для пункта 3 тут
        //test
            System.out.println(Cat.cats);
        }
    }