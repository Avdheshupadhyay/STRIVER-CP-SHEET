import java.util.*;
public class _12{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    sc.nextLine();
	    while(tc-- > 0){
	    int n = sc.nextInt();
	    if( (n/2)%2 != 0){
	        System.out.println("No");
	        continue;
	    }
	    int[] even = new int[n/2];
	    int[] odd = new int[n/2];
	    int evenS =0, oddS =0;
	    int t =2, s =1;
	    for(int i=0; i<n/2; i++){
	        even[i] = t;
	        t+=2;
	        evenS += even[i];
	    }
	    
	    for(int i=0; i<(n/2)-1; i++){
	        odd[i] = s;
	        s += 2;
	        oddS += odd[i];
	    }
	    odd[(n/2) -1] = evenS - oddS;
	    System.out.println("Yes");
	    for(int c : even){
	        System.out.print(c+ " ");
	    }
	    
	    for(int c : odd){
	        System.out.print(c+ " ");
	    }
	    System.out.println();
	    
	    }
	}
}