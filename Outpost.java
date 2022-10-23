
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Outpost {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(); // rows
        int n = in.nextInt(); // cols
        int t = in.nextInt(); // threshold

        // case 1
        // ex: 1 7 2 9 2 5 4 3 2 1
        
        int startCol = 0;
        int endCol = 0;
//        if (m == 1) {
            int area = 1;
            // read array
            int inputArray[] = new int[n];
            for (int i = 0; i < n; i++) {
                inputArray[i] = in.nextInt();
            }
            // find area
            for (int k = 0; k < n; k++) {
                int tempArea = 0;
                int tempEnd = 0;
                int maxValue = inputArray[k];
                int minValue = inputArray[k];
                for (int j = k; j < n; j++) {
                    if (inputArray[j] > maxValue) {
                        maxValue = inputArray[j];
                    }
                    if (inputArray[j] < minValue) {
                        minValue = inputArray[j];
                    }
                    if (maxValue - minValue > t) {
                        // tempArea--;
                        break;
                    } else {
                        tempArea++;
                    }
                    tempEnd = j;
                }
                if (tempArea > area) {
                    area = tempArea;
                    endCol = tempEnd;
                    startCol = endCol - area + 1;
                }
                // System.out.println("start: " + startCol + " end: " + endCol);
            }
             System.out.println(area);
//        }
//        else {
//            int area = n - 1;
//            // read array
//            int inputArray[][] = new int[m][n];
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    inputArray[i][j] = in.nextInt();
//                }
//            }
//
//            // find area
//            int finalColEnd = n;
//            int finalRowEnd = 0;
//            for (int i = 0; i < m; i++) {
//                for (int k = 0; k < n; k++) {
//                    int tempArea = 0;
//                    int tempEnd = 0;
//                    int maxValue = inputArray[i][k];
//                    int minValue = inputArray[i][k];
//                    for (int j = k; j < n; j++) {
//                        if (inputArray[i][j] > maxValue) {
//                            maxValue = inputArray[i][j];
//                        }
//                        if (inputArray[i][j] < minValue) {
//                            minValue = inputArray[i][j];
//                        }
//                        if (maxValue - minValue > t) {
//                            // tempArea--;
//                            break;
//                        } else {
//                            tempArea++;
//                        }
//                        tempEnd = j;
//                    }
//                    if (tempArea < area) {
//                        area = tempArea;
//                        //endCol = tempEnd;
//                        //startCol = endCol - area + 1;
//                    }
//                    System.out.println("temp area: " + tempArea);
//                }
//                //System.out.println("area: " + area + " finalColEnd: " + finalColEnd);
//                if (area < finalColEnd) {
//                    finalColEnd = area;
//                    finalRowEnd = i;
//                    // startCol = endCol - area + 1;
//                }
//                // System.out.println("colEnd: " + finalColEnd + " rowEnd: " + finalRowEnd);
//            }
//            System.out.println(finalColEnd * finalRowEnd);
//        }
       

//        int lengthHorizontal = 0;
//        int lengthVertical = 0;
//        for (int i = 0; i < m; i++) {
//            int maxValue = inputArray[i][0];
//            int minValue = inputArray[i][0];
//            for (int j = 0; j < n; j++) {
//                if (inputArray[i][j] > maxValue) {
//                    maxValue = inputArray[i][j];
//                }
//                if (inputArray[i][j] < minValue) {
//                    minValue = inputArray[i][j];
//                }
//                if (maxValue - minValue > t) {
//                    lengthHorizontal = j;
//                    break;
//                }
//            }
//        }
//
//        int area = lengthHorizontal;
//        System.out.println(area);
        // initial values
//        int startRow = 0;
//        int endRow = 0;
//        int maxValue = inputArray[0][0];
//        int minValue = inputArray[0][0];
//        int area = 1; // initial area (number of columns)
//        for (int i = 1; i < n; i++) {
//            if (inputArray[0][i] > maxValue) {
//                maxValue = inputArray[0][i];
//            }
//            if (inputArray[0][i] < minValue) {
//                minValue = inputArray[0][i];
//            }
//            if (maxValue - minValue <= t){
//                area++;
//                endRow++;
//            } else {
//                if (endRow - startRow >= n/2){
//                    break;
//                } else {
//                    startRow = i;
//                    area = 1;
//                }
//            }
//        }
//        int startCol = 0;
//        int endCol = 0;
//        for (int i = 0; i < m; i++) {
//            int maxValue = inputArray[i][0];
//            int minValue = inputArray[i][0];
//            for (int j = 0; j < n; j++) {
//                if (inputArray[i][j] > maxValue) {
//                    maxValue = inputArray[i][j];
//                }
//                if (inputArray[i][j] < minValue) {
//                    minValue = inputArray[i][j];
//                }
//                if (maxValue - minValue <= t) {
//                    endRow = j;
//                } else {
//                }
//            }
//        }
    }

}
