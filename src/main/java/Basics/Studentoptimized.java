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
public class Studentoptimized {
    //This class is an optimized version of Student.java.
    //Here, I'll be following a general/preferred way to use java classes, variables and methods
    // Instance and static variables are also referred to as fields or attributes. Attributes are probably more commonly associated with instance variables.
    
    
    //It is preferred to stick to int and double until and unless necessarily required
    
    int id ;
    String name;
    String gender;
    //same copy accessed by all the objects. accessed by class reference. 
    //They can only be read in a class scope. Only one copy is created for the whole class
    //Can be accessed outside the class using class name or the object name
    //you can also use object reference to access this, but, it is not preferred 
    static int ctr;
    int age;
    short rank;    
    long phone;
    float gpa; 
    boolean international;
    //Multivariable declaration. Only same type can be done this way. They will get default values as earlier. The rule is that you can define the datatype only once.
    //you can also do double tuitionFees = 12000, internationalTuitionFees= tuitionFees + 5000;
    //or you can also do tuitionFees = internationalTuitionFees = 5000;
    double tuitionFees = 12000, internationalTuitionFees = 5000;  
    char degree;  
    public static void main(String[] args){
        //We will give two state to the same class and implement object calling.
        //Both states are independent of each other
        //args is also a local variable
        Studentoptimized student1 = new Studentoptimized();
        //initializing state for student 1
        student1.id = 1000+ctr;
        student1.name = "John";
        student1.gender = "Male";
        student1.age = 18;
        student1.rank = 10123;    
        student1.phone = 945_6647_895L;
        student1.gpa = 3.8e4f; 
        student1.international = false;
        student1.degree ='B';
        student1.compute();
        //initializing state for student 2
        Studentoptimized student2 = new Studentoptimized();
        student2.id = 1001;
        student2.name = "Raj";
        student2.gender = "Male";
        student2.age = 21;
        student2.rank = 10132;    
        student2.phone = 223_456_9999L;
        student2.gpa = 3.4f; 
        student2.international = true;
        student2.degree ='M';
        student2.compute();
    }
    void compute(){
        //These are called local variables
        //Local variables must be initialized before being used. Local variables do not get a default values.
        int next =id+1;
        System.out.println("\n" +id);
        System.out.println("Name: " +name);
        System.out.println("Gender: " +gender);
        System.out.println("Age is " +age);
        System.out.println("Rank is" +rank);
        System.out.println("Phone is " +phone);
        System.out.println("Gpa is " +gpa);
        System.out.println("Degree is "+degree);
        if(international == true){
            tuitionFees+= internationalTuitionFees;
        }
        System.out.println("Tutition fee"+ tuitionFees);
        ctr+=1;
    }    
}
