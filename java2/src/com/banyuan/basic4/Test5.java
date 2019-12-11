package basic4;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6, 7, 8, 9, 6, 8};
        int[] arr1 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }
        for(int i= 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
