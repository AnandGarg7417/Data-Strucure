import java.util.*;

public class LargestArray {
    public static void main(String[] args) {
        int num[] = { 56, 78, 59, 89, 45, 99, 41, 23, 36, 63, 0, 999 };
        System.out.println("Largest number in array is: " + Larger(num));
    }

    public static int Larger(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest number in array is: " + smallest);
        return largest;

    }
}
