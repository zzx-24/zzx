import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min;
        System.out.println("请输入第一个整数：");
        min = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println("请输入第 " + (i + 1) + "个整数：");
            int a = sc.nextInt();
            if (min > a) {
                min = a;
            }
        }
        System.out.println("min=" + min);

    }
}