class LinearSearch {
    public static void main(String[] args) {
        String num[] = { "DOsa", "Samosa", "Jalebi" };
        String key = "Samosa";

        int index = linear(num, key);
        if (index == -1) {
            System.out.print("Key not found");
        } else {
            System.out.print("Key  found at index ");
            System.out.print(index);

        }

    }

    public static int linear(String num[], String key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }
}