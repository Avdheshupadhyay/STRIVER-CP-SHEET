import java.util.*;
public class _19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []c=s.toCharArray();
       
        String ans="";
        String first="",second="",third="";
        for (char d : c) {
           if(d=='1'){
            first+=d;
            first+='+';
           }
           else if(d=='2'){
            second+=d;
            second+='+';
           }
           else if(d=='3'){
            third+=d;
            third+='+';
           }
            
        }
        ans=first+second+third;
        if(s.length()==1 || s.length()==0){
            System.out.println(s);
        }
        else{
                System.out.println(ans.substring(0,ans.length()-1));
        }
    }
    
}
