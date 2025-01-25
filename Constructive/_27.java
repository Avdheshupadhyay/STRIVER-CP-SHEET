import java.util.*;
public class _27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            char [][]c=new char[n][m];
            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < m; j++) {
                    c[i][j] = line.charAt(j);
                }
            }
            int count=0;
            for(int i=0;i<m;i++){
                if(c[n-1][i]=='D') count++;
            }
            for(int i=0;i<n;i++){
                if(c[i][m-1]=='R') count++;
            }
           System.out.println(count);

        }

    }
    
}
