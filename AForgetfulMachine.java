/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;
public class AForgetfulMachine {
    public static void main ( String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println( "Give me a word!" );
    keyboard.next();
    
    System.out.println( "Give me a second word!" );
    keyboard.next();
    
    System.out.println( "Great!, give me your favorite number" );
    keyboard.next();
    
    System.out.println( "Give me a second number");
    keyboard.next();
    
    System.out.println("Whew, Wasn't that fun?");
    
    
    
}
}