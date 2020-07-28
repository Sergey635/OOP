package com.company;

public class Main {

    public static void main(String[] args) {
	String hello = "Hello OOP / good bie!!!!!!!!!!!";
        System.out.println(hello);

        //OOP це тип даних

        int a = 5;
        Integer b = 6;  //більше можливостей для роботи

        // нам потрібно "a" переробити в double

        double c = (double) a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        Double d = b.doubleValue();

        String number = "1234";

        Integer numberInt = Integer.valueOf(number);

        //императированое программирования
        //найти плошу прямокутника довж = 3 шир = 4!

        int lenghs = 3;
        int wights = 4;
        int area = lenghs * wights;
        System.out.println(area);
        System.out.println("****************************************************");

        Rectangle r1 = new Rectangle(3,4);
        int areaR1 = r1.getArea();
        System.out.println(areaR1);

        Rectangle r2 = new Rectangle(8,10);
        int areaR2 = r2.getArea();
        System.out.println(areaR2);

        Rectangle r3 = new Rectangle(12,13);
        int areaR3 = r3.getArea();
        System.out.println(areaR3);

        Rectangle r4 = new Rectangle(11,12);
        int areaR4 = r4.getArea();
        System.out.println(areaR4 + " " + areaR3);

        System.out.println(r2.getPerimetr());
        System.out.println("***************************************************");

        //ми хочемо у нашому ректанглі r2 збільшити довжину на 3
        //це робиться за допомогою  СЕТЕРРA
        r2.setLength(11);                   //  set - змінити значення
        System.out.println(r2.getArea());       // get   -   показати  показати значення
        System.out.println(r2.getWidth());

        System.out.println(r2.toString());

        Rectangle r5 = new Rectangle();
        r5.setWidth(5);
        r5.setLength(6);
        System.out.println(r5.toString());




    }



}

        //ДЗ      куб
        // створити клас і зробити 5 методів


