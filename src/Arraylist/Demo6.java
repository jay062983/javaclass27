package Arraylist;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans.get(3));
        System.out.println(booleans.get(2));
        System.out.println(booleans.get(4));
        //create a normal for loop to print all the elements from arraylist

        for (int i = 0; i <booleans.size() ; i++) {
            System.out.println(booleans.get(i));

        }
    }
}
