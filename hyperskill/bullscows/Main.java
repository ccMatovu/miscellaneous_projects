package bullscows;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        String[]  input = scan.nextLine().split("");
        ArrayList<Integer> code = new ArrayList<>();
        int secret = 9305;
        ArrayList<String> guess = new ArrayList<>(Arrays.asList(input));
        code.add(9);
        code.add(3);
        code.add(0);
        code.add(5);

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
        System.out.println("Grade: "+bulls+" bulls(s) and "+cows+" cow(s). The secret code is "+secret+".");


    }
//    public static String grader(int code,int guess){
//
//    }
}
