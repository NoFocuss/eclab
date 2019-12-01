//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;

public class Box
{
   private String let;
   private int size;

	public Box()
  {
    setBox("", 0);
  }
  public Box(String l, int s)
  {
    setBox(l, s);
  }

  public void setBox(String l, int s)
  {
    let = l;
    size = s;
  }

	public String toString()
	{
		String output="";
    for (int i = 1; i<=size; i++)
    {
      for (int j = 1; j <=size; j++)
      {
        output+=let;
      }
      output += "\n";
    }


		return output+"\n";
	}
}
