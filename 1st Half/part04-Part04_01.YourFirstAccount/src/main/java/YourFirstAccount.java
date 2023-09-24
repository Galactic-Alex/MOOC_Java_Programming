
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account = new Account("My account", 100.00);
        account.deposit(20.00);
        System.out.println(account);
    }
}
