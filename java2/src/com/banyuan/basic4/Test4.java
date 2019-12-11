package basic4;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i =0;i<10;i++){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            arr[i]=a;
        }
        int max=arr[0];
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("max:"+max+" 下标:"+index);


    }
}