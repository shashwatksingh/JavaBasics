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
    int id = 1000;
    /*int x;
    x=10; //this declaration is not possible in java*/
    
    public static void main(String[] args){
        Student s = new Student();
        s.compute();
    }

    void compute(){
        //id = ""; statically bind language
        //these local variables are compulsory to initialize
        int nextID =id+1;
        System.out.println(id);
        System.out.println(nextID);
        System.out.println("The program ran succesfully");
    }    
}
