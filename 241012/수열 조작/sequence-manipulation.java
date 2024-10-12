import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            dq.addFirst(i); //  7 6 5 4 3 2 1
        }

        while (dq.size() != 1) {
            dq.pollLast();
            dq.offerFirst(dq.pollLast());
        }

        System.out.println(dq.poll());
    }

    public static String next() {
        while(st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch(IOException e) {
            }
        }

        return st.nextToken();
    }

    public static int nextInt() {
        return Integer.parseInt(next());
    }
}