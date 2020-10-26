import java.io.*;
class SavingsAccount{
    static private double annualInterestRate;
    private double savingsBalance;
    public static void modifyIntrestRate(double interest){
        annualInterestRate=interest;
    }
    public SavingsAccount(){
        savingsBalance=0.0;
    }
    public SavingsAccount(double amount){
        savingsBalance=amount;
    }
    double calculateMonthlyInterest(){
        savingsBalance+=((double)(savingsBalance*annualInterestRate)/12);
        return savingsBalance;
    }
   
}
public class Experiment3{
    public static void main(String args[]){
    SavingsAccount saver1=new SavingsAccount(2000.00);
    SavingsAccount saver2=new SavingsAccount(3000.00);
    SavingsAccount.modifyIntrestRate(0.04);
    System.out.println("Balances when interest is 4%");
    System.out.println("saver1 = "+saver1.calculateMonthlyInterest());
    System.out.println("saver2 = "+saver2.calculateMonthlyInterest());
    System.out.println();
    SavingsAccount.modifyIntrestRate(0.05);
    System.out.println("Balances when interest is 5% in next month");
    System.out.println("saver1 = "+saver1.calculateMonthlyInterest());
    System.out.println("saver2 = "+saver2.calculateMonthlyInterest());
    }
}




