public class Bank_Account {
    private String customerName;
    private float amount;
    private int accountNumber;
    private String accountType;

    public void accountDetails(int accountNumber,String customerName,String accountType,float amount){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.amount = amount;
    }

    public String getCustomerName(){
        return customerName;
    }

    public float getAmount(){
        return amount;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountType(){
        return accountType;
    }

    public void deposit(float deposit){
        amount = amount + deposit;
        System.out.println("Deposited Amount: "+ deposit);
    }
    public void withdraw(float withdrawalAmount){
        if(amount > withdrawalAmount){
            amount = amount - withdrawalAmount;
            System.out.println("Amount withdrawn: "+ withdrawalAmount);
            System.out.println("Balance amount: "+ amount);
        }
        else{
            System.out.println("Insufficient Amount, available amount: "+ amount);
        }

    }
    public void checkBalance(){
        System.out.println("Current balance is: "+ amount);
    }

    public void display(){
        System.out.println(accountNumber +" "+ customerName + " " + accountType + " " + " " + amount);
    }



}
