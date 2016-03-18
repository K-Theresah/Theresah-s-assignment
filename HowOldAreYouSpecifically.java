/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the emplate in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class HowOldAreYouSpecifically {
    public static void main (String [] args){
        Scanner keyboard = new Scanner (System.in);
        
        String name;
        int age;
        
        System.out.println("Hey! What's your name? (sorry I keep forgetting)");
        name = keyboard.next();
        
        System.out.println("Ok," + name+ ", How old are you?");
        age = keyboard.nextInt();
        
        if (age >= 25)
        {
            System.out.println("You can do pretty much anything");
        }
        
        else if (age >= 18)
        {
            System.out.println("You can vote but not rent a car");
        }
        else if ( age >= 16)
        {
            System.out.println("You can drive but not vote");
        }
        else if (age < 16)
        {
            System.out.println("You can't drive");
        }
    }
    
}
