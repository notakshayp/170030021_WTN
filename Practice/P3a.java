import java.util.*;

public class p3a{
    public static void main(String args[]){
        System.out.println("The given array is : ");
        int r=3,c=3,maxEle=-9999,itr=0;
        int [][] arr2d=new int[r][c];
        for(int row_i=0;row_i<r;row_i++){
            for(int col_j=0;col_j<c;col_j++){
                arr2d[row_i][col_j]=Integer.parseInt(args[itr]);
                itr++;
                System.out.printf("%d ",arr2d[row_i][col_j]);
                if(arr2d[row_i][col_j]>maxEle){
                    maxEle=arr2d[row_i][col_j];
                }
            }
            System.out.printf("\n");

        }
        System.out.printf("The biggest number in the given array is %d\n",maxEle);
    }

}

