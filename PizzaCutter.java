import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Pizza {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            int temp = 0;
            Set answer = new HashSet();
            for (int j = 0; j < N; j++) {
                temp = in.nextInt() % 360;
                if (temp > 180) {
                    temp -= 180;
                }
                if (temp < 0) {
                    temp += 180;
                }
                answer.add(temp);
            }
            if (N == 0) {
                System.out.println(1);
            } else {
                System.out.println(answer.size() * 2);
            }
        }
    }
}
