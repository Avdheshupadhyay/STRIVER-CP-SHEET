import java.util.*;
public class _23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=-1;
        for(int i=1;i<500;i++){
             sum+=(i*(i+1))/2;
             count++;
             if(sum>n){
                break;
             }
        }
        System.out.println(count);
    }
    
}
