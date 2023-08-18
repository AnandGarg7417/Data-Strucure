public class BinearySeach {
    public static void main(String[] args) {
        int num[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int key = 1;
        System.out.print("Key is found at index: " + binary(num, key));
    }

    public static int binary(int num[], int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
