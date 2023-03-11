package Arraylist;

public class demo2 {
    public static void main(String[] args) {
        String name="Sam";
        String []names={"kavin","noah","Dan","tom"};
        System.out.println(contains(name,names));
    }
    public static boolean contains(String nameTobeSearched, String[]names) {
        for (String name : names) {
            if (nameTobeSearched.equals(name)) {
                return true;

            }

        }
        return false;

    }}

