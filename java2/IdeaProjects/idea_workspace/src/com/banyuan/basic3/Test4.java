package basic3;

public class Test4 {
    public static void main(String[] args){
        for(int i =0;i<100;i++){
            if(i%5==0 || i%6==0 && i%30!=0){
                System.out.print(" "+i);
            }
        }
    }
}
