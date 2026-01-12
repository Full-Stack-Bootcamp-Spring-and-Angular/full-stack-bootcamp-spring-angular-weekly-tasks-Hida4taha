package com;

public class Circle implements Shape {
    private Draw3D draw3D;
    private Draw2D draw2D;
    @Override
    public void Draw2D() {
draw2D.draw2D();
    }

    @Override
    public void Draw3D() {
        draw3D.draw3D();

    }
    public Circle(Draw2D draw2D,Draw3D draw3D) {
        this.draw2D = draw2D;
        this.draw3D = draw3D;

    }
}
