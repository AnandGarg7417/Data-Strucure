import java.util.Scanner;
public class Creation {
    public static void main(String[] args) {
        System.out.println("Enter: ");
        Scanner sc = new Scanner(System.in);
        String friends[] = new String[5];
        for(int i=0;i<=friends.length-1;i++)
        {
            friends[i] = sc.nextLine();
        }
        // friends[1]=sc.nextLine();
        // friends[0]=sc.nextLine();
                // System.out.println(friends[3]);
        // System.out.println(friends[4]);

        for(int i=0;i<=friends.length-1;i++){
        System.out.println(friends[i]);

        }
    }
}
