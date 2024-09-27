import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) {
        int n = nextInt();
        MyList myList = new MyList(new ArrayList<Integer>());

        for (int i = 0; i < n; i++) {
            String st1 = next();

            if (st1.equals("push_back")) {
                myList.push_backA(nextInt());
            } else if (st1.equals("get")) {
                myList.getK(nextInt());
            } else if (st1.equals("size")) {
                System.out.println(myList.getList().size());
            } else if (st1.equals("pop_back")) {
                myList.pop_back();
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

class MyList {
    private final List<Integer> list;

    public MyList(List<Integer> list) {
        this.list = list;
    }

    public void push_backA(int value) {
        list.add(list.size(), value);
    }

    public void pop_back() {
        list.remove(list.size() - 1);
    }

    public void getK(int k) {
        System.out.println(list.get(k - 1));
    }

    public List<Integer> getList() {
        return this.list;
    }
}