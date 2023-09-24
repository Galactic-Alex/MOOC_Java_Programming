
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthew = new Account("Matthews account", 1000.00);
        Account myAcc = new Account("My account", 0.00);
        matthew.withdrawal(100.00);
        myAcc.deposit(100.00);
        System.out.println(matthew);
        System.out.println(myAcc);
    }
}
