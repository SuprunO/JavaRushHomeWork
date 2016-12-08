package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man1=new Man("Ivan",21,"Moscow");
        Man man2=new Man("Orhan",32,"Baki");
        Woman woman1=new Woman("Irina",21,"Rostov");
        Woman woman2=new Woman("Aida",29,"Evlax");
        System.out.println(woman1.getInfo());
        System.out.println(woman2.getInfo());
        System.out.println(man1.getInfo());
        System.out.println(man2.getInfo());
        // Выведи их на экран тут
    }
    // Напиши тут свои классы
    public static class Man
    {
        String name;
        int age;
        String address;
        public String getInfo()
        {return  name+" "+age+" "+address;}

        public Man(String name,int age,String address)
        {
            this.age=age;
            this.address=address;
            this.name=name;
        }
    }
    public static class Woman
    {
        String name;
        int age;
        String address;

        public String getInfo()
    {
        return name+" "+age+" "+address;
    }

        public Woman(String name,int age,String address)
        {
            this.age=age;
            this.address=address;
            this.name=name;
        }
    }
}