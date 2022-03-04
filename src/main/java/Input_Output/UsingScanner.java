package Input_Output;

import java.util.Scanner;

public class UsingScanner {
    public static void getName(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name ");
        String name = scan.nextLine();
        System.out.println("Your name is: " + name);
    }

    public static void main(String [] args){
        getName();
    }
}
