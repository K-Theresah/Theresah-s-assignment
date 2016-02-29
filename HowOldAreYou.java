/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class HowOldAreYou {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Hello. What is your name? ");
        name = keyboard.next();
        
        System.out.println("Ok, " +  name + " How old are you? ");
        age = keyboard.nextInt();
        
       if (age > 25)
       {
           System.out.println("\"You can do anything that's legal\"," + name);
       }
       if (age < 25 || age < 16)
       {
           System.out.println("\"You can't rent a car.\"," + name);
       }
        if (age < 18 || age < 16)
       {
           System.out.println("\"You can't vote.\"," + name);
       }
        if (age < 16)
       {
           System.out.println("\"You can't drive.\"," + name);
       }
       }
    
}
