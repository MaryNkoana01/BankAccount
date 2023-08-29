package org.example;

public class Bank_Account {
    String customerName;
    float amount;
    int accountNumber;
    String accountType;

    public void accountDetails(int accountNumber,float amount,String customerName,String accountType){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.amount = amount;
    }

    public static void main(String[] args) {


    }
}