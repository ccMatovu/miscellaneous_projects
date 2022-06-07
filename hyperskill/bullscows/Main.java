package bullscows;
import java.util.Scanner;
import java.util.*;
public class Main {
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please, enter the secret code's length:\n>");
//        int digits = scan.nextInt();
//        System.out.println("Okay, let's start a game!");
//        ArrayList<Integer> randomNum = getRandomNumber(digits);
//        ArrayList<Integer> ran2 = getRandomNumber2(digits);
//        System.out.println("random number is = "+randomNum);
//        System.out.println("random number is = ran 2 =  "+ran2);
//        boolean notGuessed = true;
//        int turns = 0;
//        while (notGuessed){
//            turns++;
//            System.out.print("Turn "+turns+":\n> ");
//            String[]  input = scan.next().split("");
//            ArrayList<String> guess = new ArrayList<>(Arrays.asList(input));
//           // System.out.println("guess is = "+guess);
//            String result = grader(randomNum, guess);
//            if(Character.getNumericValue(result.charAt(7)) == digits){
//                System.out.println("Grade: 4 bulls\nCongratulations! You guessed the secret code.\n");
//                notGuessed = false;
//            }else{
//                System.out.println(result);
//            }
//
//        }
//        //System.out.println("  digits = "+digits+"  rand= "+randomNum);
//       // System.out.println("The random secret number is "+randomNum+".");
//
//    }
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Please, enter the secret code's length:\n");
    int digits = scan.nextInt();
    String secretCode = getRandomNumber2(digits);
    System.out.println("The random secret number is "+secretCode);


    }

    public static String getRandomNumber2(int digits){
        if(digits > 10){
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
            return "";
        }
        ArrayList<Integer> number = new ArrayList<>();
        String secret = "";
        int length  = 0;
        while(length < digits){
            Random random = new Random();
            int num = random.nextInt(10);
            if(length == 0 && num == 0){
                continue;
            }
            if(number.contains(num)){
                continue;
            }else{
                number.add(num);
                secret = secret+ num;
                ++length;
            }
        }
        return secret;
    }
    public static ArrayList<Integer> getRandomNumber(int digits){
        if(digits > 10){
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
            //return;
        }
        StringBuilder randomNumber = new StringBuilder();
        int numOfDigits = digits;
        long pseudoRandomNumber = System.nanoTime();
        //System.out.println(pseudoRandomNumber);
        String pRand = String.valueOf(pseudoRandomNumber);
        ArrayList<Integer> randomNums = new ArrayList<>();
        for(int i=pRand.length()-1,  j =0; j<numOfDigits; j++ ,i--){
            int digit = Character.getNumericValue(pRand.charAt(i));
            if(!randomNums.contains(digit)){
                randomNums.add(digit);
                randomNumber.append(digit);
            }else {
                numOfDigits++;
            }
            if(i == 0){
                pseudoRandomNumber = System.nanoTime();
                pRand = String.valueOf(pseudoRandomNumber);
                randomNums.clear();
                randomNumber.setLength(0);
                j =0;
                i = pRand.length()-1;
                numOfDigits = digits;
                System.out.println(pRand);
            }
        }
        //return randomNumber.toString();
        return randomNums;
    }
    public static String grader(ArrayList<Integer> code, ArrayList<String> guess){
        int cows = 0;
        int bulls = 0;
        for(int i =0; i<guess.size(); i++){
            Integer num = Integer.parseInt(guess.get(i));
            if(code.contains(num)){
                if(code.indexOf(num) == i){
                    bulls++;
                }else{
                    cows++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Grade: ");
        sb.append(bulls);
        sb.append(" bull and ");
        sb.append(cows);
        sb.append(" cow");
        return sb.toString();
    }
}
