import java.util.*;
import java.lang.*;
import java.io.*;

class Dancer {

    public class Globals {

        // initial
        public static final char body = '|';
        public static final char head = 'o';
        public static final char leftHandToStart = '\\';
        public static final char rightHandToStart = '/';
        public static final char leftLegOut = '\\';
        public static final char rightLegOut = '/';

        // changes
        public static final char leftHandToHead = ')';
        public static final char leftHandToHip = '>';
        public static final char rightHandToHead = '(';
        public static final char rightHandToHip = '<';
        public static final char leftLegIn = '>';
        public static final char rightLegIn = '<';
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        if (T >= 1 && T <= 10) {
            for (int i = 0; i < T; i++) {
                char[] wholeBody = {' ', Globals.head, ' ', Globals.rightHandToStart, Globals.body, Globals.leftHandToStart, Globals.rightLegOut, ' ', Globals.leftLegOut};
                int d = in.nextInt();
                if (d >= 3 && d <= 400) {
                    for (int j = 0; j < d; j++) {
                        if (j == 0) {
                            String linebreak = in.nextLine();
                        }
                        String command = in.nextLine();
                        if (command.substring(0, 3).toLowerCase().equals("say")) {
                            System.out.print((j == 0 ? "" : "\n") + command.substring(4));
                        } else if (command.toLowerCase().equals("turn")) {
                            wholeBody = toggleBody(wholeBody);
                            printBody(wholeBody);
                        } else {
                            if (command.toLowerCase().equals("left hand to head")) {
                                wholeBody[2] = Globals.leftHandToHead;
                                wholeBody[5] = ' ';
                            } else if (command.toLowerCase().equals("left hand to hip")) {
                                wholeBody[5] = Globals.leftHandToHip;
                                wholeBody[2] = ' ';
                            } else if (command.toLowerCase().equals("left hand to start")) {
                                wholeBody[5] = Globals.leftHandToStart;
                                wholeBody[2] = ' ';
                            } else if (command.toLowerCase().equals("right hand to head")) {
                                wholeBody[0] = Globals.rightHandToHead;
                                wholeBody[3] = ' ';
                            } else if (command.toLowerCase().equals("right hand to hip")) {
                                wholeBody[3] = Globals.rightHandToHip;
                                wholeBody[0] = ' ';
                            } else if (command.toLowerCase().equals("right hand to start")) {
                                wholeBody[3] = Globals.rightHandToStart;
                                wholeBody[0] = ' ';
                            } else if (command.toLowerCase().equals("left leg in")) {
                                wholeBody[8] = Globals.leftLegIn;
                            } else if (command.toLowerCase().equals("left leg out")) {
                                wholeBody[8] = Globals.leftLegOut;
                            } else if (command.toLowerCase().equals("right leg in")) {
                                wholeBody[6] = Globals.rightLegIn;
                            } else if (command.toLowerCase().equals("right leg out")) {
                                wholeBody[6] = Globals.rightLegOut;
                            }
                            printBody(wholeBody);
                        }
                    }
                }
            }
        }
    }

    public static void printBody(char[] wholeBody) {
        for (int i = 0; i < wholeBody.length; i++) {
            if (i % 3 != 0) {
                System.out.print(wholeBody[i]);
            } else {
                System.out.print("\n" + wholeBody[i]);
            }
        }
    }

    public static char[] toggleBody(char[] wholeBody) {
        char[] temp = {' ', Globals.head, ' ', Globals.rightHandToStart, Globals.body, Globals.leftHandToStart, Globals.rightLegOut, ' ', Globals.leftLegOut};
        if (wholeBody[5] == Globals.leftHandToStart) {
            temp[3] = Globals.rightHandToStart;
        } else if (wholeBody[5] == Globals.leftHandToHip) {
            temp[3] = Globals.rightHandToHip;
        } else if (wholeBody[2] == Globals.leftHandToHead) {
            temp[0] = Globals.rightHandToHead;
            temp[3] = ' ';
        }

        if (wholeBody[3] == Globals.rightHandToStart) {
            temp[5] = Globals.leftHandToStart;
        } else if (wholeBody[3] == Globals.rightHandToHip) {
            temp[5] = Globals.leftHandToHip;
        } else if (wholeBody[0] == Globals.rightHandToHead) {
            temp[2] = Globals.leftHandToHead;
            temp[5] = ' ';
        }

        if (wholeBody[8] == Globals.leftLegIn) {
            temp[6] = Globals.rightLegIn;
        } else if (wholeBody[8] == Globals.leftLegOut) {
            temp[6] = Globals.rightLegOut;
        }

        if (wholeBody[6] == Globals.rightLegIn) {
            temp[8] = Globals.leftLegIn;
        } else if (wholeBody[6] == Globals.rightLegOut) {
            temp[8] = Globals.leftLegOut;
        }

        return temp;
    }
}
