public class Kadanes {
    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 9, 10 };
        kadanesAlgo(num);
    }

    public static void kadanesAlgo(int num[]) {
        int currnum = 0;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currnum = currnum + num[i];
            if (currnum < 0) {
                currnum = 0;
            }
            maximum = Math.max(maximum, currnum);

        }
        System.out.println("Maximum sum is: " + maximum);
    }
}
