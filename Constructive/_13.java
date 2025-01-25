import java.util.*;
public class _13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        int []b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int []ans=new int [n];
        ans[0]=b[0]+a[0];
        for(int i=1;i<n-1;i++){
           ans[i]= (ans[i-1]-a[i])+b[i];
        }
        int result=0;
        for(int i=0;i<n;i++){
            result=Math.max(result,ans[i]);
        }
        System.out.println(result);
    }
}
