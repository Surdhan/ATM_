
import java.util.*;

public class ATM_complete_project {

    public static void main(String[] args) {
        int pin = 1234;
        int balance = 100000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin"); // enter the pin 
        int password = sc.nextInt();
        //code arrengement shif +alt f
        if (password == pin) {
            System.out.println("Enter your name :");
            name = sc.next();
            System.out.println(" welcome " + name);
            while (true) {
                System.out.println(" press 1 to check balance ");
                System.out.println(" press 2 to check balance ");
                System.out.println(" press 3 to check balance ");
                System.out.println("pres 4  to take respit ");
                System.out.println("exit");

                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your balance is " + balance);
                        break;
                    case 2:
                        System.out.println("how much did you want to ADD to your account:");
                        AddAmount = sc.nextInt();
                        System.out.println("successfully creadited ");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("how much did you want to take from your account:");
                        TakeAmount = sc.nextInt();

                        if (TakeAmount > balance) {
                            System.out.println("you have not enough money in your account");
                            System.out.println("your cuurrent balace" + balance);
                        } else {
                            System.out.println("successfully taken");
                            balance = balance - TakeAmount;
                            System.err.println("current balance" + balance);

                        }
                        break;
                    case 4: {
                        System.out.println(" Welcome to Surdhan bank ATM");
                        System.out.println("avaialbe balance" + balance);
                        System.out.println(" Amount deposit" + AddAmount);
                        System.out.println(" Amount Taken" + TakeAmount);
                        System.out.println("thanks for coming");
                    }
                    break;
                    default:
                        System.out.println("press the number below 5");
                        break;
                }
                if (opt == 5) {
                    System.out.println("thanks for coming");
                    break;
                }

            }

        } else {
            System.out.println("please enter the correct pin");
        }
    }

}
