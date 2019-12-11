package basic4;
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i =0;i<arr.length;i++){
            Scanner sc =new Scanner(System.in);
            System.out.println("请输入一个整数：");
            int a = sc.nextInt();
            arr[i]=a;
        }
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        int index =-1;
        for(int i=0;i<arr.length;i++){
            if(b == arr[i]){
                index = i;
                System.out.println(index);
                break;
            }

        }
        if(index ==-1){
            System.out.println("数组里没有你要找的数字");
        }
        System.out.println(0.01+0.09);

    }

}
