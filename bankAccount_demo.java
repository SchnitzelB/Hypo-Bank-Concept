/*
 * AP CS Bank Account
 * Eric Stevens
 * 1/26/16
 */
import java.text.*; 
import javax.swing.*;

public class bankAccount_demo
{
  public static void main (String[]args)
  {
    int acct_select,prgm_select;
    
    bankAccount savings_prgm = new bankAccount();
    bankAccount checking_prgm = new bankAccount();
    bankAccount loan_prgm = new bankAccount();
    
    String name = JOptionPane.showInputDialog("What is your name?");
    do
    {
      prgm_select = Integer.parseInt(JOptionPane.showInputDialog("Hello " + name + "!" + "\n" +
                                                                 "Which of your accounts would you like to access?" + "\n" +
                                                                 "(1) Checking Account" + "\n" +
                                                                 "(2) Savings Account" + "\n" +
                                                                 "(3) Loans" + "\n" +
                                                                 "(4) Exit"));
      switch(prgm_select)
      {
      case 1:
        do{
        acct_select = Integer.parseInt(JOptionPane.showInputDialog("What would you like to access in your account?" + "\n" +
                                                                   "(1) Deposit" + "\n" +
                                                                   "(2) Withdrawl" + "\n" +
                                                                   "(3) View Balance" + "\n" +
                                                                   "(4) Exit"));
        
        
        switch(acct_select)
        {
          case 1: checking_prgm.deposit(Double.parseDouble(JOptionPane.showInputDialog("How much money would you like to deposit into your account?")));
          break;
          case 2: checking_prgm.withdrawl(Double.parseDouble(JOptionPane.showInputDialog("How much money would you like to withdrawl from your account?")));
          break;
          case 3: JOptionPane.showMessageDialog(null,"You have $" + checking_prgm.view_bal());
          break;
        }
      }
      while(acct_select!=4);
      break;
      case 2:
      do
      {
        acct_select = Integer.parseInt(JOptionPane.showInputDialog("What would you like to access in your account?" + "\n" +
                                                                   "(1) Deposit" + "\n" +
                                                                   "(2) Withdrawl" + "\n" +
                                                                   "(3) View Balance" + "\n" +
                                                                   "(4) Exit"));
        
        
        switch(acct_select)
        {
          case 1: savings_prgm.deposit(Double.parseDouble(JOptionPane.showInputDialog("How much money would you like to deposit into your account?")));
          break;
          case 2: savings_prgm.withdrawl(Double.parseDouble(JOptionPane.showInputDialog("How much money would you like to withdrawl from your account?")));
          break;
          case 3: JOptionPane.showMessageDialog(null,"You have $" + savings_prgm.view_bal());
          break;
          
        }
      }
      while(acct_select!=4);
      break;
        case 3:
       do{
        acct_select = Integer.parseInt(JOptionPane.showInputDialog("How would you like to manage your loans?" + "\n" +
                                                                   "(1) Recieve A Loan" + "\n" +
                                                                   "(2) Pay Off A loan" + "\n" +
                                                                   "(3) View Amount Due" + "\n" +
                                                                   "(4) Exit"));
        
        
        switch(acct_select)
        {
          case 1: loan_prgm.deposit(Double.parseDouble(JOptionPane.showInputDialog("How much money would you like to borrow?")));
          break;
          case 2: loan_prgm.withdrawl(Double.parseDouble(JOptionPane.showInputDialog("How much of your loan would you like to pay off?")));
          break;
          case 3: JOptionPane.showMessageDialog(null,"Total amount that is owed to the bank: $" + loan_prgm.view_bal());
          break;
        }
      }
      while(acct_select!=4);
      break;
      
      }
    }
    while(prgm_select!=4);
    
  }
}
