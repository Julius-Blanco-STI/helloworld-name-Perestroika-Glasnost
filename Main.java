package main;
import java.util.*;
public class Main {

    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
     System.out.println("Hello World!");
     System.out.println("What's your name? ");
     String name = scan.nextLine();
     System.out.println("How old are you? ");
     int age = scan.nextInt();
     System.out.print("What's your address? ");
     String address = scan.nextLine();
     System.out.println("Hi "+name+"!");
     System.out.println("You are "+ age + "years old!");
     System.out.println("You live at" + address);
    }
}
