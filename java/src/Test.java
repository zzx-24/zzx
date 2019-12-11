import java.util.Scanner;

public class Test {
    public  static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a的数值：");
        int a = sc.nextInt();
        System.out.println("请输入b的数值：");
        int b = sc.nextInt();
        System.out.println("请输入c的数值：");
        int c = sc.nextInt();
        Test_Add ta = new Test_Add();
        System.out.println(ta.add(a,b,c));
    }
}
