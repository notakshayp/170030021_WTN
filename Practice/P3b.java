import java.util.*;
public class P3b{
    public static void main(String args[]){
        if(args.length <4){
            System.out.println("Please enter 4 integer numbers");
        }
        else{
            System.out.println("The given array is : ");
            int r=2,c=2,itr=0;
            int [][] arr2d=new int[r][c];
            for(int row_i=0;row_i<r;row_i++){
                for(int col_j=0;col_j<c;col_j++){
                    arr2d[row_i][col_j]=Integer.parseInt(args[itr]);
                    itr++;
                    System.out.printf("%d ",arr2d[row_i][col_j]);
                }
                System.out.printf("\n");
                
            }
            System.out.println("The reverse of the array is :");
            for(int row_i=r-1;row_i>-1;row_i--){
                for(int col_j=c-1;col_j>-1;col_j--){
                    System.out.printf("%d ",arr2d[row_i][col_j]);
                }
                System.out.printf("\n");
            }
            }
    }

}

