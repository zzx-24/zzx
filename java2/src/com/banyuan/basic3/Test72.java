package basic3;
import java.util.Scanner;
public class Test72 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int count = 0;
        int b = a;
        do{
            b/=10;
            count++;
        }while(b!=0);
        int[] arr = new int[count];
        for(int i =0; i<count;i++){
            int temp =a%10;
            a/=10;
            arr[i] = temp;
        }
        int result =0;
        for(int i =0;i<arr.length;i++){
            result+=arr[arr.length-i]*Math.pow(10,i);
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(result);
        }
    }
}
