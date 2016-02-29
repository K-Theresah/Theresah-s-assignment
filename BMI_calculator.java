/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class BMI_calculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        double height;
        double weight;
        
        System.out.print("Your height in inches: ");
        height = keyboard.nextDouble();
        height = height * 0.0254;
        
        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextDouble();
        weight = weight * 0.453592;
        
        System.out.println("Your BMI is "+ (weight/ (height*height)));
        
        
    }  
}
