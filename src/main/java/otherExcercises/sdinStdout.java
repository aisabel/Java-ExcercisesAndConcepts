package otherExcercises;

import java.util.Scanner;

public class sdinStdout {
    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT.*/
    Scanner in = new Scanner(System.in);
    int a;
    a = in.nextInt();
    int b;
    b = in.nextInt();
    System.out.println(solveMeFirst(a, b));
}

    static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
