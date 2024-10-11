import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        String shape = next();
        String[] shapes = shape.split("");
        
        boolean flag = false;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].equals("(")) {
                strings.push(shapes[i]);
            } else {
                if (!strings.empty()) {
                    strings.pop();
                }
            }
            
            if (i == shapes.length - 1 && strings.empty()) {
                flag = true;
            }
        }
        
        if (flag) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");
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