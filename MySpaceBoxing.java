/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class MySpaceBoxing {
    public static void main(String [] args){
        Scanner keyboard = new Scanner (System.in);
        
        float weight;
        int input;
        
        
        System.out.println("Please enter your current earth weight");
        weight = keyboard.nextFloat();
        
        System.out.println(" I have information for the following planet");
        System.out.println("    1. Venus   2. Mars    3. Jupiter");
        System.out.println("    4. Saturn  5. Uranus  5. Neptune");
        
        System.out.println("Which planet are You visiting? ");
        input = keyboard.nextInt();
        
        
        if (input == 1)
        {
            System.out.println("Your weight would be " + weight*0.72 + " pounds on that planet");
        }
        if (input == 2)
        {
            System.out.println("Your weight would be " + weight*0.39 + " pounds on that planet");
        }
        if (input == 3)
        {
            System.out.println("Your weight would be " + weight*2.65 + " pounds on that planet");
        }
        if (input == 4)
        {
            System.out.println("Your weight would be " + weight*1.17 + " pounds on that planet");
        }
        if (input == 5)
        {
            System.out.println("Your weight would be " + weight*1.05 + " pounds on that planet");
        }
        if (input == 6)
        {
            System.out.println("Your weight would be " + weight*1.23 + " pounds on that planet");
        }
    }
    
}
