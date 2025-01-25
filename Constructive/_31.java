import java.util.*;
public class _31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int pages[]=new int[7];
        for(int i=0;i<7;i++){
            pages[i]=sc.nextInt();
        }
        int index=0;
        int sum=0;
     for(int i=0;i<8;i++){
        if(i==7){
            i=0;
        }
        sum+=pages[i];
        if(sum>=n){
            index=i;
            break;

        }
     }
     System.out.println(index+1);
        
    }
}
