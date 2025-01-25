import java.util.*;
public class _33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=-1;
        if(m==n){
            System.out.println(0);
            return;
        }
       else if(m%n==0){
            int Ratio=m/n;
            count=0;
            while(Ratio%2==0){
                Ratio/=2;
                count++;
            }
            while(Ratio%3==0){
                Ratio/=3;
                count++;
            }
            if(Ratio!=1) count=-1;
        }

       
         System.out.println(count);
    }
    
}
