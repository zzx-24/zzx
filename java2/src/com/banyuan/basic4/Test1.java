package basic4;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    for(int i =0;i<m;i++) {
        for(int j=0;j<i+1;j++){
            System.out.print((j+1)+"*"+(i+1)+" ");
        }
        System.out.println();
    }
    }
}
