import java.util.*;
public class _25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            char []c=s.toCharArray();
            int count=0;
            int left=s.indexOf('1');
            int right=s.lastIndexOf('1');
            if (left == -1 || right == -1) {
                System.out.println(0);
                continue;
             }
            for(int i=left;i<=right;i++){
                
                if(c[i]=='0') count++;
            } 
            System.out.println(count);
        }
    }
    
}
