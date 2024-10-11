import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) {
        int N = nextInt();

        Stack<Integer> stack = new Stack<>();
        String command = null;
        for (int i = 0; i < N; i++) {
            command = next();

            switch (command) {
                case "push": {
                    stack.push(nextInt());
                    break;
                }

                case "pop": {
                    System.out.println(stack.pop());
                    break;
                }

                case "size": {
                    System.out.println(stack.size());
                    break;
                }

                case "empty": {
                    System.out.println(stack.empty() ? 1 : 0);
                    break;
                }

                case "top": {
                    System.out.println(stack.peek());
                    break;
                }
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