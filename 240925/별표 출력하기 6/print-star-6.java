import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = i; space > 0; space--) {
                System.out.print("  ");
            }

            for (int j = (2 * n) - (2 * i) - 1; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int space = n - i - 2; space > 0; space--) {
                System.out.print("  ");
            }

            for (int j = 3 + (2 * i); j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }
}