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
public class Student {
    //Class and static variables are optional in declaration, int id; will also work fine
    //default value of int will be 0. If the variable is undeclared, the default value is updates to the variable
    //Integer literals : int literals, long literal
    int id = 1000;
    byte age = 18; //[-128,127] Possible lossy conversion from x to y if not coming inside the variable
    short rank = 10123;
    //_ can be used to increase the readability. This facility is Java7 and above. Cannot be used in integer literals
    long phone = 945_6647_895L; //L cannot be assigned to any other integer types. Long only to long
    /*int x;
    x=10; //this declaration is not possible in java*/
    float gpa = 3.8e4f; // f is mandatory with float but optional with double datatype
    //scientific notation e is 10 to the power of trailing number
    
    
    
    
    
    //char is represented as 16-bit signed integer in java
    //char is represented as \u0042 where /*backslash u*/ is escape sequence and 0042 is hexadecimal representation
    char degree ='B'; //of it can be represented in hexadecimal unicode \u0042
    //char also has boxed primitive    
    public static void main(String[] args){
        Student s = new Student();
        s.compute();
        //Integer Boxed Primitive. Every primitive types have boxed primitive
        int minValue= Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Min" + minValue+" Max " +maxValue);
    }
    void compute(){
        //id = ""; statically bind language
        //these local variables are compulsory to initialize
        int nextID =id+1;
        System.out.println(id);
        System.out.println(nextID);
        System.out.println("Age is " +age);
        System.out.println("Rank is" +rank);
        System.out.println("Phone is " +phone);
        System.out.println("Gpa is " +gpa);
        System.out.println("Degree is "+degree);
    }    
}
