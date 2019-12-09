package banking;

public class Testbanking {
    public static void main(String [] args){
        Account ac = new Account(500);
        ac.withdraw(150);
        ac.deposit(22.5);
        ac.withdraw(47.62);
        System.out.println (ac.toString());
    }

}
