package banking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static HashMap<Integer,Long> accounts = new HashMap();
    public static void main(String[] args) {
        System.out.println(startMenu());
        String choice = input();
        boolean logedIn = false;
        while (!choice.equals("0")) {
            if (choice.equals("1")) {
                Account account = new Account();
                accounts.put(account.cardPin(), account.cardNumber());
                System.out.println(account.toString());
            } else if (choice.equals("2")) {
                logedIn = logINMenu();
                if(logedIn){
                    System.out.println(balanceMenu());
                    choice = input();
                    if(choice.equals("1")){
                        boolean displayBalance = true;
                        while (displayBalance){
                            System.out.println("Balance: 0");
                            System.out.println(balanceMenu());
                            String balanceChoice = input();
                            if(balanceChoice.equals("0")){
                                System.out.println("Bye!");
                                return;
                            }else if(balanceChoice.equals("2")){
                                displayBalance = false;
                            }
                        }
                    }
                }
            }

            System.out.println(startMenu());
            choice = input();

        }
        System.out.println("Bye!");
    }

    public static boolean logINMenu(){
        System.out.println("Enter your card number:");
        long number = Long.parseLong(input());
        System.out.println("Enter your PIN:");
        int pin = Integer.parseInt(input());

        if(accounts.containsKey(pin) && accounts.containsValue(number)){
            System.out.println("You have successfully logged in!");
            return true;
        }else{
            System.out.println("Wrong card number or PIN!");
        }

        return false;
    }
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static String balanceMenu(){
        String menu = String.format("%s\n%s\n%s",
                "1. Balance",
                "2. Log out",
                "0. Exit");
        return menu;
    }

    public static String startMenu(){
        String menu = String.format("%s\n%s\n%s",
                "1. Create an account",
                "2. Log into account",
                "0. Exit");
        return menu;
    }
}