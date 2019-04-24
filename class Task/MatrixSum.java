class MatrixSum
{
	public static void main(String[] args) 
	{
		//Array Matrix Sum
		int [][]A={{9,3,8},{4,5,4},{6,5,3}};
		int [][]B={{4,1,0},{5,1,7},{6,9,8}};
		int [][]Sum=new int[3][3];
		for (int i=0;i<A.length;i++) 
		{
			for (int j=0;j<B.length;j++) 
			{
				Sum[i][j]=A[i][j]+B[i][j];
				System.out.print(Sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}