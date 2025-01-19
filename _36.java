import java.util.*;
public class _36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=n;
        for(int i=1;i<n;i++) sum+=(n-i)*i;
        System.out.println(sum);
    }
    
}
