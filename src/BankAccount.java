import java.util.Random;

public class BankAccount {
     private int amount;
   double putMoney;
    int getMoney;

    public int getAmount() {
        return amount;
    }

    public void deposit(Integer putMoney){
       amount = amount + putMoney;

   }
   public  void withDraw(Integer getMoney)throws LimitException {
       if (amount < getMoney){
           throw new LimitException("твой счет :" + amount, amount);
       }
       else {
           amount = amount - getMoney;
       }
   }

}
