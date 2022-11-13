public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println(bankAccount.getAmount());
            }catch (LimitException ae){
                try {
                    bankAccount.withDraw(bankAccount.getAmount());
                }catch (LimitException ea){
                    throw new RuntimeException(ea);
                }
                System.out.println(bankAccount.getAmount());
                break;
            }
        }

    }
}