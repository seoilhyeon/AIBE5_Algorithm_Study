package week03.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_BOJ_11004_quicksort {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int n = nextInt(), k = nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }

        quickSelect(a, 0, n - 1, k);
        System.out.println(a[k - 1]);
    }

    private static void quickSelect(int[] arr, int s, int e, int k) {
        if (s > e)
            return;

        int pivot = partition(arr, s, e);

        if (pivot == k - 1)
            return;

        if (pivot > k - 1)
            quickSelect(arr, s, pivot - 1, k);
        else
            quickSelect(arr, pivot + 1, e, k);
    }

    private static int partition(int[] arr, int s, int e) {
        int m = (s + e) >>> 1;
        swap(arr, s, m);

        int pivot = arr[s], i = s + 1, j = e;
        while (i <= j) {
            while (i <= j && arr[j] > pivot)
                j--;
            while (i <= j && arr[i] < pivot)
                i++;
            if (i <= j)
                swap(arr, i++, j--);
        }

        swap(arr, s, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
