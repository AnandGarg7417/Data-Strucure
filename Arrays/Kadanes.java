import java.util.*;

class Kadanes {
    public static void main(String[] args) {
        int arr[] = { -3, -4, -6, -8, -10, -11, -1 };
        kadanes(arr);

        int Min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (Min < arr[i]) {
                Min = arr[i];
            }
        }
        System.out.println("Minimum sum is: " + Min);

    }

    public static void kadanes(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println("Maximum sum is: " + maxsum);
    }
}