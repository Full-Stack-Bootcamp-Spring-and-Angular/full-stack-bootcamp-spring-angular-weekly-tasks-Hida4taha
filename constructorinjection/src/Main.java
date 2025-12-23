import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
      ApplicationContext container= new ClassPathXmlApplicationContext("applicationContext.xml");
//        Circle circle = container.getBean(Circle.class);
//        circle.draw2D();
//        circle.draw3D();
        //============================
        Rectangle rectangle = container.getBean("myRectangle",Rectangle.class);
        rectangle.draw3D();
        rectangle.draw2D();

    }

}
