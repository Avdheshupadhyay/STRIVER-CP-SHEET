import java.util.*;
public class _18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=new String();
        char []t=s.toCharArray();
        char c=t[0];
        if(c>96){
            c=(char)(c-32);
            ans+=c;
        }
        else{
            ans+=c;
           
        }
        for(int i=1;i<t.length;i++){
            ans+=t[i];
        }
        System.out.println(ans);

    }
}
