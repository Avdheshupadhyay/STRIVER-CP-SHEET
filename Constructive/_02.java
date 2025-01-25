import java.util.*;
public class _02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        char []c=n.toCharArray();
        for(int i=0;i<n.length();i++){
            char t=c[i];
             if(i==0 && t>='5' && t<'9') c[i]=(char)('9'-t+'0');
             else if(i>0 && t>='5' ) c[i]=(char)('9'-t+'0');
        }
        String ans=new String(c);
        System.out.println(ans);
    }
    
}
