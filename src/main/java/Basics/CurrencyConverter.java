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
    int rupee, dirham, real, chilean_peso, mexican_peso, _yen, $australian, dollar, Rupee;
    public static void main(String[] args){
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }
    public CurrencyConverter(){
        rupee=63;
        dirham = 3;
        real = 3;
        chilean_peso = 595;
        mexican_peso = 18;
        _yen = 107;
        $australian = 2;
        Rupee = 63;
        dollar = 1;
    }
    void printCurrencies(){
        System.out.println("rupee: "+rupee);
        System.out.println("dirham: "+ dirham);
        System.out.println("real: "+real);
        System.out.println("chilean_peso: "+chilean_peso);
        System.out.println("mexican_peso: "+mexican_peso);
        System.out.println("_yen: "+_yen);
        System.out.println("$australian: "+$australian);
        System.out.println("Rupee: "+Rupee);
        System.out.println("dollar: "+dollar);    
    }       
}
