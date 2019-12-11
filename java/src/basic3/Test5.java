package basic3;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入年份：");
            int a = sc.nextInt();
            if (a % 4 == 0 || a % 100 == 0 && a % 400 != 0) {
                System.out.println(a + "是闰年");
            } else {
                System.out.println(a + "不是闰年");
            }
        }
    }
}
