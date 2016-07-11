import java.util.Scanner ;
import java.util.* ;
class SpiralImp
{
	
	public static void spiral( int n)
	{
		int [][]a = new int[n][n];
		int r = 0, c = 0, ri = 1, li =0, di =0 , ui =0;

		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n ; j++)
			{

				a[i][j] = 0;


			}


		}

		for (int i = 1 ; i<=n*n ; i++)
		{
			if(ri == 1)
			{
				System.out.println( i + " " +  "ri" +a[r][c]);
				if(a[r][c] != 0 || c+1 == n )
				{
					ri = 0;
					di = 1;
					a[r][c] = i;
					r++;
					i++;
				}
				else
				{
					a[r][c] = i;
					c++;
				}
			}
			if(r+1 == n && di ==1)
				{
					a[r][c] = i;
					di = 0;
					li = 1;
					c--;
					//r++;
					
				}
			if(di == 1)
			{
				System.out.println( i + "  " + "di"  + a[r][c]);
				if(a[r][c] != 0 || r+1 == n )
				{
					di = 0;
					li = 1;
					a[r][c] = i;
					c--;
					i++;
				}
				else
				{
					a[r][c] = i;
					r++;
				}
				
			}

			if(c-1 == 0 && li ==1)
				{
					a[r][c] = i;
					li = 0;
					ui = 1;
					r--;
					//r++;
					
				}

			if(li == 1)
			{
				System.out.println( i + " " + "li" + a[r][c]);
				if(a[r][c] != 0 || c-1<0 )
				{
					li = 0;
					ui = 1;
					a[r][c] = i;
					r--;
					i++;
				}
				else
				{
					a[r][c] = i;
					c--;
				}
			}

			if(r-1 == 0 && ui ==1)
				{
					a[r][c] = i;
					ui = 0;
					ri = 1;
					c++;
					//r++;
					
				}
			if(ui == 1)
			{
				System.out.println( i + " " + "ui" +a[r][c]);

				if(a[r][c] != 0 || r-1<0 )
				{
					ui = 0;
					ri = 1;
										
					c++;
					//r++;
					//a[r][c] = i;
					//System.out.println( li+ " " + r + " " + c);
				}
				else
				{
					System.out.println( "In else ");
					a[r][c] = i;
					r--;
				}
			}
			
		}

		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<n ; j++)
			{

				System.out.print(a[i][j]);
			}

				System.out.println();
		}

	}
}

class  Spiral
{

	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");

		int n = in.nextInt();
		SpiralImp spi = new SpiralImp();
		spi.spiral(n);

	}
}