
package com.mycompany.abstractclass;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AbstractClass {

    public static void main(String[] args) {
        //we create objects from each class.
        Circle circle = new Circle();
        double resultCircle = circle.toCalculateArea();
        
        Square square = new Square();
        double resultSquare = square.toCalculateArea();
        
        Triangle triangle = new Triangle();
        double resultTriangle = triangle.toCalculateArea();
        
        Pentagon pentagon = new Pentagon();
        double resultPentagon = pentagon.toCalculateArea();
        
        System.out.println("Do you want to continue ? Type Yes or Not");
        Scanner keyboardString = new Scanner(System.in);
        String answer = keyboardString.nextLine();
        
        //repetitive structure while and conditional switch inside
        while(answer.equalsIgnoreCase("yes")){ 
        //Introducing values by keyboard using Scanner
        System.out.println("To Calculate Area: press \n 1 Circle and \n 2 Square \n 3 Triangle \n 4 Pentagon");
        Scanner keyboardInt = new Scanner(System.in);
        int optionSelected = keyboardInt.nextInt();
        
        switch(optionSelected){
            case 1: System.out.println("Area of Circle: " +  resultCircle);
            break;
            case 2: System.out.println("Area of Square: " +  resultSquare);
            break;
            case 3: System.out.println("Area of Square: " +  resultTriangle);
            break;
            case 4: System.out.println("Area of Square: " +  resulPentagon);
            break;
            default: System.out.println("Introduce a valid number");
            }
        
            System.out.println("Continue? Yes or No");
            answer = keyboardString.nextLine();
        }
        
        
    }
}
