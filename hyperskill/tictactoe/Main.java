package tictactoe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String dashes = "---------";
        String input = scan.next();
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
}
