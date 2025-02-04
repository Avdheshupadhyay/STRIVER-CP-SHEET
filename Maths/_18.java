import java.util.*;
public class _18{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int count=0;
	        int ans=n/2;
	        if(n%2==0){
	            System.out.println(ans-1);
	        }
	        else{
	            System.out.println(ans);
	        }
	    }
	}
}