package GenericArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class genericArrayList {
    public static void main(String[] args) {
        Object a = new String("grate");
        Object b= new Integer(10);
        Object c=new Scanner(System.in);
        ArrayList name=new ArrayList();
        name.add("lol");
        name.add(11);
        name.add('m');

        for(Object j:name){
            System.out.println(j);
        }
    }
}
