import java.util.*;
public class _11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []friend=new int[n+1];
        for(int i=1;i<=n;i++){
            friend[i]=sc.nextInt();
        }
        int []ans=new int[n+1];
       for (int i = 1; i <=n; i++) {
           int index=friend[i];
           int value=i;
           ans[index]=value;
       }
        for(int i=1;i<=n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}