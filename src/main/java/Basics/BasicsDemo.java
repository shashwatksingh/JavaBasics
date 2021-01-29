/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basics;
import java.math.*;

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
        //Representing character in integer, hexadecimal and binary.
        //But because the range of character is from 0 to 65535. Therefore, negative value cannot be assigned
        int intOctal = 0101;
        System.out.println("intOctal " + intOctal);
        char charInt = 65;
        System.out.println("Character in int "+charInt);
        char charHex = 0x0041;
        System.out.println("Character in hex "+charHex);
        char charBinary = 0b0100_0001;
        System.out.println("Character in binary "+charBinary);
        
        //using char to initialize int variable
        int intChar = 'a';
        System.out.println("Integer initialised to character has value: "+intChar);
    }
    static void floatPoint(){
        //float can store 6-7 decimal digits-3.4E38 to 3.4E8 
        //decimal has 15-16 decimal places -1.7E308 to 1.7E308 
        //if the numer goes beyond the precision. They are approximated.
        // Internal representation of decimal valuesIEEE 754 floating point Schem
        System.out.println(1-0.9);
        System.out.println(0.1+0.2);
        //numbers cannot be represented accurately. It's the issue with other languages
        //0.1~0.000100010110111001100111011 not exactly 0.1
        double price = 1000;
        double discountPercent = 0.9;
        double discountAmount = price*discountPercent;
        System.out.println(price - discountAmount);
        System.out.println(price *(1 - discountPercent)) ;
        //Problem is that these numbers don't have a denominator of 2
        //0.5 can be accurately represented
        
        //way around this predicament is using BigDecimal class. But it's a little slow. 
        BigDecimal first = new BigDecimal("0.1");
        BigDecimal second = new BigDecimal("0.2");
        System.out.println(first.add(second));
        
    }
    static void typeCasting() {
      System.out.println("\nInside typeCasting ...");
      // Explicit casting
      long y = 42;
      //int x = y;
      int x = (int)y;
      
      // Information loss due to out-of-range assignment
      byte narrowdByte = (byte)123456;
	  System.out.println("narrowdByte: " + narrowdByte); 
	  
	  // Truncation
	  int iTruncated = (int)0.99;
	  System.out.println("iTruncated: " + iTruncated); 
	  
	  // Implicit cast (int to long)
	  y = x;
	  
	  // Implicit cast (char to int)
	  char cChar = 'A';
	  int iInt = cChar; 
	  System.out.println("iInt: " + iInt);
	  
	  // byte to char using an explicit cast
	  byte bByte = 65;
	  cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
	  System.out.println("cChar: " + cChar);
    }
    static int count =25; //declaration statements are allowed
    //count =34; you cannot have expression statements in the class scope
    //if- else ; control flow is not allowed in the class scope
    //use contructors and methods for the above two types
    static void arrays(){
        //Three ways to invoke an array
        System.out.println("\nInside arrays");
        //First way
        /*int []scores =new int[4]; //size is defined at the time of array declaration and cannot be changes later
        scores[0]=90; 
        scores[1]=70; 
        scores[2]=80; 
        scores[3]=100; 
        */
        //Second way to declare arrays
        //int [] scores = new int[] {90,70,80,100};
        //The size of the array is implicitly inferred. Do not declare the array size
        
        
        //Third way to declare arrays
        int [] scores = {90,70,80,100};//this syntax is only possible in the declaration
        System.out.println("Mid-term 1 :" +scores[0]);
        System.out.println("Mid-term 2 :" +scores[1]);
        System.out.println("Final :" +scores[2]);
        System.out.println("Project :" +scores[3]);
        System.out.println("Number of exams: " + scores.length);       
        
        //Since the array is an object reference. Without declaring it will give a null pointer exception
        
        /*Student [] students = new Student[3];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();*/
        
        
        
        //Second type of declaration
        //Student [] students = new Student[] {new Student(), new Student(), new Student()};
        
        
        //Third type of declaration
        Student [] students = {new Student(), new Student(), new Student()};
        students[0].name = "John";
        students[1].name = "Jack";
        students[2].name = "Jill";
        System.out.println("Student 1 :" +students[0].name);
        System.out.println("Student 2 :" +students[1].name);
        System.out.println("Student 3 :" +students[2].name);
        //arrays are internally represented as int arr[row's] = new int[column's]
        //2-D arrays are used to represent the matrices. The arrays above the order of 2 are really rare to find.
    }
    static void threeDimensionalArrays() {
        //by specifying void, it has no return
	   System.out.println("\nInside threeDimensionalArrays ...");
	   int[][][] unitsSold = new int[][][]{ 
										   { // New York
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,850,0,0}// Apr	
										   },
										   { // San Francisco
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,0,0,0}  // Apr
										   },
										   { 
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   },
										   {
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   }
										 };
		                    	 
		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}
    //methods represent logic.datatypes represent state.
    /*methodSpecifier returnType methodName (type param1, type param2,..parameters/formal parameters.){
        method SIGNATURE is only methodName (type param1, type param2,...) 
    return someValue;
    //return value can be either primitive type or objects/reference. Optional return if returnType is void.
    }
    type var = methodName(arg1, arg2, ...method arguments/actual parameters...);
    methods parameter must have SAME dataype and the values will be assigned in the SAME order
    */
    static double sum ( double x, double y){
       return (float)(x+y);
       //unnecessary type casting but this is possible because it will again be converted to double again implicitly
    }
    static double average ( double x, double y){
        double s = sum(x,y); //method reusability and avoid duplication
        return s/2;
       //unnecessary type casting but this is possible because it will again be converted to double again implicitly
    }
    static boolean search(int[] list, int key){
        boolean r = false;
        for(int i=0;i<list.length; i++)
            if(list[i]==key)
                r = true;
        return r;
    }
    public static void main(String[] args){
        //Language basics
        /*print();
        primitives();
        floatPoint();
        typeCasting();
        arrays();
        threeDimensionalArrays();*/
        double d = sum(3.0, 2.0);
        System.out.println(d);
        double d2 = average(3.0, 2.0);
        System.out.println(d2);
        int[] list = {1, 5};
        System.out.println(search(new int[]{1,2,3}, 2));//one more way to add list as parameter but only as declaration statements
    }
    
}
