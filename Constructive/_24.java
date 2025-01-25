import java.util.*;
public class _24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int []arr={1,11,111,1111};
            int []nums=new int[36];
            int j=1,i=0;
            while(i<36){
                for(int k=0;k<4;k++){
                    nums[i]=(j*arr[k]);
                    i++;
                }
                j++;
            }







            
          int ans=0;
          for(int k=0;k<36;k++){
            int n=String.valueOf(nums[k]).length();
             ans+=n;
            if(nums[k]==x){

                break;
            }
        }
          System.out.println(ans);
        }
    }
    
}