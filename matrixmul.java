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
        int i,j,k;
        int[][] result = new int[m][p];
        for(i=0;i<m;i++)
        {
            for(j=0;j<p;j++)
            {
                result[i][j] = 0;
                for(k=0;k<n;k++)
                {
                    result[i][j]+=a[i][k]*b[k][j];

                }
            }
        }


         return result;

    }


    public static void test()
    {
        
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int[][] matrix2 = {{65,64,63},{62,61,60},{59,58,57},{56,55,54},{53,52,51}};
        disp(matrix,3,5);
        sop("\n");
        disp(matrix2,5,3);
        sop("\n");
        disp(matmul(matrix,matrix2,3,5,3),3,3);
        //disp(matrix,3,3);                             //testing display function
        //disp(transpose(matrix,3,3),3,3);              //testing transpose function


    }



    public static void main(String[] args)
    {
        test();
    }

}