/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.is3806;

import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author Kyle
 */
public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!\n------------\n"); //in-class example to print
        
        //calculator part starts
        Scanner select = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        int mnum; // menu number
        double fnum; // first number
        double snum; // second number
        double answer; // the answer
        
        System.out.println("Select the function you would like to use.\n 1.) Addition\n 2.) Subtraction\n 3.) Division\n"); //menu for calculator
        
        mnum = input.nextInt();
        
            while(mnum < 1 || mnum > 3){
                
                System.out.println("The number you selected does not represent an option.\n 1.) Addition\n 2.) Subtraction\n 3.) Division");
                mnum = input.nextInt();
                //this while loop will check to make sure the user does not select an invalid option
                //if they do, they will be stuck in the loop until they select a proper option
            }
            switch(mnum){
                //depending on the option selected, the calculator will add, subtract, or divide
                
                case 1:
                    System.out.println("You chose addition! Good for you!\n");
                    System.out.println("Enter the first number to add:");
                    fnum = input.nextDouble();
                    System.out.println("Enter the second number to add: ");
                    snum = input.nextDouble();
                    
                    answer = fnum + snum;
                    System.out.println("The answer is: ");
                    System.out.println(answer);
                    //asks for user input, stores each value in the corresponding variable, adds them, prints them out
                    break;
                    
                case 2:
                    System.out.println("A healthy number 2! Subtraction!\n");
                    System.out.println("Enter the number to subtract from:");
                    fnum = input.nextDouble();
                    System.out.println("Enter the number to subtract by: ");
                    snum = input.nextDouble();
                    
                    answer = fnum - snum;
                    System.out.println("The answer is: ");
                    System.out.println(answer);
                    //asks for user input, stores each value in the corresponding variable, subtracts them, prints them out
                    break;
                    
                case 3:
                    System.out.println("Division!\n");
                    System.out.println("Enter the number you want to divide:");
                    fnum = input.nextDouble();
                    System.out.println("Enter the number you want to divide by: ");
                    snum = input.nextDouble();
                    
                    answer = fnum / snum;
                    System.out.println("The answer is: ");
                    System.out.println(answer);
                    //asks for user input, stores each value in the corresponding variable, adds them, prints them out
                    break;
            }
    }
    
}

