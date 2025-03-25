import java.util.*;
public class _04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        sc.close();
        int totaldrink=k*l;
        int totallime=c*d;
        int totalsalt=p;
        int ans=Math.min(totalsalt/(n*np),Math.min(totaldrink/(n*nl),totallime/n));
        System.out.println(ans);
        
    }
    
}
