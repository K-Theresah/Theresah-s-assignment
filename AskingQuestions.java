/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class AskingQuestions {

   
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int age;
       int height;
       int height1;
       double weight;
       
       System.out.print( "How old are you?" );
       age = keyboard.nextInt();
       
       System.out.print( "How many feet tall are you?" );
       height = keyboard.nextInt();
       
       System.out.print( "And how many inches?" );
       height1 = keyboard.nextInt();
       
       System.out.print( "How much do you weigh?" );
       weight = keyboard.nextDouble();
       
       System.out.println( "So you're " + age + " years old, "+ height + "'" + height1 +" tall and " + weight + " heavy.");
    }
    
}
