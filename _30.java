import java.util.*;
public class _30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer> ans=new ArrayList<>();
            ArrayList<Integer> choice=new ArrayList<>();
            for(int i=1;i<=n;i++){
                ans.add(i);
            } 
            while(ans.size()>1){
                int i=ans.size()-1;
                int a=ans.get(i);
                int b=ans.get(i-1);
                choice.add(a);
                choice.add(b);
                int c=(a+b+1)/2;
                ans.remove(i);
                ans.remove(i-1); 
                ans.add(c);
            }
            System.out.println(ans.get(0));
            for(int i=0;i<choice.size()-1;i+=2){
                System.out.println(choice.get(i)+" "+choice.get(i+1));
            }
        }
    }
}
