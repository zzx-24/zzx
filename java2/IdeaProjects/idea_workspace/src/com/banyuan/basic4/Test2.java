package basic4;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生的分数:");
            int a = sc.nextInt();
            sum+=a;
        }
        int averageGrade = sum/10;
        System.out.println("总分是："+sum+"平均分是："+averageGrade);
    }

}
