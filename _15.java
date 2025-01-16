import java.util.*;
public class _15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();   
        int total=0;
        for(int i=1;i<=w;i++){
            total+=(i*k);
        }
        int need=total-n;
        if(need<0) {
            System.out.println(0);
        }
        else{
            System.out.println(need);
        }
        
        sc.close();

    }
}
