package bullscows;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int digits = scan.nextInt();
        //String[]  input = scan.nextLine().split("");
        ArrayList<Integer> code = new ArrayList<>();
        int secret = 9305;
       // ArrayList<String> guess = new ArrayList<>(Arrays.asList(input));
        code.add(9);
        code.add(3);
        code.add(0);
        code.add(5);
//        String result = grader(code, guess);
//        System.out.println(result+secret+".");
        
        String randomNum = getRandomNumber(digits);

        System.out.println("  digits = "+digits+"  rand= "+randomNum);

    }
    public static String getRandomNumber(int digits){
        int numOfDigits = digits;
        long pseudoRandomNumber = System.nanoTime();
        System.out.println(pseudoRandomNumber);
        String pRand = String.valueOf(pseudoRandomNumber);
        ArrayList<Integer> randomNums = new ArrayList<>();
        for(int i=pRand.length()-1,  j =0; j<numOfDigits; j++ ,i--){
            int digit = Character.getNumericValue(pRand.charAt(i));
            if(!randomNums.contains(digit)){
                randomNums.add(digit);
            }else {
                numOfDigits++;
            }
            if(i == 0){
                pseudoRandomNumber = System.nanoTime();
                pRand = String.valueOf(pseudoRandomNumber);
                randomNums.clear();
                j =0;
                i = pRand.length()-1;
                numOfDigits = digits;
                System.out.println(pRand);
            }
        }
        return randomNums.toString();
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
        sb.append(" bull(s) and ");
        sb.append(cows);
        sb.append(" cow(s). The secret code is ");
        return sb.toString();
    }
}
