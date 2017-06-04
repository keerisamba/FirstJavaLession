/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package account;

/**
 *
 * @author hnd
 */
public class Account {
    private double balance;
    
    public void deposit( double d)
    {
        balance = balance + d;
    }
    
    public void withdraw ( double w)
    {
        balance = balance - w;
    }
    
    public double getBalance()
    {
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account a1 = new Account();
        a1.deposit(1000.00);
        Account a2 = new Account();
        a1.deposit(500.00);
                System.out.printf("bal:"+ a1.getBalance());
        
    }
    
}
