/*
Date: 03/23/2019
Created by: J White
Task: Create a Java console banking application

Should have two classes: Main, BankAccount
Main should only create the BankAccount instance. You will have to pass in showMenu to start the app
Example: BankAccount bankAccount
BankAccount will have:

fields:
userName;
balance;
customerId;

methods:
void deposit(int amount){}
void withdraw(int amount){}
void showMenu(){}
!-This will have Scanner and System.out.print's to display the menu

!-Hint will require a loop to keep the app running, and a switch statement to give the user the ability to enter in menu choices.

Menu will look something like this:

Welcome (username)
Your ID is (userId)

Check Balance
Withdraw
Deposit
Exit
Enter an option:

The user should not be able to withdraw more funds than his/her balance
 */

// Edited


package com.company;

//
import java.util.Scanner;
import java.util.*;
import com.company.bankAccount;

public class Main {

    public static void main(String[] args) {
	// calls the bankAccount class to run the program via showMenu
        bankAccount account = new bankAccount();

        account.showMenu();

    }
}
