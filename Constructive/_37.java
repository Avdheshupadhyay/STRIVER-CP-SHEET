import java.util.*;
public class _37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m>n){
            System.out.println(-1);
            return;
        }
        int rem=n%2;
        int multiple=rem+(n/2);
        while(multiple%m!=0){
            multiple++;
        }
        if(multiple%m==0){
            System.out.println(multiple);
        }
        else{
            System.out.println(-1);
        }
    }
    
}
