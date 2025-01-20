
import java.util.*;
public class _38 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char []c=s.toCharArray();
    int n=c.length;
    char first=c[0];
    char second=c[1];
    String ans="";
    if(n==1 && Character.isLowerCase(c[0])){
        System.out.println(c[0]+"".toUpperCase());
        return;
    }
    else if(n==1 && Character.isUpperCase(c[0])){
        System.out.println(c[0]+"".toLowerCase());
        return;
    }

    if(Character.isUpperCase(first) && Character.isUpperCase(second)){
        ans=new String(s.toLowerCase());
    }
    else if(Character.isUpperCase(first) && Character.isLowerCase(second)){
        ans=new String(s);
    }
    else if(Character.isLowerCase(first) && Character.isUpperCase(second)){
        ans+=(first+"").toUpperCase();
        for (int i = 1; i < c.length; i++) {
            ans+=(c[i]+"").toLowerCase();
            
        }
    }
    System.out.println(ans);

    


}    
}
