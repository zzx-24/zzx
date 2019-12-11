package basic3;

import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[32];
        int count = 0;
        int b = a;
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-1-i] = b%2;
            b = b/2;
            count++;
            if(b ==0){
                break;
            }
        }
        for (int i =32-count;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
    }
}
