//Name:
//Date:
//Per:
//AP Comp Sci

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class BoxRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("box.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
			String let = "";
			let+=file.next().charAt(0);

		   int num = file.nextInt();
			 
			 Box test = new Box(let, num);
			 out.print(test);
		}
	}
}
