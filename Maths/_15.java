import java.util.*;
public class _15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;i<=1000;i++){
            int total=k*i;
            int rem=total%10;
            if(rem==0|| rem==r){
                System.out.println(i);
                return;
            }
        }
       
    }
}