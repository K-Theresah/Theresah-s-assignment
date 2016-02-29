/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class ADumpCalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        double num1;
        double num2;
        double num3;
        
        
        System.out.print("What is your first number? ");
        num1 = keyboard.nextDouble();
        
        System.out.print("What is your second number? ");
        num2 = keyboard.nextDouble();
        
        System.out.print("What is your third number? ");
        num3 = keyboard.nextDouble();
        
        System.out.println("("+ num1 +" + "+ num2+" + "+num3+ ") / 2 is ..." + ( (num1+ num2+ num3)/2) );
    }
    
}
