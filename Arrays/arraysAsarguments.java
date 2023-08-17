import java.util.Scanner;
public class arraysAsarguments {
    public static void main(String[] args) {
        int marks[] = {89,85,90};
        update(marks);
        for(int i=0;i<marks.length;i++){
          System.out.println("marks are " + marks[i]);
        }
    }
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 2;
        }
    }
}
