import java.util.Scanner;
public class Adventure1 {
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        String choice,op1="upstairs",op2="kitchen",op3="refrigerator";
        String op4="cabinet",op5="yes",op6="no",op7="bedroom",op8="bathroom";
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE \n\n You are in a creepy house! Would you like to go'upstairs 'or into the 'kitchen'? ");
        choice=input.next();
        if (choice==op1){
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master\n"
                    + "'bedroom'. There is also a'bathroom' off the hallway.Where would you like to go? ");
                    choice=input.next();
                 if (choice==op7){
                     System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.the\n"
                             + "bed is unmade. In the back of the room, the closet door is ajar.Would you \nlike to open the door? ('yes'or 'no' ) ");
                         choice=input.next();
                         if (choice==op6){
                             System.out.println("Well, then i guess you'll never know what was in there. Thanks for playing,\n"
                                     + "I'm tired of making nested i statements.");
                         }
                         else if(choice==op5){
                             System.out.println("Woow, you've discovered the hidden tresure ");
                         }
                 }
                 else if(choice==op8){
                     System.out.println("Well, you've gotten what you wanted, wash down.\n"
                             + "I'm tired of making nested i statements. ");
                 }
        }
        else if(choice==op2){
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side\n"
                    + "there is, as you'd expect, a refrigerator.You may open the'regerator' or \n"
                    + "look in a 'cabnet'");
                 choice=input.next();
                    if (choice==op3){
                        System.out.println("Inside the refrigerator you see food and stuff. it looks pretty nasty.\n"
                                + "Would you like to eat some of the food? ('yes'or 'no')");
                        choice=input.next();
                        if (choice ==op6){
                            System.out.println("Well, die of starvation.....eventually.");
                        }
                        else if(choice ==op5){
                            System.out.println("Eat what you see!\nI'm tiedof making nested if statements.");
                        }
                    }
        }
        else if (choice==op4){
            System.out.println("Inside the cabinet, you will find bowls which are dirty. Would you like to clean them? ('yes' or 'no')");
            choice=input.next();
            if(choice==op5){
                System.out.println("Well, then clean the bowls");
            }
            else if (choice==op6){
                System.out.println("Fine, go away!");
            }
        }
    }
}
