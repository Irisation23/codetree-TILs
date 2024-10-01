import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt();

        int[] insertionArrays = new int[n];
        for (int i = 0; i < n; i++) {
            insertionArrays[i] = nextInt();
        }

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = insertionArrays[i];

            while (j >= 0 && insertionArrays[j] > key) {
                insertionArrays[j + 1] = insertionArrays[j];
                j--;
            }

            insertionArrays[j + 1] = key;
        }

        for (int i : insertionArrays) {
            System.out.print(i + " ");
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