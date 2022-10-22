/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author YUGHIE
 */
class ATM {
    private int pin;
    private int accountNumber;
    private double balance;

   public ATM(){
       this.pin = 1234;
       this.accountNumber = 123456789;
       this.balance = 5000;
   }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getChoice() {
        return choice;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
    
    
    public void inputPIN(){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter PIN : ");
            this.pin = sc.nextInt();
            if(this.pin != 1234){    
                System.out.println("Wrong PIN");
            }
        }
        while(this.pin != 1234);
    }
    
    private int choice = 0;

    
    public void chooseMode(){
        Scanner sc = new Scanner(System.in);
        do{
            
        System.out.println("Choose mode : ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        this.choice = sc.nextInt();
        } while(this.choice < 1 && this.choice > 2);
        
        if(this.choice == 1){
            
        }
        else{
            
        }
    }
    
    public String toString(){
        return "Account Number: " + this.accountNumber + "\n" + "Balance: " + this.getBalance() + "\n";
    }
    
    
}
