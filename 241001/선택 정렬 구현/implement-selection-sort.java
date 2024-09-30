import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = nextInt();

        int[] selectArray = new int[n];
        for (int i = 0; i < n; i++) {
            selectArray[i] = nextInt();
        }

        int tmp = 0;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (selectArray[j] < selectArray[min]) {
                    min = j;
                }
                
                tmp = selectArray[i];
                selectArray[i] = selectArray[min];
                selectArray[min] = tmp;
            }
        }

        for (int i : selectArray) {
            System.out.print(i + " ");
        }
        
    }

    static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
            }
        }

        return st.nextToken();
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }
}