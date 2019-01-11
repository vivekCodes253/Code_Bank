/* Code to efficiently multiply matrices, using transposed matrix
*/

import java.util.Scanner;

class matrixmul
{
    public static void sop(String s)
     {System.out.print(s);}

    public static void disp(int[][] m,int x, int y)
    {
        int i,j;
        for(i=0;i<x;i++)
        {        
            sop("\n");
            for(j=0;j<y;j++)
                sop("\t"+m[i][j]);
        }

    }
    public static int[][] transpose(int[][] m, int x, int y)
    {
        int i,j;
        int[][] result = new int[y][x];

        for(i=0;i<x;i++)
            for(j=0;j<y;j++)
                result[j][i] = m[i][j];
        
        return result;
    }

    public static int[][] matmul(int[][] a,int b[][], int m, int n, int p)
    {
         int[][] result = new int[1][1];

         return result;



    }


    public static void test()
    {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        disp(transpose(matrix,3,3),3,3);


    }



    public static void main(String[] args)
    {
        test();
    }

}