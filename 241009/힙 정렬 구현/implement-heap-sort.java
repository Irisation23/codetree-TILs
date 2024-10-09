import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        int N = nextInt();
        
        int[] heapArray = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            heapArray[i] = nextInt();
        }

        heapSort(heapArray, N);

        for(int i = 1; i <= N; i++) {
            System.out.print(heapArray[i] + " ");
        }
    }

    static void heapSort(int[] heapArray, int N) {
        for (int i = N / 2; i >= 1; i--) {
            heapify(heapArray, N, i);
        }

        for (int i = N; i > 1; i--) {
            swap(heapArray, 1, i);
            heapify(heapArray, i - 1, 1);
        }
    }

    static void heapify(int[] heapArray, int N, int i) {
        int largest = i;
        int left = i * 2;
        int right = i * 2 + 1;

        if (left <= N && heapArray[left] > heapArray[largest]) {
            largest = left;
        }

        if (right <= N && heapArray[right] > heapArray[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(heapArray, i, largest);
            heapify(heapArray, N, largest);
        }
    }

    static void swap(int[] heapArray, int i, int j) {
        int tmp = heapArray[i];
        heapArray[i] = heapArray[j];
        heapArray[j] = tmp;
    }

    public static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public static int nextInt() {
        return Integer.parseInt(next());
    }
}