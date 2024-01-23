package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    // changed renderer to record area only, as other information from the rectangle
    // is not needed to draw
    private double area;
    
    Renderer(Rectangle rectangle) {
        this.area = rectangle.getArea();
    }

    void draw() {
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
