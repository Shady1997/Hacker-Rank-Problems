package problems;

import java.util.Scanner;

public class Problem004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {
        int small,large;
        for(int i=0;i<s.length();i++)
        {
            
        }
        int a1=s.charAt(0);
        int a2=s.charAt(s.length()-1-k);
        if(a1<=a2){
        String smallest = s.substring(0,0+k);
        String largest = s.substring(s.length()-k,s.length());

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
        }
        else {
            String largest = s.substring(0,0+k);
            String smallest = s.substring(s.length()-k,s.length());

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            return smallest + "\n" + largest;
        }

    }
}
