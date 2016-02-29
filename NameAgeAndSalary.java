/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class NameAgeAndSalary {
    public static void main(String[] args){
        Scanner keyboard = new Scanner (System.in);
        
        String name;
        int age;
        double income;
        
        System.out.println( "Hello! What's your name?" );
        name = keyboard.next();
        
        System.out.println( "Hi, " + name + " ! How old are you?" );
        age = keyboard.nextInt();
        
        System.out.println("So you're " + age + " , eh? That's not old at all!");
        
        System.out.println("                                               ");
        
        System.out.println( "How much do you make, " + name + "?");
        income = keyboard.nextDouble();
        
        System.out.println(income + "! I hope that's per hour and not per year! LOL!! ");
    }
    
}
