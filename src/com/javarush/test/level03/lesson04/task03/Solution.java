package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
        zerg1.name ="Tolya";
        zerg2.name ="Kolya";
        zerg3.name ="Petro";
        zerg4.name ="Zina";
        zerg5.name ="Gosha";
        zerg6.name ="Artem";
        zerg7.name ="Anton";
        zerg8.name ="Opel";
        zerg9.name ="Vadim";
        zerg10.name ="Sergij";

       Protos protos1 = new Protos();
       Protos protos2 = new Protos();
       Protos protos3 = new Protos();
       Protos protos4 = new Protos();
        Protos protos5 = new Protos();

        protos1.name = "899909";
        protos2.name = "-088575gh";
        protos3.name = "786t4875";
        protos4.name = "0980968";
        protos5.name = "0980968";


        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "Q1WfEa";
        terran2.name = "Q2WEsfdb";
        terran3.name = "Q3fWEc";
        terran4.name = "Q4sWEd";
        terran5.name = "QW5fsEa";
        terran6.name = "QW3gsEb";
        terran7.name = "QW2gfsEc";
        terran8.name = "QWgfsEd";
        terran9.name = "QWgfs5a";
        terran10.name = "QW63Eb";
        terran11.name = "QW4tEc";
        terran12.name = "QW2hEd";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}