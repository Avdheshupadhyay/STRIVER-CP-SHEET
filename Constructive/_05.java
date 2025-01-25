import java.util.*;
public class _05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[3];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        Arrays.sort(arr);
        int ans=(arr[1]-arr[0])+(arr[2]-arr[1]);
        System.out.println(ans);

    }
    
}
