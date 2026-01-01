public class Pattern13 {

	public static void main(String[] args) 
	{
		for(int i=1; i<=5; i++)
		{	
			int x = i, y = 9;
			for(int j=1; j<=5; j++)
			{
				if(j%2==1)
				{
					System.out.print(x + " ");
					x += 10;
				}
				else
				{
					System.out.print( (x+y) + " ");
					y -= 2;
				}
			}
					
			
		System.out.println();
		}
	
	}
}