/*
 * AP CS Bank Account
 * Eric Stevens
 * 1/26/16
 */
import javax.swing.*;

public class bankAccount
{
  private int wthdrwl_select;
  
  private int depst_select;
  private double depst_amnt,acct_bal;
  public String acct_mssg;
  
  public void deposit(double amount) 
  {
    
    if(amount < 0)
    {
      JOptionPane.showMessageDialog(null,"You can't deposit anything less than $1!");
    }
    else if(amount > 0)
    {
      acct_bal = acct_bal + amount;
      JOptionPane.showMessageDialog(null,"$ " + amount + " have been deposited into your account");
    }
  }
  
  
  public void withdrawl(double amount)
  {
    
    if(amount > acct_bal)
    {
      JOptionPane.showMessageDialog(null,"You can't withdrawl more than what you have!");
    }
    else if(amount <= acct_bal)
    {
      acct_bal = acct_bal - amount;
      JOptionPane.showMessageDialog(null,"$" + amount + " have been withdrawn from your account");
    }
  }
  
  
  public double view_bal()
  {
    return acct_bal;
  }
}