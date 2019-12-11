package basic3;

import java.util.Scanner;
public class MaxInt {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[20];
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if(arr[i]==0){
                    break;
                }
                count++;
            }
            for (int i = 0; i < count; i++) {
                for (int j = i; j < count - i - 1; j++) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        System.out.println("最小值："+arr[0]+"最大值："+arr[arr.length-1]);
    }
}
