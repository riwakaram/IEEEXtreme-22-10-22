// Don't place your source in a package

import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        // is power of 2
        boolean a = (int) (Math.ceil((Math.log(N) / Math.log(2))))
                == (int) (Math.floor(((Math.log(N) / Math.log(2)))));
        
        int palindrome = 0;

        int i = 1;
        if (a) {
            palindrome += Math.pow(M, i) * (N / (2 * i));
        } else {
            palindrome += Math.pow(M, M - 1);
        }
        for (i = 2; i <= N / 2; i += 2) {
            if (N % i == 0) {
                if (a) {
                    palindrome += Math.pow(M, i) * (N / (2 * i));
                } else {
                    palindrome += Math.pow(M, M - 1);
                }
            }
        }
        
        if (a) {
            palindrome -= N/2;
        } else {
            palindrome -= (i - 3) * M * M;
        }
        System.out.println(palindrome);
    }
}
