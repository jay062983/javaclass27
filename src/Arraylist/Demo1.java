package Arraylist;

public class Demo1 {
    public static void main(String[] args) {


     String name="gavin";
     String name1="larry";
    String name2="dave";

        String []names={"Dave","kavin","chad"};
printnames(name,name1,name2);


    }
    public static void displayNames(String[]names){
        for (String name : names) {
            System.out.println(name);

        }

    }
    public static void printnames(String name,String name1,String name2){
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }

}
