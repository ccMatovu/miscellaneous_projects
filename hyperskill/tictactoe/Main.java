package tictactoe;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String input = scan.next();

        if(countChar(input,"X")-2 >= countChar(input,"O")){
            printBoard(input);
            System.out.println("Impossible");
        }else if(countChar(input,"O")-2 >= countChar(input,"X")){
            printBoard(input);
            System.out.println("Impossible");
        } else if (threeInaRow(input,'X') && (threeInaRow(input,'O'))){
            printBoard(input);
            System.out.println("Impossible");
        }else if (threeInaRow(input,'X')){
            printBoard(input);
            System.out.println("X wins");
        }else if(threeInaRow(input,'O')){
            printBoard(input);
            System.out.println("O wins");
        }else if(countChar(input,"_") == 0 && (countChar(input, "X") + countChar(input,"O") ==9) ){
            printBoard(input);
            System.out.println("Draw");
        }else{
            printBoard(input);
            System.out.println("Game not finished");
        }


    }
    public static void printBoard(String input){
        String dashes = "---------";
        String play1 = ""+ input.charAt(0);
        String play2 = ""+ input.charAt(1);
        String play3 = ""+ input.charAt(2);
        String play4 = ""+ input.charAt(3);
        String play5 = ""+ input.charAt(4);
        String play6 = ""+ input.charAt(5);
        String play7 = ""+ input.charAt(6);
        String play8 = ""+ input.charAt(7);
        String play9 = ""+ input.charAt(8);

        System.out.println(dashes+"\n| "+play1+" "+play2+" "+play3+" |");
        System.out.println("| "+play4+" "+play5+" "+play6+" |");
        System.out.println("| "+play7+" "+play8+" "+play9+" |\n"+dashes);
    }
    public static boolean threeInaRow(String input,char c){
        if ((input.charAt(0) == c) && (input.charAt(1) == c) && (input.charAt(2) == c)) {
            return true;
        }
        if ((input.charAt(3) == c) && (input.charAt(4) == c) && (input.charAt(5) == c)) {
            return true;
        }
        if ((input.charAt(6) == c) && (input.charAt(7) == c) && (input.charAt(8) == c)) {
            return true;
        }
        if ((input.charAt(0) == c) && (input.charAt(3) == c) && (input.charAt(6) == c)) {
            return true;
        }
        if ((input.charAt(1) == c) && (input.charAt(4) == c) && (input.charAt(7) == c)) {
            return true;
        }
        if ((input.charAt(2) == c) && (input.charAt(5) == c) && (input.charAt(8) == c)) {
            return true;
        }
        if ((input.charAt(0) == c) && (input.charAt(4) == c) && (input.charAt(8) == c)) {
            return true;
        }
        if ((input.charAt(2) == c) && (input.charAt(4) == c) && (input.charAt(6) == c)) {
            return true;
        }
        return false;
    }
    public static int countChar(String input, String cha){
        String[] characters = input.split("");
        int sum = 0;
        for (String ch : characters){
            if (ch.equals(cha)) {
                ++sum;
            }
        }
        return sum;
    }
}
