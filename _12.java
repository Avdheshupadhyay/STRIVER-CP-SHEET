import java.util.*;
public class _12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  n=sc.nextLine();
        int count=0;
        char[]c=n.toCharArray();
        for(char p : c){
            if(p=='4' || p=='7'){
                count++;
            }
       
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       

    }
}