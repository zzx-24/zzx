package basic3;
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        /*if (a >= 10 && a < 100) {
            int b = a / 10;
            int c = a % 10;
            int temp = b;
            b = c;
            c = temp;
            System.out.println(b+""+c);
        }else if(a>=100&&a<1000){
            int b = a/100;
            int c = a%10;
            int d = a/10%10;
            int temp = b;
            b = c;
            c = temp;
            System.out.println(b+""+d+""+c);
        }else if(a>=1000&&a<10000){
            int b = a/1000;
            int c = a/100/10;
            int d = a/100%10;
            int e = a%10;
            System.out.println();*/
//        }
        int b=a;
        int count=0;
        do{
            b/=10;
            count++;
        }while (b!=0);
        int [] arr = new int[count];

        for(int i=0;i<arr.length;i++){
            int temp = a%10;
            a/=10;
            arr[i] = temp;
        }

        int result=0;

        for(int i=0;i<arr.length;i++){
            result+=arr[arr.length-1-i]*Math.pow(10,i);
        }
        System.out.println(result);
    }
}
