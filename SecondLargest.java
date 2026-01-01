import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args){

	int[] numbs = {12, 35, 1, 10, 34, 1};

	//	int[] numbs = {10, 10, 10};

      		System.out.print(getSecondLargest(numbs));
}

public static int getSecondLargest(int[] numbs)
{
			int max1 = 0;
			int max2 = 0;

		if(numbs[0] > numbs[1])
		{
			max1 = numbs[0];
			max2 = numbs[1];
		}
		else if
		{
			max1 = numbs[1];
			max2 = numbs[0]; 
			
		}
		
		
		// System.out.println("Initial Max1 :  " + max1 + "  and max2 : " + max2);

		for(int i=2; i<numbs.length; i++)
		{
			if(numbs[i] > max1)
			{
				max2 = max1;
				max1 = numbs[i];
			}
			else if(numbs[i] > max2)
			{
				max2 = numbs[i];
			}
			
		} // end of for loop

		System.out.println("max1 : " + max1 + "  max2 : " + max2);	
		return max2;
} // end of method

} // end of Main Class
		

