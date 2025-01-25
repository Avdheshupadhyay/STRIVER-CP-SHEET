import java.util.*;
public class _14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
       for(int i=0;i<k;i++){
        int r=n%10;
        if(r!=0){
            n--;
        }
        else{
             n=n/10;
        }
       }
       System.out.println(n);
    }
}
