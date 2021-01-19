/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;

/**
 *
 * @author HP
 */
public class BasicsDemo {
    static void print(){
        System.out.println("\n\nInside print.....");
        //advance cursor to the new line by print ln command
        System.out.println("Hello World!");
        //printing empty line
        System.out.println();
        //cursor remain in the same line
        System.out.print("Hello, world!");
        System.out.print("Hello,");
        //print a space
        System.out.print(" ");
        //System.out.print(); This line will give error
        System.out.print("world!!");
    }
    static void primitives(){
        System.out.println("\n\n Inside primitives ....");
        //You can also use underscore (_) in these notations for better readability
        //These all are declaration notation of 65
        int intHex = 0x0041; //hexadecimal system 
        System.out.println("intHex " + intHex);
        //good in performing bitwise number. Binary number is best.
        int intBinary = 0b1000_001; //only in Java7 and above. 
        System.out.println("intBin " + intBinary); 
        //octal number starts with 0. Though octal notation is rarely used
        int intOctal = 0101;
        System.out.println("intOtcal " + intOctal);
    }
    public static void main(String[] args){
        //Language basics
        print();
        primitives();
    }
    
}
