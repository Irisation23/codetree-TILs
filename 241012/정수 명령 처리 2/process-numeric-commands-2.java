import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        int N = nextInt();
        
        Queue<Integer> q = new LinkedList();
        String command = null;
        for (int i = 0; i < N; i++) {
            command = next();
            switch (command) {
                case "push": {
                    q.add(nextInt());
                    break;
                }

                case "pop": {
                    System.out.println(q.poll());
                    break;
                }

                case "size": {
                    System.out.println(q.size());
                    break;
                }

                case "empty": {
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;
                }
                
                case "front": {
                    System.out.println(q.peek());
                    break;
                }
            }
        }
        

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