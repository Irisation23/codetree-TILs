import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int n = nextInt();

        for (int i = 0; i < n; i++) {
            String command = next();
            int value = 0;
            switch (command) {
                case "push_front": 
                value = nextInt();
                list.addFirst(value); // 맨 앞에 데이터 추가
                break;

                case "push_back":
                value = nextInt();
                list.addLast(value); // 맨 뒤에 데이터 추가
                break;

                case "pop_front":
                System.out.println(list.pollFirst());
                break;

                case "pop_back":
                System.out.println(list.pollLast());
                break;

                case "size":
                System.out.println(list.size());
                break;

                case "empty":
                System.out.println(list.isEmpty() ? 1 : 0);
                break;

                case "front":
                System.out.println(list.peekFirst());
                break;

                case "back":
                System.out.println(list.peekLast());
                break;
            }
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