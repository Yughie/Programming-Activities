/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author YUGHIE
 */
public class Deposit extends ATM{
      private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString(){
         
         return super.toString() + "New Balance: " + (super.getBalance() + this.amount);
    }
    
}
