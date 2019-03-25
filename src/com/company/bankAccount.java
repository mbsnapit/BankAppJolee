/*
Date: 03/23/2019
Created by: J White
bankAccount (BankAccount Class)
*/

// Edited Version / Final
package com.company;

// imports the java Scanner, Date and  library
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDateTime;

//
public class bankAccount {

    // Instance variable declaration for the bankAccount class
    String usrOpt;                                                  // variable to hold the user's bank task option
    String userName = "Ben Crobbery";                               // variable to hold user's name
    int balance;                                                    // variable to hold user's current acct balance before deposit or withdrawal
    int amount;                                                     // variable to hold the amount the user wants to deposit into their bank acct
    int debit;                                                      // variable to hold the amount the user wants to withdraw from their bank acct

    String date = java.time.LocalDate.now().toString();             // variable that hold the date and converts it to a string
    String time = java.time.LocalTime.now().toString();             // variable that hold the time and converts it to a string
    String customerId = date.replace("-", "");    // variable that hold the date as a string then removes all dashes

// Method to display menu to User
public void showMenu(){

        // App welcome message to user
        System.out.println("Welcome to Check ... On ... Your ... FORTUNE!");
        System.out.println("");

        do {
        // Displays the User's banking options main menu
        System.out.println("Welcome " + userName+ ", to the Main Menu. ");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Time: " + time);
        System.out.println("");

        Scanner scanner1 = new Scanner(System.in);

        // displays the program opinions to the user
        System.out.println("Please choose from the following options: ");
        System.out.println("1 -- Check Balance");
        System.out.println("2 -- Deposit Funds");
        System.out.println("3 -- Withdraw Funds");
        System.out.println("0 -- Exit Application");

        System.out.println("");
        System.out.print("Please enter option here: ");

        // reads in the user's input from the cursor
        usrOpt = scanner1.nextLine();
            switch (Integer.parseInt(usrOpt)) {
                case 1: // *Checks Account Balance*
                    checkBal();
                    break;
                case 2: // *Deposit*
                    deposit();
                    break;
                case 3: // *Withdraw*
                     withdraw();
                     break;
                case 0: // *Exit*
                     thankYou();
                     break;
                default: thankYou();
                     break;
            } // end of switch

        } //  end of do loop

        // will continue to run the program until the user enters in 0 to exit
        while (Integer.parseInt(usrOpt) != 0); // && (usrOpt != " " ));

} // end of showMenu method

// Method to add money to the user's account balance
public void deposit(){

        // asks user for the amount they deposit then stores that number
        System.out.print("Please enter the amount you'd like to deposit: $ ");

        //reads in the user's input and saves it to value
        Scanner scanner1 = new Scanner(System.in);
        amount = Integer.parseInt(scanner1.nextLine());

        // calculates to user's current balance including the current deposit
        balance = balance + amount;

        // prints out the current transaction information
        System.out.println("Account Funds Deposited.");
        System.out.println("You deposited: $" + amount);
        System.out.println("Your current balance is: $" + balance);
        System.out.println("==================");
        System.out.println("");

        } // end of deposit

// Method to subtract money from the user's account
public void withdraw(){

        // asks user for the amount they deposit then stores that number
        System.out.print("Please enter in the amount that you would like to withdraw: $");

        // reads in the user's input and saves it to value
        Scanner scanner1 = new Scanner(System.in);

        // converts the user's input into a integer value to perform operations on
        debit = Integer.parseInt(scanner1.nextLine());

        // checks for insufficent funds when doing an account withdrawal
        if (debit > balance)
        {
            // diplays balance information and updats to the user
            System.out.println("I am NOT a MAGICIAN! I cannot make money magically appear " + userName +". "  + userName + ", you have insufficent funds." );
            System.out.println("You TRIED to withdraw: $" + debit);
            System.out.println("Your current balance is: $" + balance);
            System.out.println("Account Funds COULD NOT be withdrawn. Have a Great Day Anyway!");
            System.out.println("==================");
            System.out.println("");

        }
        else {

                // returns the withdrawl then subtracts the ammount from the current balance
            balance = balance - debit;

            // diplays balance information and updats to the user
            System.out.println("Congrats! You withdrew: $" + debit);
            System.out.println("Your current balance is: $" + balance);
            System.out.println("Account Funds have been withdrawn. Have a Great Day!");
            System.out.println("==================");
            System.out.println("");

        }

} // end of withdraw method

// Method to check and report User's Current Transactions
public void checkBal(){

    // displays current balance information to the user.
        System.out.println("User Name: " + userName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Your current balance is: $" + balance);
        System.out.println("==================");
        System.out.println("");

} // end of checkBal method


public void thankYou(){

    // displays a thank you message to the user as the program closes

        System.out.println("Thank You, " + userName + " for using the Check ... Your ... FORTUNE Banking Station! By the way, Have a Great Day!");
        System.out.println("==================");
 } // end of method

} // End of class
