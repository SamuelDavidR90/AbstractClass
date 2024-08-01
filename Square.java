
package com.mycompany.abstractclass;


public class Square extends Figure{
    //attributes
    protected double side;
    
    //constructors 
    
    public Square() {
    }

    public Square(double side, double x, double y) {
        super(x, y);
        this.side = side;
    }
    
    //abstract method extended from Figure
    @Override
    public double toCalculateArea() {
        side = 20;
        double result = side * side;
        return result;
    }

   
    
    
}
