package basic4;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args){
        int[] arr = new int[8];
        for(int i =0;i<8;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生的成绩：");
            int a = sc.nextInt();
            arr[i] = a;
        }
        int sum =0;
        for(int i = 0;i<8;i++){
            sum+=arr[i];
        }
        int max =arr[0];
        int min = arr[0];
        for(int i =0;i<8;i++){
            if(max<arr[i]){
                max = arr[i];
            }else{
                min = arr[i];
            }
        }
        int averageGrade = sum/8;
        System.out.println(sum+" "+max+" "+min+" "+averageGrade);
    }
}
