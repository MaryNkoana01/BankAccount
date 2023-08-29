package org.example;

public class Bank_Account {
    String customerName;
    float amount;
    int accountNumber;
    String accountType;

    public void accountDetails(int accountNumber,String customerName,String accountType,float amount){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.amount = amount;
    }

    public void display(){
        System.out.println(accountNumber +" "+ customerName + " " + accountType + " " + " " + amount);
    }
    public void deposit(float deposit){
        amount = amount + deposit;
        System.out.println("Deposited Amount: "+ deposit);
    }


    public static void main(String[] args) {
        Bank_Account b = new Bank_Account();
        b.accountDetails(123456789,"Mary","Savings",2000);
        b.deposit(100);
        b.display();


    }
}