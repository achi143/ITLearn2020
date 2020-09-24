package Arrays;

public class ForThreeDime {
	
	public static void main(String[] args) {
		
		int[][][] a = {{{2,3,4,5},{2,5,3,8},{9,6,4,3}},{{7,5,4,3},{9,7,6,4},{3,4,2,32}}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				for(int k=0;k<a[0][0].length;k++)
				{
					System.out.print(a[i][j][k]);
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}

}
