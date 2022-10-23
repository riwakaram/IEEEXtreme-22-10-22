
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class MyTreat {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < t; i++) {
            int m = in.nextInt();
            String[][] inputArray = new String[m][];
            for (int j = 0; j < m; j++) {
                inputArray[j] = new String[12];
                inputArray[j][0] = in.next();
                set.add(inputArray[j][0]);
                inputArray[j][1] = in.next();
                int tempInt = Integer.parseInt(inputArray[j][1]);
                for (int k = 0; k < tempInt; k++) {
                    inputArray[j][k + 2] = in.next();
                    set.add(inputArray[j][k + 2]);
                }
            }
            String arr[] = new String[set.size()];
            set.toArray(arr);
            int numArr[] = new int[set.size()];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < set.size(); k++) {
                    if (inputArray[j][0].equals(arr[k])) {
                        numArr[k] += Integer.parseInt(inputArray[j][1]);
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < Integer.parseInt(inputArray[j][1]); k++) {
                    for (int o = 0; o < set.size(); o++) {
                        if (inputArray[j][k + 2].equals(arr[o])) {
                            numArr[o]--;
                        }
                    }
                }
            }

            int sum = 0;
            for (int j = 0; j < set.size(); j++) {
                if (numArr[j] < 0) {
                    sum += numArr[j];
                }
            }
            sum = -sum;

            int min = numArr[0];
            for (int j = 1; j < set.size(); j++) {
                if (numArr[j] < min) {
                    min = numArr[j];
                }
            }

            int counter = 0;
            do {
                for (int j = 1; j < set.size(); j++) {
                    if (numArr[j] > 0) {
                        min++;
                        
                    }
                }
                counter++;
            } while (min < 0);

            System.out.println(sum + " " + counter);

        }

    }
}
