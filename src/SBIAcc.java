import java.util.UUID;

public class SBIAcc implements BankInterface{
    private String name;
    private String accNum;
    private int balance;
    private String password;

    public SBIAcc(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest=6.6;
        this.accNum= String.valueOf(UUID.randomUUID());//Universally Unique Identifier
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    private double rateOfInterest;
    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        return "Paisa hi Paisa" +amount;
    }

    @Override
    public String wothdraw(int amount,String enterPassword) {
        if(enterPassword.equals(this.password))
        {
          if(balance<amount)
          {
              return "Paisa Nahi Hai Bhai";
          }
          else{
              balance-=amount;
              return "leh liya nah!";
          }
        }
        else
        {
            return "Yeh Sab Doglapan Hai";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100;
    }
}
