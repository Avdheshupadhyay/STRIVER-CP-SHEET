import java.util.*;

public class _09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int  x=sc.nextInt();
            int y=sc.nextInt();
            int n=sc.nextInt();
            for(int i=n;i>=0;i--){
                if(i%x==y){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}