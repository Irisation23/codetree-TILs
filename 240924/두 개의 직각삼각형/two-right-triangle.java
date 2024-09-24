import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt();

        for (int i = 0; i < n; i++) {
            // 왼쪽 삼각형
            for (int left = n - i; left > 0; left--) {
                System.out.print("*");
            }
            
            // 공백
            for (int space = 0; space < i; space++) {
                System.out.print("  ");
            }

            // 오른쪽 삼각형
            for (int right = n - i; right > 0; right--) {
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