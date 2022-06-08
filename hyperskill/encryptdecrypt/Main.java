package encryptdecrypt;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String m = "we found a treasure!";
        System.out.println(reverse(m));
    }
    public static String reverse(String message){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++){
            char ch = message.charAt(i);
            if(Character.isLetter(ch)) {
                sb.append(getCha("" + ch));
            }else {
                sb.append(""+ch);
            }
        }
        return sb.toString();
    }
    public static String getCha(String letter) {
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