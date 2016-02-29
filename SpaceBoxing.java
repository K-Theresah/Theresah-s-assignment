import java.util.Scanner;
public class SpaceBoxing {
   public static void main(String []args){
       Scanner input=new Scanner(System.in);
       int wgt,ch;
       double result;
       System.out.print("Please enter your current earth weight: ");
       wgt=input.nextInt();
       System.out.print("I have information for the following planets:\n "
               + "\t1.Venus \t2.Mars \t3.Jupiter\n"
               + "\t4.Saturn \t5.Uranus \t6.Nepturn\n");
       
       System.out.print("Which planet are you visiting? ");
       ch=input.nextInt();
      if(ch==1){
          result=wgt*0.78;
          System.out.println("Your weight is "+result+" pounds on that planet");}
      else if (ch==2)
      {
          result=wgt*0.39;
      System.out.println("Your weight is "+result+" pounds on that planet");
      }    
      else if (ch==3){
          result = wgt*2.65;
          System.out.println("Your weight is "+result+" pounds on that planet");
      }
      else if (ch==4){
          result=1.17*wgt;
          System.out.println("Your weight is "+result+" pounds on that planet");
      }
      else if (ch==5){
          result=1.05*wgt;
          System.out.println("Your weight is "+result+" pounds on that planet");
      }
      else if (ch==6){
          result=1.23*wgt;
          System.out.println("Your weight is "+result+" pounds on that planet");
      }
      else 
          System.out.println("make the correct choice. ");
   }    
}
