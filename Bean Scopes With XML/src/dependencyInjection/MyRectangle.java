package dependencyInjection;

import org.springframework.stereotype.Component;
@Component
public class MyRectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("Rectangle Drawing ");
    }
    @Override
    public String getShapeName(){
        return "Rectangle";
    }
}
