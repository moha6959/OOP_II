package challenge9;

import java.io.*;


public class Arithmetic {
    public static void main(String [] args){
        double a=5;
        double b = 10;
        try {
            double answer=a/b;
        System.out.println("The answer is"+answer);
        } catch (ArithmeticException e) {
            System.out.println("Error division by zero is not allowed");
        }
        finally{
            System.out.println("The program continues after the exception");
        }
        
    }
    
}
