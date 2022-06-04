package tictactoe;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write your code here
        String gameBoard = "         ";
        String player1 = "X";
        String player2 = "O";
        boolean player1Turn = true;
        boolean player2Turn = false;
        while (!gameState(gameBoard)){
            if (player1Turn){
                int position = getValidatePosition();
                gameBoard = placeX(gameBoard,position,player1);
                player1Turn = false;
                player2Turn = true;
            }else if(player2Turn){
                int position = getValidatePosition();
                gameBoard = placeX(gameBoard,position,player2);
                player1Turn = true;
                player2Turn = false;
            }
        }
    }
    public static String placeX(String input,int position,String player){
        String newBoard = "";
        boolean xIsplaced = false;
        while(!xIsplaced) {
            switch (position) {
                case 11:
                    if (input.charAt(0) == ' ') {
                        newBoard = player + input.substring(1, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                break;
                case 12:
                    if (input.charAt(1) == ' ') {
                        newBoard = input.charAt(0)+ player + input.substring(2, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 13:
                    if (input.charAt(2) == ' ') {
                        newBoard = input.substring(0,2)+ player + input.substring(3, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 21:
                    if (input.charAt(3) == ' ') {
                        newBoard = input.substring(0,3)+ player + input.substring(4, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 22:
                    if (input.charAt(4) == ' ') {
                        newBoard = input.substring(0,4)+ player + input.substring(5, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 23:
                    if (input.charAt(5) == ' ') {
                        newBoard = input.substring(0,5)+ player + input.substring(6, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 31:
                    if (input.charAt(6) == ' ') {
                        newBoard = input.substring(0,6)+ player + input.substring(7, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 32:
                    if (input.charAt(7) == ' ') {
                        newBoard = input.substring(0,7)+ player + input.charAt(8);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 33:
                    if (input.charAt(8) == ' ') {
                        newBoard = input.substring(0, 8)+ player;
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
            }
        }
        return newBoard;
    }
    public static int getValidatePosition(){
        Scanner scan = new Scanner(System.in);
        int position = 0;
        String coordinates = "";
        boolean notANumber = false;
        boolean inValidNumber = false;
        System.out.print("Enter the coordinates: ");
        coordinates = scan.nextLine().replaceAll("\\s+","").trim();

        boolean correctCoordinates = false;
        while (!correctCoordinates ){
            String positions = "11 12 13 21 22 23 31 32 33";
            if(inValidNumber){
                System.out.println("Coordinates should be from 1 to 3!");
                System.out.print("Enter the coordinates: ");
                coordinates = scan.nextLine().replaceAll("\\s+","").trim();
            }else if (notANumber){
                System.out.println("You should enter numbers!");
                System.out.print("Enter the coordinates: ");
                coordinates = scan.nextLine().replaceAll("\\s+","").trim();
            }

            try{
                position = Integer.parseInt(coordinates);
                notANumber = false;
            }catch (NumberFormatException e){
                notANumber = true;
                continue;
            }

            if (!positions.contains(Integer.toString(position))){
                inValidNumber = true;
                continue;
            }
            correctCoordinates =true;
        }
        return position;
    }
    public static boolean gameState(String input){
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
            return true;
        }else if(threeInaRow(input,'O')){
            printBoard(input);
            System.out.println("O wins");
            return true;
        }else if(countChar(input,"_") == 0 && (countChar(input, "X") + countChar(input,"O") ==9) ){
            printBoard(input);
            System.out.println("Draw");
            return true;
        }else{
            printBoard(input);
            System.out.println("Game not finished");
        }
        return false;
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

