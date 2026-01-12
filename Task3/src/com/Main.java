package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //applicationContext.xml
       ApplicationContext conatiner = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Circle circle = conatiner.getBean(Circle.class);
//        circle.Draw2D();
        Square square = conatiner.getBean( Square.class);
        Square square2 = conatiner.getBean( Square.class);
        square.Draw3D();
        square2.Draw3D();
        System.out.println(square2);
        System.out.println(square);
        ( (ClassPathXmlApplicationContext)conatiner).close();


    }
}
