package banking;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Card {
    private long number;
    private int pin;

    @Override
    public String toString() {
        return String.format("The card number is = %d \nThe pin is = %d",getNumber(),getPin());
    }

    public Card(){
        number = Long.parseLong(generateNumber());
        pin    = Integer.parseInt(generatePin());
    }

    public int getPin() {
        return pin;
    }

    public long getNumber() {
        return number;
    }

    public  String generatePin(){
        StringBuilder pin = new StringBuilder();
        for(int i = 0; i<4; i++){
            int digit = ThreadLocalRandom.current().nextInt(0,10);
            pin.append(digit);
        }
        return pin.toString();
    }


    public  String generateNumber(){
        StringBuilder number = new StringBuilder();
        Random num = new Random();
        number.append(4);
        for(int i =0; i<15; i++){
            int newNum = num.nextInt(10);
            number.append(newNum);
        }
        return number.toString();
    }

    public void getArrayNumber() {
        ArrayList<Integer> number = new ArrayList<>();
        Random num = new Random();
        number.add(4);
        for(int i =0; i<15; i++){
            int newNum = num.nextInt(10);
            number.add(newNum);
        }
        System.out.println(number.toString());
    }

}