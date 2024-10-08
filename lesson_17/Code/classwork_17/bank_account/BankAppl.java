package classwork_17.bank_account;

import classwork_17.bank_account.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(121L,"Adam Smith", "Bank1", 1,100);

        bankAccount.display();

        System.out.println(bankAccount);
        BankAccount bankAccount1 = new BankAccount(122L,"Pit","Bank2",12);
        bankAccount1.display();
        BankAccount bankAccount2 = new BankAccount(123L,"Jak","Bank3", 30,300000);
        bankAccount2.display();

        bankAccount.deposit(500);
        bankAccount.display();
        bankAccount1.deposit(300);
        bankAccount1.display();
        System.out.println("==================\n");
        bankAccount.withdraw(500);
        bankAccount.display();
        bankAccount.withdraw(200);
        bankAccount.display(); //Todo



        
        
    }
}
