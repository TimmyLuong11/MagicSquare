import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rows, columns do you have?");
		int rowcol = scan.nextInt();
		int [][] myArray = new int[rowcol][rowcol];
		
		for(int rows = 0; rows < myArray.length; ++rows)
		{
			System.out.println("You are entering the data for row " + rows);
			
			for(int cols = 0; cols < myArray[0].length; ++cols)
			{
				System.out.println("You are entering the data for column " + cols);
				myArray[rows][cols] = scan.nextInt();
			}
		}
		
		/*Magic square = new Magic(myArray);
		if(square.isMagic)
		{
			System.out.println("Yes it is a Magic Square");
		}
		else
		{
			System.out.println("No it is NOT a Magic Square");
		}
		System.out.println(square);*/
		for(int a = 0; a < rowcol; a++)
	      {
	         for(int b = 0; b < rowcol; b++)
	         {
	            System.out.print(myArray[a][b] + "\t");
	         }
	         System.out.println();
	      }
		scan.close();
	}
}
