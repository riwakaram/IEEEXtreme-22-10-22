
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class TouristTaxiService {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[][] costs = new int[M][3];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < 3; j++) {
                costs[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            int[] bestCosts = new int[N];
            int min;
            int nextIntersection = 1;
            for (int j = 0; j < M; j++) {
                // algorithm
                min = 0;
                int wantedIndex = 0;
                for (int k = 0; k < M; k++) {
                    if (costs[k][0] == nextIntersection) {
                        int tempCost = costs[k][2];
                        if (min == 0){
                            min = tempCost;
                        } else {
                            if(tempCost < min){
                                min = tempCost;
                                wantedIndex = k;
                            }
                        }
                    }
                }
                bestCosts[i] += min;
                nextIntersection = costs[wantedIndex][1];
            }
            System.out.println(bestCosts[i]);
        }

    }
}
