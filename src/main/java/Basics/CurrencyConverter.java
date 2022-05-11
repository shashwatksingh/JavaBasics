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
public class CurrencyConverter {
    /*int rupee, dirham, real, chilean_peso, mexican_peso, _yen, $australian, dollar, Rupee;
    initial assignment*/
    double []array; 
    public static void main(String[] args){
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
        double amount = cc.computeTransferAmount(0, 1000);
        System.out.println("Converted amount is: " + amount);
        
        /*static methods is accessed globally even by instance methods. But the instance variables and methods cannot be accessed by */
    }
    public CurrencyConverter(){
        array = new double[7];
        array[0]=63;
        array[1] = 3;
        array[2] = 3;
        array[3] = 595;
        array[4] = 18;
        array[5] = 107;
        array[6] = 2;
        /*Rupee = 63;
        dollar = 1;*/
    }
    void updateExchangeRate(int arrayIndex, double newVal){
        //update the value of the conversion rates
        array[arrayIndex] = newVal;
    }
    double getExchangeRates(int arrayIndex){
        // get the exchange rates for the day
        return array[arrayIndex];
    }
    double computeTransferAmount(int arrayIndex, double amount){
        //invoking other instance variable with this instance variables
        return (amount * getExchangeRates(arrayIndex));
    }
    void printCurrencies(){
        System.out.println("rupee: "+array[0]);
        System.out.println("dirham: "+ array[1]);
        System.out.println("real: "+array[2]);
        System.out.println("chilean_peso: "+array[3]);
        System.out.println("mexican_peso: "+array[4]);
        System.out.println("_yen: "+array[5]);
        System.out.println("$australian: "+array[6]);
        /*System.out.println("Rupee: "+Rupee);
        System.out.println("dollar: "+dollar); */   
    }       
}
