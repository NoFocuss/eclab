//Name:
//Date:
//Per:
//AP Comp Sci

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		setPrime(0);
	}
	public Prime(int num)
	{
		setPrime(num);
	}

	public void setPrime(int num)
	{
		number = num;
	}


	//boolean isPrime()   goes here

	public boolean isPrime()
	{
		if (number % 2 == 0)
		{
			return false;
		}
		return true;
	}





	public String toString()
	{

		return number + " is prime? :: " + isPrime();
	}
}
