import java.util.*;
public class _17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> set=new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
         int count=0;
       for (Character c : set) {
        if(c != '"'){
            count++;
        }  
      }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
    
}
