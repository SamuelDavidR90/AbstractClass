
package com.mycompany.abstractclass;


public class Circle extends Figure{
    //attributes 
    protected double radio;
    
    //constructors methods
    public Circle() {
    }

    public Circle(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }
    
    
    //abstract methods
    @Override
    public double toCalculateArea() {
        double pi = 3.1415;
        double radio = 20;
        double result = radio * pi;
        return result;
    }
    
}
