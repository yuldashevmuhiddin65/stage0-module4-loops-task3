package school.mjc.stage0.loops.task3;

import java.util.Scanner;

public class AlphabetPrinter {
    public void printAlphabet() {
        char english = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println(english);
            english ++;
        }
    }
}
