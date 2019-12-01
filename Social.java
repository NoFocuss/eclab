//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;

public class Social
{
   private String socialNum;

	public Social()
	{
    setSocial("");
	}

	public Social(String soc)
	{
    setSocial(soc);
	}

	public void setSocial(String soc)
	{
    socialNum = soc;
	}

	public int getSum()
	{
    int sum = 0;

    StringBuilder str = new StringBuilder(socialNum);




    while (str.indexOf("-") != -1)
    {
      sum += Integer.parseInt(str.substring(0, str.indexOf("-")));


      str.delete(0, str.indexOf("-")+1);
    }

    sum += Integer.parseInt(str.substring(0, str.length()));






		return sum;
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a sum of == " + getSum();
	}
}
