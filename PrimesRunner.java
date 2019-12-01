//Name:
//Date:
//Per:
//AP Comp Sci

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class PrimesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("primes.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{
			int num = file.nextInt();
			Prime test = new Prime(num);
			out.println(test);
		}
	}
}
