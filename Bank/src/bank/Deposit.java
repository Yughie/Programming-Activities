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
public class Deposit extends ATM{
      private double amount;

    public void setAmount() {
        System.out.println("Set Ammount to Deposit: ");
        Scanner sc = new Scanner(System.in);
        this.amount = sc.nextDouble();   
    }

    public double getAmount() {
        return amount;
    }
    
    
    
    @Override
    public String toString(){
         
         return super.toString() + "New Balance: " + super.getBalance();
    }
    
}
