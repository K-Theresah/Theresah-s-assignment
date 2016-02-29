import java.util.Scanner;
public class HowOldAreYou2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Hey, what's your name?(Sorry, I keep forgetting.) ");
        name=input.nextLine();
        
        System.out.print("ok, "+ name+", how old are you? " );
        age=input.nextInt();
        
        if (age<16)
        {
            System.out.println("you can't drive, "+name );
        }
        else if (age>=16 && age<=17)
        {
             System.out.println("You can drive but can't vote, "+name);
        }
        else if (age>=18 && age<=24){
            System.out.println("You can vote but not rent a car, "+name);
        }
        else
        {
            System.out.println("You can do pretty much anything, "+name);
        }
    }
    
}