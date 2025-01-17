import java.util.*;
public class _21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        int []nums=new int[n];
        for (int i = 0; i < n; i++) {
           nums[i]=sc.nextInt();
            
        }
        int maxCount=1;
        for (int i = 0; i < n-1; i++) {
            if(nums[i]<nums[i+1]){
                 count++;
                 maxCount = Math.max(maxCount, count);
            }

            else   count=1;
            
        }
        System.out.println(maxCount);
    }
    
}
