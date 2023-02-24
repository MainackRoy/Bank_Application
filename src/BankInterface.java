public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String wothdraw(int amount,String enterPassword);
    double calculateInterest(int time);
}
