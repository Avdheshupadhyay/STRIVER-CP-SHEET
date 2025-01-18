import java.util.*;
public class _28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []c=s.toCharArray();
        int n=c.length;
        String Withoutvowel="";
        String vowel="aeiouy";
        for (int i = 0; i < c.length; i++) {
            String temp=Character.toString(c[i]).toLowerCase();
            if(!(vowel.contains(temp))){
                Withoutvowel+=temp;
            }
        }
        String ans="";
        for (int i = 0; i <Withoutvowel.length(); i++) {
            ans+=".";
            ans+=Withoutvowel.charAt(i);    
        }
        System.out.println(ans);

    }
}
