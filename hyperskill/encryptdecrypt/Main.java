package encryptdecrypt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String m = "we found a treasure!";
//        System.out.println(reverse(m));
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        int amount = scanner.nextInt();
//        System.out.println(shift(input,amount));
//        System.out.println(getPosition("b"));
//        System.out.println(encrypt("Welcome to hyperskill!",5));
//        System.out.println(decrypt("\\jqhtrj%yt%m~ujwxpnqq&",5));
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        String message = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("code in = "+code+"  meass is = "+message+"   amoun is= "+amount);
        if(code.equals("enc")){
            System.out.println(encrypt(message,amount));
        }else{
            System.out.println(decrypt(message,amount));
        }

    }
    public static String decrypt(String message,int amount){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<message.length();i++){
            char ch = message.charAt(i);
            char newCh = (char) (ch - amount);
            sb.append(newCh);
        }
        return sb.toString();
    }
    public static String encrypt(String message, int amount){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<message.length(); i++){
            char ch = message.charAt(i);
            char newCh = (char) (amount + ch);
            sb.append(newCh);
        }
        return sb.toString();
    }
    public static String shift(String message,int key){
        final int LETTERS_OF_ALPHABET = 26;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<message.length();i++){
            char ch = message.charAt(i);
            if(Character.isLetter(ch)){
                String letter = String.valueOf(ch);
                System.out.println("the let5tere is = "+letter);
                int position = getPosition(letter.toLowerCase());
                int newPosition = (position + key) % LETTERS_OF_ALPHABET;
                letter = getLetter(newPosition);
                sb.append(letter);
            }else{
                sb.append(String.valueOf(ch));
            }
        }
        return sb.toString();
    }
    public static String reverse(String message){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(Character.isLetter(ch)) {
                sb.append(getReverseLetter("" + ch));
            }else {
                sb.append(""+ch);
            }
        }
        return sb.toString();
    }

    public static String getLetter(int position) {
        Map<Integer,String> alphabet = new HashMap<>();
        alphabet.put(1,"a");
        alphabet.put(2,"b");
        alphabet.put(3,"c");
        alphabet.put(4,"d");
        alphabet.put(5,"e");
        alphabet.put(6,"f");
        alphabet.put(7,"g");
        alphabet.put(8,"h");
        alphabet.put(9,"i");
        alphabet.put(10,"j");
        alphabet.put(11,"k");
        alphabet.put(12,"l");
        alphabet.put(13,"m");
        alphabet.put(14,"n");
        alphabet.put(15,"o");
        alphabet.put(16,"p");
        alphabet.put(17,"q");
        alphabet.put(18,"r");
        alphabet.put(19,"s");
        alphabet.put(20,"t");
        alphabet.put(21,"u");
        alphabet.put(22,"v");
        alphabet.put(23,"w");
        alphabet.put(24,"x");
        alphabet.put(25,"y");
        alphabet.put(26,"z");
        return alphabet.get(position);
    }
    public static Integer getPosition(String letter) {
//        Map<String,Integer> alphabet = Map.of("a",1,"b",2,"c",3,"d",4,
//        "e",5,"f",6);
        Map<String,Integer> alphabet = new HashMap<>();
        alphabet.put("a",1);
        alphabet.put("b",2);
        alphabet.put("c",3);
        alphabet.put("d",4);
        alphabet.put("e",5);
        alphabet.put("f",6);
        alphabet.put("g",7);
        alphabet.put("h",8);
        alphabet.put("i",9);
        alphabet.put("j",10);
        alphabet.put("k",11);
        alphabet.put("l",12);
        alphabet.put("m",13);
        alphabet.put("n",14);
        alphabet.put("o",15);
        alphabet.put("p",16);
        alphabet.put("q",17);
        alphabet.put("r",18);
        alphabet.put("s",19);
        alphabet.put("t",20);
        alphabet.put("u",21);
        alphabet.put("v",22);
        alphabet.put("w",23);
        alphabet.put("x",24);
        alphabet.put("y",25);
        alphabet.put("z",26);
        return alphabet.get(letter);
    }
    public static String getReverseLetter(String letter) {
        Map<String,String> alphabet = new HashMap<>();
        alphabet.put("a","z");
        alphabet.put("b","y");
        alphabet.put("c","x");
        alphabet.put("d","w");
        alphabet.put("e","v");
        alphabet.put("f","u");
        alphabet.put("g","t");
        alphabet.put("h","s");
        alphabet.put("i","r");
        alphabet.put("j","q");
        alphabet.put("k","p");
        alphabet.put("l","o");
        alphabet.put("m","n");
        alphabet.put("n","m");
        alphabet.put("o","l");
        alphabet.put("p","k");
        alphabet.put("q","j");
        alphabet.put("r","i");
        alphabet.put("s","h");
        alphabet.put("t","g");
        alphabet.put("u","f");
        alphabet.put("v","e");
        alphabet.put("w","d");
        alphabet.put("x","c");
        alphabet.put("y","b");
        alphabet.put("z","a");
        return alphabet.get(letter);
    }
}