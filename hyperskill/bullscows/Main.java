package bullscows;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input the length of the secret code:\n>");
        int digits = scan.nextInt();
        System.out.print("Input the number of possible symbols in the code:\n>");
        int symbols = scan.nextInt();
        String randomNumber = getRandomNumber(digits,symbols);

        String[] ra = range(symbols);
        String low = ra[2];
        String upp = ra[3];
        String nHigh = ra[1];
        System.out.println("Thee secret is prepared: "+randomNumber+stars(digits)+" (0-"+nHigh+", "+low+"-"+upp+").");
        System.out.println("Okay, let's start a game!");


        ArrayList<String> randomNum = new ArrayList<>(Arrays.asList(randomNumber.split("")));
        //System.out.println("random number is = "+randomNum);
        boolean notGuessed = true;
        int turns = 0;
        while (notGuessed){
            turns++;
            System.out.print("Turn "+turns+":\n> ");
            String[]  input = scan.next().split("");
            ArrayList<String> guess = new ArrayList<>(Arrays.asList(input));
           // System.out.println("guess is = "+guess);
            String result = grader(randomNum, guess);
            if(Character.getNumericValue(result.charAt(7)) == digits){
                System.out.println("Grade: "+digits+" bulls\nCongratulations! You guessed the secret code.\n");
                notGuessed = false;
            }else{
                System.out.println(result);
            }
        }
    }
    public static String getRandomNumber(int digits,int symbols){
        if(digits > 36){
            System.out.println("Error: can't generate a secret number with a length of 11 because there aren't enough unique digits.");
            return "";
        }
        String[] range = range(symbols);
        int lower = range[0].charAt(0);
        int upper = range[3].toUpperCase().charAt(0);
        if(upper == 48){
            upper = range[1].charAt(0);
        }


//        int nUpp = range[1].charAt(0);
//        int upper = (nUpp <=9) ? nUpp : range[3].toUpperCase().charAt(0);
        //System.out.println(range[3].toUpperCase());
        //System.out.println("lower = "+lower+"  uper = "+upper);
        ArrayList<Integer> number = new ArrayList<>();
        String secret = "";
        int length  = 0;
        while(length < digits){

            Random random = new Random();
            int num = random.nextInt((upper-lower)+1) + lower;
            //System.out.println("in here"+num);
            while (!Character.isLetterOrDigit(num)){
                System.out.println(num);
                num = random.nextInt(upper-lower) + lower;
            }
            if(length == 0 && num == 0){
                continue;
            }
            if(number.contains(num)){
                continue;
            }else{
               String numm = String.valueOf((char) num);
                number.add(num);
                //number.add(Character.getNumericValue(num));
                secret = secret+ numm.toLowerCase();
                ++length;
            }
        }
        System.out.println("list = "+number);
        return secret;
    }

//    public static void main(String[] args) {
//        String[] range = range(11);
//        System.out.println(Arrays.asList(range));
//        int a = range[2].charAt(0);
////        a = 64;
////        System.out.println(a);
////        System.out.println(Character.isLetterOrDigit(a));
//        System.out.println(getRandomNumber(5,11));
//    }
    public static String[] range(int num){
        String[] range = new String[4];
        String lower = "0";
        range[0] = lower;
        if(num <11){
            range[1] = String.valueOf(num-1);
            range[2] = "0";
            range[3] = "0";
            return range;
        }else{
            range[1] = "9";
            range[2] = "a";
            char upperChar =(char) (97 + (num -11)) ;
            range[3] = String.valueOf(upperChar);
        }
        return range;
    }
//    public static String randomChar(int lower,int upper){
//
//    }

    public static String grader(ArrayList<String> code, ArrayList<String> guess){
        int cows = 0;
        int bulls = 0;
        for(int i =0; i<guess.size(); i++){
            String num = guess.get(i);
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
    public static String stars(int num){
        int count = 0;
        String starsNum = "";
        while(count<num){
            starsNum = starsNum+"*";
            count++;
        }
        return starsNum;
    }
}
