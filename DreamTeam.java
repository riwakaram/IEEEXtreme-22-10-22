// Don't place your source in a package

import java.util.*;
import java.lang.*;
import java.io.*;

// 235000 3 curry 40000 nash 20000 johnson 10000 3 jordan 50000 wade 20000 bryant 80000 1 james 30000 1 duncan 60000 1 oneal 100000
// Please name your class Main
class DreamTeam {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int budget = in.nextInt();

        // pointGuards
        int numPointGuards = in.nextInt();
        String pointGuards[] = new String[numPointGuards];
        Integer pointGuardsBudget[] = new Integer[numPointGuards];
        for (int i = 0; i < numPointGuards; i++) {
            pointGuards[i] = in.next();
            pointGuardsBudget[i] = in.nextInt();
        }

        // shootingGuards
        int numShootingGuards = in.nextInt();
        String shootingGuards[] = new String[numShootingGuards];
        Integer shootingGuardsBudget[] = new Integer[numShootingGuards];
        for (int i = 0; i < numShootingGuards; i++) {
            shootingGuards[i] = in.next();
            shootingGuardsBudget[i] = in.nextInt();
        }

        // smallForward
        int numSmallForwardsGuards = in.nextInt();
        String smallForwards[] = new String[numSmallForwardsGuards];
        Integer smallForwardsBudget[] = new Integer[numSmallForwardsGuards];
        for (int i = 0; i < numSmallForwardsGuards; i++) {
            smallForwards[i] = in.next();
            smallForwardsBudget[i] = in.nextInt();
        }

        // powerGuards
        int numPowerForwardsGuards = in.nextInt();
        String powerForwards[] = new String[numPowerForwardsGuards];
        Integer powerForwardsBudget[] = new Integer[numPowerForwardsGuards];
        for (int i = 0; i < numPowerForwardsGuards; i++) {
            powerForwards[i] = in.next();
            powerForwardsBudget[i] = in.nextInt();
        }

        // centers
        int numCenters = in.nextInt();
        String centers[] = new String[numCenters];
        Integer centersBudget[] = new Integer[numCenters];
        for (int i = 0; i < numCenters; i++) {
            centers[i] = in.next();
            centersBudget[i] = in.nextInt();
        }

        // comparing
        int goodBudget = 0;
        int arrayIndexes[] = new int[5];
        int temp[] = new int[5];
        for (int i = 0; i < numPointGuards; i++) {
            int temp01 = pointGuardsBudget[i];
            for (int j = 0; j < numShootingGuards; j++) {
                int temp02 = shootingGuardsBudget[j];
                for (int k = 0; k < numSmallForwardsGuards; k++) {
                    int temp03 = smallForwardsBudget[k];
                    for (int l = 0; l < numPowerForwardsGuards; l++) {
                        int temp04 = powerForwardsBudget[l];
                        for (int m = 0; m < numCenters; m++) {
                            int temp05 = centersBudget[m];
                            // checking
                            int tempBudget = temp01 + temp02 + temp03 + temp04 + temp05;
                            if (tempBudget <= budget && tempBudget >= goodBudget) {
                                if (tempBudget == goodBudget) {
                                    String goodBudgetNames = pointGuards[temp[0]] + shootingGuards[temp[1]] + smallForwards[temp[2]] + powerForwards[temp[3]] + centers[temp[4]];
                                    String tempBudgetNames = pointGuards[i] + shootingGuards[j] + smallForwards[k] + powerForwards[l] + centers[m];
                                    if (goodBudgetNames.compareTo(tempBudgetNames) > 0) {
                                        temp[0] = i;
                                        temp[1] = j;
                                        temp[2] = k;
                                        temp[3] = l;
                                        temp[4] = m;
                                        goodBudget = tempBudget;
                                    }
                                } else {
                                    temp[0] = i;
                                    temp[1] = j;
                                    temp[2] = k;
                                    temp[3] = l;
                                    temp[4] = m;
                                    goodBudget = tempBudget;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(pointGuards[temp[0]] + "\n" + shootingGuards[temp[1]]
                + "\n" + smallForwards[temp[2]] + "\n" + powerForwards[temp[3]] 
                + "\n" + centers[temp[4]]);
    }
}
