import java.util.*;
class Lab4Task4
{
	public static void main(String[] args) 
	{
		Scanner scanf=new Scanner(System.in);
		int [][]matrixA=new int[3][3];
		int [][]matrixB=new int[3][3];
		int [][]sum=new int[3][3];
		System.out.println("Matrix A");
		for (int i=0;i<matrixA.length;i++) 
		{
			for (int j=0;j<matrixA[i].length;j++) 
			{
				System.out.print("("+i+","+j+")"+" ");
				matrixA[i][j]=scanf.nextInt();
			}
		}
		System.out.println("Matrix B: ");
		for (int i=0;i<matrixB.length;i++) 
		{
			for (int j=0;j<matrixB[i].length;j++) 
			{
				System.out.print("("+i+","+j+")"+" ");
				matrixB[i][j]=scanf.nextInt();
			}
		}
		System.out.println("Sum of Matrix A & B: ");
		for (int i=0;i<matrixA.length;i++) 
		{
			for (int j=0;j<matrixA[i].length;j++) 
			{
				sum[i][j]=matrixA[i][j]+matrixB[i][j];
				System.out.print(sum[i][j]+"  ");
			}
			System.out.println();
		}
	}
}