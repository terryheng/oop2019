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
static String password, loginPass, username, loginUser;
    static boolean login = true;
    static boolean checkvalid = false;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner read=new Scanner(System.in);
        ArrayList<String>Module=new ArrayList<String>();
        int option=0;
        String name;
        String pass;
        outerloop:
        while (option==0){
            System.out.println("+-------------------------+");
        System.out.println("|   1" + "\t|" + "Sign Up          |");
        System.out.println("|-------------------------+");
        System.out.println("|   2" + "\t|" + "Sign In          |");
        System.out.println("|-------------------------+");
        System.out.println("|   3" + "\t|" + "Exit             |");
        System.out.println("+-------------------------+");
        System.out.println("Your selection:");
        int num = sc.nextInt();
 // Sign up  
           switch (num) {
           case (1): {
                 System.out.println("Enter a desired username: \n");
                 username = sc.next();

                System.out.println("Enter a desired password: \n");
                password = sc.next();

               System.out.println("Thank you, please log in.\n");
               }
               System.out.println("Press 0 to main menu");
               option=sc.nextInt();
               break;     
// Login page    
   
           case (2): {
          while (login) {
        checkvalid = false;
        System.out.println(" ------------------ \n" + "Username: \n");
        loginUser = sc.next();
        System.out.println("Password: \n");
        loginPass = sc.next();

        if (loginUser.equals(username) && (loginPass.equals(password))) {
            checkvalid = true;
            login = false;
            System.out.println("You have logged in.");
        } else {
            checkvalid = false;
            System.out.println("Incorrect username or password");
        }
      }
          
    }
   // Main Program
        System.out.println("+----------------------------------+");
        System.out.println("|-----------  PROGRAM  ------------|");
        System.out.println("+----------------------------------+");
        System.out.println("Please Enter the Following Detail :");
        System.out.print("Name:");
        name = sc.next();
        for(int counter=0; counter<5; counter++){
            System.out.println("Please enter your module");
            String module = read.nextLine();
            Module.add(module);
        }
        for (String module: Module){
            System.out.println("Modules = "+ module);
        }break outerloop;
 }
        }
    }
}
