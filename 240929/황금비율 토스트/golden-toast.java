import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt(); // 5
        int m = nextInt(); // 5

        String codes = next(); // codet
        String[] splitedCodes =  codes.split("");
        LinkedList<String> listCodes = new LinkedList<>();

        for (String splitedCode : splitedCodes) {
            listCodes.add(splitedCode);
        }

        ListIterator<String> it = listCodes.listIterator(listCodes.size());

        for (int i = 0; i < m; i++) {
            String command = next();
            switch (command) {
                case "L":
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                break;

                case "R":
                    if (it.hasNext()) {
                        it.next();
                    }
                break;

                case "D":
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                break;


                case "P":
                it.add(next());
                break;



            }
        }

        while (it.hasPrevious()) {
            it.previous();
        }

        while (it.hasNext()) {
            System.out.print(it.next());
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