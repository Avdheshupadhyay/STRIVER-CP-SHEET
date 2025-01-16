import java.util.*;
public class _10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        int sum=0;

    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
        sum+=nums[i];
    }
    if(sum!=0){
        System.out.println("HARD");
    }
    else{
    System.out.print("EASY");
    }
    sc.close();
}
    
}
