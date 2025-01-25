import java.util.*;
public class _01 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int ans=0;
        for(int i=0;i<n;i++){
            String operation=sc.nextLine();
            switch (operation) {
                case "++X":
                    ++ans;
                    break;
                case "--X":
                    --ans;
                    break;
                case "X++":
                    ans++;
                    break;
                case "X--":
                    ans--;
                    break;
               
            }
            
        }
        System.out.println(ans);
    }

}