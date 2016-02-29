/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1_10516463;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        String firstname;
        String lastname;
        int grade;
        int studId;
        String login;
        double GPA;
        
        System.out.print("First Name: ");
        firstname = keyboard.next();
        
        System.out.print("Last Name: ");
        lastname = keyboard.next();
        
        System.out.print("Grade (9-12): ");
        grade = keyboard.nextInt();
        
        System.out.print("Student ID: ");
        studId = keyboard.nextInt();
        
        System.out.print("Login : ");
        login = keyboard.next();
        
        System.out.print("GPA (0.0-4.0) : ");
        GPA = keyboard.nextDouble();
        
        System.out.println("                            ");
        System.out.println("Your infomation: ");
        System.out.println("        Login: " + login);
        System.out.println("        ID:    " + studId);
        System.out.println("        Name:  " + lastname +","+ firstname);
        System.out.println("        GPA:   " + GPA);
        System.out.println("        Grade: " + grade);
        
       
        
    }
    
}
