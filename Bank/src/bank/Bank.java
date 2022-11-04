/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author YUGHIE
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        ATM atm1 = new ATM();
        
        atm1.inputPIN();
        atm1.chooseMode();
        
        
        
    }
    
}
