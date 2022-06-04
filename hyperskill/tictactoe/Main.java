package tictactoe;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner  cells = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String input = cells.nextLine();

        printBoard(input);
        int position = getValidatePosition();
        String game = placeX(input,position);
        gameState(game);
    }
    public static String placeX(String input,int position){
        String newBoard = "";
        boolean xIsplaced = false;
        while(!xIsplaced) {
            switch (position) {
                case 11:
                    if (input.charAt(0) == '_') {
                        newBoard = "X" + input.substring(1, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                break;
                case 12:
                    if (input.charAt(1) == '_') {
                        newBoard = input.charAt(0)+ "X" + input.substring(2, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 13:
                    if (input.charAt(2) == '_') {
                        newBoard = input.substring(0,2)+"X" + input.substring(3, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 21:
                    if (input.charAt(3) == '_') {
                        newBoard = input.substring(0,3)+"X" + input.substring(4, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 22:
                    if (input.charAt(4) == '_') {
                        newBoard = input.substring(0,4)+"X" + input.substring(5, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 23:
                    if (input.charAt(5) == '_') {
                        newBoard = input.substring(0,5)+"X" + input.substring(6, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 31:
                    if (input.charAt(6) == '_') {
                        newBoard = input.substring(0,6)+"X" + input.substring(7, 9);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 32:
                    if (input.charAt(7) == '_') {
                        newBoard = input.substring(0,7)+"X" + input.charAt(8);
                        xIsplaced = true;
                    } else {
                        System.out.println("This cell is occupied! Choose another one!");
                        position = getValidatePosition();
                    }
                    break;
                case 33:
                    if (input.charAt(8) == '_') {
                        newBoard = input.substring(0, 8)+"X";
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
                //notANumber = false;
                continue;
            }

            correctCoordinates =true;

        }
        return position;
    }
