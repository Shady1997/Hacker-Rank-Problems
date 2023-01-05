package problems;

import java.util.Scanner;

public class Problem003 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(subString(S,start,end));
    }

    private static String subString(String s, int start, int end) {
        return s.substring(start,end);
    }
}
