//Name:
//Date:
//Per:
//AP Comp Sci

import java.util.Scanner;
import static java.lang.System.*;
import java.text.DecimalFormat;

public class Average
{
   private static DecimalFormat df2 = new DecimalFormat("#.##");
   private String line;

   public Average()
   {
     setAverage("");
   }
   public Average(String l)
   {
     setAverage(l);
   }

   public void setAverage(String l)
   {
     line = l;
   }




	private int getLowest()
	{
		int lowest=Integer.MAX_VALUE;
    Scanner tl = new Scanner(line);
    while (tl.hasNextInt())
    {
        int num = tl.nextInt();
        if (num < lowest)
        {
          lowest = num;
        }
    }



		return lowest;
	}

	public double getAverage()
	{
		double average=0.0;
    int nums= 0;

    Scanner tl = new Scanner(line);
    while (tl.hasNextInt())
    {
        int num = tl.nextInt();
        nums+=1;
        average += num;
    }
    average-= getLowest();
    average /= (nums-1);
    
    return Double.parseDouble(df2.format(average));
	}






  public String toString()
	{


    return "" +getAverage();
  }




}
