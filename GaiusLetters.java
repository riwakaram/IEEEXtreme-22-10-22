
import java.util.*;
import java.lang.*;
import java.io.*;

class GaiusLetters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        StringBuilder decrypted = new StringBuilder();
        char c;
        for (int i = 0; i < sentence.length(); i++) {
            c = sentence.charAt(i);
            if ((sentence.charAt(i) >= 'm' && sentence.charAt(i) <= 'z')
                    || (sentence.charAt(i) >= 'M' && sentence.charAt(i) <= 'Z')) {
                c -= 12;
            }
            if ((sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'l')
                    || (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'L')) {
                c += 14;
            }
            decrypted.append(c);
        }
        System.out.println(decrypted);
    }

}
