import java.util.Scanner;
public class GenderGame {
    public static void main(String[] args) {
        String fname,lname,gender,respd;
       String w="M",u="F",op1="y",op2="n";
        int age;
        Scanner input = new Scanner (System.in);
        System.out.print("What is your gender (M or F): ");
        gender=input.next();
        System.out.print("First name: ");
        fname=input.next();
        System.out.print("Last name: ");
        lname=input.next();
        System.out.print("Age: ");
        age=input.nextInt();
        if(age>=20){
            if (gender == w ){
            System.out.print("Are you married, "+fname+" (y or n): ");
               respd=input.next();
                 if(respd==op1){
                     System.out.println("Then I shall call you Mr. "+lname);
                 }
                 else {
                     System.out.println("Then i shall call you "+fname+" "+lname );
                 }
        }
            else {
                System.out.print("Are you married, "+fname+" (y or n): ");
                respd=input.next();
                 if (respd==op1){
                     System.out.println("Then I shall call you Mrs. "+lname);
                 }
                 else if(respd==op2) {
                     System.out.println("Then I shall call you Ms "+fname+" "+lname);
                 }
            }
        
    }
        else
            System.out.println("Then I shall call you "+fname+" "+lname);
    }
    
}
