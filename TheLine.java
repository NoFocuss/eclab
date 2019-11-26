//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.util.Scanner;
public class TheLine
{
   private String line;

   public TheLine()
   {
     line = "";
   }

   public TheLine(String s)
   {
     line = s;
   }

	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
    Scanner tl = new Scanner(line);
    while (tl.hasNextInt())
    {
        int num = tl.nextInt();
        if (num > largest)
        {
          largest = num;
        }
    }
		return largest;
	}

	public String toString( )
	{
		return "-" + line + "- Greatest == " + getLargest() + "\n\n";
	}
}
