package basic3;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {
                arr[i] = (int) (Math.random() * 30 + 1);
                System.out.println(arr[i]);
            }
            int a = sc.nextInt();
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (a == arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }

}
