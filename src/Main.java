import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name, Password & Initial Balance");
        String name=sc.next();
        String password=sc.next();
        int balance=sc.nextInt();

        SBIAcc mainackAcc=new SBIAcc(name,balance,password);

        System.out.println("Your account hass been created with account number: "+mainackAcc.getAccNum());

        //getBalance
        System.out.println(" Your current balance is : " +mainackAcc.getBalance());

        //deposit
        System.out.println(mainackAcc.depositMoney(500));
        System.out.println("New Balance is: "+mainackAcc.getBalance());

        //withdraw
        System.out.println("Enter the amount to be withdrawn: ");
        int amount=sc.nextInt();
        System.out.println("Enter your Password");
        String enteredPassword=sc.next();
        System.out.println(mainackAcc.wothdraw(amount,enteredPassword));

        //interest
        System.out.println("Interest on current balance: " +mainackAcc.getBalance() + " is " +mainackAcc.calculateInterest(4));
    }
}