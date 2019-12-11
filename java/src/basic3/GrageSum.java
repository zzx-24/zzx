package basic3;

import java.util.Scanner;
public class GrageSum {
    public static void main(String[] args) {
        int sum = 0;
        try {
            for (int i = 0; i < 5; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入班级同学的分数：");
                double a = sc.nextDouble();
                sum += a;
            }
            System.out.println(sum);
        }catch(Exception e){
            System.out.println("请输入正确的分数：");
        }
    }
}
