package Arraylist;

import java.util.ArrayList;

public class demo5 {
    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        for(Character c:characters){
            System.out.print(c+" =");
        }
    }
}
