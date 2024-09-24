import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt();

        // n = 5 / 2 * n - 1 9 7 5 3 1 

        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print("  ");
            }

            for (int j = (2 * n) - (2 * i) - 1; j > 0; j--) { // (2*n) - (2*i) - 1 식 중요!
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