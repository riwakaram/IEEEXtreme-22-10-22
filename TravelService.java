
import java.util.*;
import java.lang.*;
import java.io.*;

// 1 3 35 230 15 240 18 225 24 240
// Please name your class Main
class TravelService {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); //testcases
        for (int i = 0; i < t; i++) {
            int finalCost = 0;
            int s = in.nextInt(); // number of stations
            int c = in.nextInt(); // fuel capacity in car
            int fuelLeftLive = c;
            int r0 = in.nextInt(); // initial cost
            finalCost += r0 * c;
            int arrFuelNeeded[] = new int[s];
            int arrCostStation[] = new int[s];
            for (int j = 0; j < s; j++) {
                arrFuelNeeded[j] = in.nextInt();
                arrCostStation[j] = in.nextInt();
            }
            for (int j = 0; j < s - 1; j++) {
                fuelLeftLive -= arrFuelNeeded[j];
                if (fuelLeftLive <= arrFuelNeeded[j + 1]
                        || (((c - fuelLeftLive) * arrCostStation[j] + 500)
                        < ((c - fuelLeftLive - arrFuelNeeded[j + 1])
                        * arrCostStation[j + 1] + 500))) {
                    finalCost += (c - fuelLeftLive) * arrCostStation[j] + 500;
                    fuelLeftLive = c;
                }
            }
            System.out.println(finalCost);
        }
    }
}
