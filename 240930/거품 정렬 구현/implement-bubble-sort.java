import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt();

        int[] arrays = new int[n];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = nextInt();
        }

        boolean sorted = true;
        do {
            sorted = true;
            for (int i = 0; i < arrays.length - 1; i++) {
                int tmp = 0;
                if (arrays[i] > arrays[i + 1]) { // 2 1
                    tmp = arrays[i];
                    arrays[i] = arrays[i + 1];
                    arrays[i + 1] = tmp;
                    sorted = false;
                }
            }

        } while(!sorted);

        for (int element : arrays) {
            System.out.print(element + " ");
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