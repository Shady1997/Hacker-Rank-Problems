package problems;

import java.util.Scanner;

public class Problem002 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        System.out.println(getLengthSummation(s1,s2));
        System.out.println(checlexicographically(s1,s2));
        System.out.println(getCapitalize(s1,s2));
    }

    private static String getCapitalize(String s1, String s2) {
        return s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " +s2.substring(0, 1).toUpperCase() + s2.substring(1);
    }

    private static String checlexicographically(String s1, String s2) {
        int a1=s1.charAt(0);
        int a2=s2.charAt(0);
        if(a1<=a2)return "No";
        else return "Yes";
    }

    private static int getLengthSummation(String s1, String s2) {
        return s1.length()+s2.length();
    }
}
