/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2019;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Project2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("+-------------------------+");
        System.out.println("|   1" + "\t|" + "Sign Up          |");
        System.out.println("|-------------------------+");
        System.out.println("|   2" + "\t|" + "Sign In          |");
        System.out.println("|-------------------------+");
        System.out.println("|   3" + "\t|" + "Exit             |");
        System.out.println("+-------------------------+");
        System.out.println("Your selection:");
        int selection = input.nextInt();
   
 // Sign up       
// Login page    
   
    String Username;
    String Password;

    Password = "123";
    Username = "123";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) {

        System.out.println("Access Granted! Welcome!");
    }

    else if (username.equals(Username)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }
    
    
    //Main
       
        System.out.println("+----------------------------------+");
        System.out.println("|-----------  PROGRAM  ------------|");
        System.out.println("+----------------------------------+");
        System.out.println("Please Enter the Following Detail :");
        System.out.print("Name:");
        String name = input.next();
        System.out.println("Module:");
        String module = input.next();
        String module2 = input.next();
        System.out.println("+-------------------------------+");
        System.out.println("|     The Module Registered     |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1.| " + module + "                         |");
        System.out.println("| 2.| " + module2  + "                         |");
        System.out.println("+-------------------------------+");
}
    }
    

