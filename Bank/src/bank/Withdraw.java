/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author YUGHIE
 */
public class Withdraw extends ATM{
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
        super.getBalance() -= this.amount;
    }
    
    @Override
    public String toString(){
         return super.toString() + "New Balance: " + super.getBalance();
    }
    
    
}
