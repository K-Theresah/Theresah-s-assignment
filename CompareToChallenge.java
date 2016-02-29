import java.util.Scanner;
public class CompareToChallenge {
    public static void main(String[]args)
    {
        Scanner input=new Scanner (System.in);
      System.out.print("Comparing \"axe\" with \"dog\" produces ");
      int i = "axe".compareTo("dog");
      System.out.println(i);

      System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
      System.out.println( "applebee's".compareTo("apple") );
    }
    
}
