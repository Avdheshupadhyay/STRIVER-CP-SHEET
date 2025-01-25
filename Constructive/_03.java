import java.util.*;

public class _03 {
  public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
          int [][] matrix=new int[5][5];
          for(int i=0;i<5;i++){
         for(int j=0;j<5;j++){
          matrix[i][j]=sc.nextInt();
          }
        }
           int row=0;
            int col=0;
        for(int i=0;i<5;i++){
         for(int j=0;j<5;j++){
        if(matrix[i][j]==1){
        row=i;
        col=j;
        }
      }
    }

      int ans=Math.abs(2-row)+Math.abs(2-col);
      System.out.println(ans);
    }
}

