package banking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        System.out.println(startMenu());
        String choice = input();
        if(choice.equals("1")){
            Account account = new Account();
            accounts.add(account);
            System.out.println(account.toString());
        }else if(choice.equals("2")){

        }
        Account account = new Account();
        System.out.println(account.toString());
    }

    public static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        String input = scanner.nextLine();
        System.out.println("\n");
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
