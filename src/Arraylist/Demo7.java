package Arraylist;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("kola");
        names.add("vola");
        names.add("tola");
        names.add("mola");
        names.add("eola");

        System.out.println(names.contains("vola"));
        System.out.println(names);
        names.remove("tola");
        System.out.println(names);
        names.set(2,"james");
        System.out.println(names);
        System.out.println(names.indexOf("vola"));
    }
}
