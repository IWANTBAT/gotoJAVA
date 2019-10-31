/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 账户;
public class 账户 {
    public static void main(String[] args) {
       Account account = new Account(1122,20000);
       account.setannualInterestRate(4.5);
       account.withDraw(2500);
       account.deposit(3000);
       System.out.println("余额为："+ account.getbalance() );
       System.out.println("月利息为："+ account.getMonthlyInterestRate());
       System.out.println("开户日期为："+ account.detdateCreated()); 
    }
}
class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date dateCreated = new java.util.Date();
    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    Account(int newid,double newbalance){
        id = newid;
        balance = newbalance;
    }
    int getid(){
        return id;
    }
    double getbalance(){
        return balance;
    }
    double getannualInterestRate(){
        return annualInterestRate;
    }
    void setid(int newid){
        id = newid;
    }
    void setbalance(double newbalance){
        balance = newbalance;
    }
    void setannualInterestRate(double newannualInterestRate){
        annualInterestRate = newannualInterestRate;
    }
    java.util.Date detdateCreated(){      
        return dateCreated;
    }
    double getMonthlyInterestRate(){
        return balance*((annualInterestRate/100)/12);
    }
    void withDraw(double newbalance){
        balance = balance - newbalance;
    }
    void deposit(double newbalance){
        balance = balance + newbalance;
    }
}