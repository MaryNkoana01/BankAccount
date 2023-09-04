public class Main {
    public static void main(String[] args) {
        Bank_Account bank_account = new Bank_Account();
        bank_account.accountDetails(123456789,"Mary","Savings",2000);
        bank_account.deposit(100);
        bank_account.display();
        bank_account.withdraw(500);
        bank_account.checkBalance();

        System.out.println(bank_account.getAccountNumber());
        System.out.println(bank_account.getCustomerName());
        System.out.println(bank_account.getAmount());
        System.out.println(bank_account.getAccountType());
    }
}
