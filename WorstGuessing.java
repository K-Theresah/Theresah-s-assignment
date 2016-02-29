import java.util.Scanner;
public class WorstGuessing {

    public static void main(String[] args)
    {
        Scanner input=new Scanner (System.in);
        String name;
        int ch;
    System.out.println("TEH WORST NUMBER GESSING GAME EVAR!!!!!1!");
    System.out.print("I'M THIMKING OF A NBR FROM.  TRY 2GESS! ");
    ch=input.nextInt();
    if (ch==4){
        System.out.println("LOL!!! U GOT IT! I CANT BELIEVE U GESSED IT WAS 4!");
    }
    else 
        System.out.println("WOOT! U SUXOR!!! I PWN JOO!!! IT WAS 4");
    }
    
}
