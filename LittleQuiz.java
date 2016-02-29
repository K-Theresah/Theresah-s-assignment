import java.util.Scanner;
public class LittleQuiz {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int ans;
        int ch=0,count=0,wrg=0;
      System.out.print("Are you ready for a quiz? ( 1. yes/ 2.no) ");
       ans=input.nextInt();
       
      if (ans==1){
          System.out.println("Okey, here it comes!\n"
                  + "Q1) What is the capital of Alaska? \n"
                  + "\t1) Melbourne \n\t2) Anchorage \n\tQ3) juneau ");
          ch=input.nextInt();
             if (ch==3){
                 System.out.println("That's right! ");
                         count++;
             }
             else{
                 System.out.println("That's wrong!, the right answer is Juneau");
                 wrg++;
                }
      
         System.out.println("Q2) Can you store the value of \"cat in a variable of type int? \n"
                 + "\t1) yes\n\t2) no");
         ch=input.nextInt();
         if(ch==2){
             System.out.println("That's right! ");
                     count++;
         }
         else{
             System.out.println("Sorry,'cat' is a string. ints can only store numbers.");
          wrg++;
         }
      
         System.out.println("What is the result of 9+6/3? \n"
                 + "\t1) 5 \n\t2) 11 \n\t3) 15/3 ");
         ch=input.nextInt();
         if(ch==2){
             System.out.println("Thats right!");
             count++;
         }
         else{
             System.out.println("Sorry, the right answer is 11");
             wrg++;
         }
      int result=0,result2=0;result +=count; 
      result+=wrg;
      System.out.print("overall, you got "+result+" corect(s) and "+result2+" wrong(s) out of 3 questions\n"
              + "Thanks for playing ");
              
      }
      else{
          System.out.println("Come back later ");
      }
      
    }
               
}
