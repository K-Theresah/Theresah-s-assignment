import javax.swing.*;
public class UsingSwingForInput {

    public static void main(String[] args) {
        // TODO code application logic here
        String name=JOptionPane.showInputDialog("What is your name? ");
        String input =JOptionPane.showInputDialog("how old are you? ");
        int age=Integer.parseInt(input);
        System.out.print("Hello, "+name+". ");
        System.out.println("Next year,you'll be "+(age+1));
        System.exit(0);
    }
    
}
