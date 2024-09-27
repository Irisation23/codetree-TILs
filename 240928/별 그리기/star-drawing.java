import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    // 1 ,3, 1 || 1, 3, 5, 3, 1
    public static void main(String[] args) {
        int n = nextInt();

        for (int i = 0; i < n; i++) {
            for (int space = n - i - 1; space > 0; space--) {
                System.out.print(" ");
            }

            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");            
            } 
            System.out.println();
        }

        for (int i = 0; i < n ; i++) {
            for (int space = 0; space <= i; space++) {
                System.out.print(" ");
            }

            for (int j = (2 * n) - (2 * i) - 3; j > 0; j--) {
                System.out.print("*");
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