package DS;

import javax.swing.text.html.StyleSheet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InterviewTest {
    public static void main(String[] args) {

        int n = 6;

        int space = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // Print i+1 stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space--;
        }
        space = 0;
        for (int i = n; i > 0; i--) {
           for (int j = 0; j < space; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.println();
            space++;
        }

    }

}
