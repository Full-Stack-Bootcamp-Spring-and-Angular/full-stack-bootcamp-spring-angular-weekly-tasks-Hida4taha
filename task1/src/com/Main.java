package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        Shape c =new Circle();
//        System.out.println(c.getArea(3.0));
//        Shape s = new Square();
//        System.out.println(s.getArea(3));
//      2 define Container
        ApplicationContext container = new ClassPathXmlApplicationContext("app.xml");

        Circle circle = (Circle) container.getBean("mycircle");
        System.out.println(circle.getArea(3.0));

       Shape square = container.getBean("mysquare", Shape.class);
        System.out.println(square.getArea(3.0));
    }
}