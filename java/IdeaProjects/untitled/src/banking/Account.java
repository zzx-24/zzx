package banking;

public class Account {
    private double init_balance;
    public Account (){}
    public Account (double init_balance){
        this.init_balance = init_balance;
    }
    public void setAccount (double init_balance){
        this.init_balance = init_balance;
    }
    public double getAccount (){
        return init_balance;
    }
    public  void deposit (double init_balance){
        this.init_balance = this.init_balance + init_balance;
    }
    public  void withdraw (double init_balance){
        this.init_balance = this.init_balance - init_balance;
    }

    @Override
    public String toString() {
        return "The account has a balance of "+init_balance ;
    }

}
