import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int N = nextInt();
        int[] quickArray = new int[N];

        for (int i = 0; i < quickArray.length; i++) {
            quickArray[i] = nextInt();
        }

        quickSort(quickArray, 0, quickArray.length - 1);
    }

    private static void quickSort(int[] quickArray, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIndex = low + (high - low) / 2;
        int pivot = quickArray[pivotIndex];

        int left = low;
        int right = high;

        while (left <= right) {
            while (quickArray[left] < pivot) {
                left++;
            }

            while (quickArray[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(quickArray, left, right);
                left++;
                right--;
            }
        }

        quickSort(quickArray, low, right);
        quickSort(quickArray, left, high);
    }

    public static void swap(int[] quickArray, int i, int j) {
        int tmp = quickArray[i];
        quickArray[i] = quickArray[j];
        quickArray[j] = tmp;
    }

    public String next() {
        while(st == null || !st.hasMoreElemnts()) {
            try {
                st = new StringTokenizer(reader.readLine());
            } catch (IOExcetpion e) {
                e.printStackTrace();
            }
        }

        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}