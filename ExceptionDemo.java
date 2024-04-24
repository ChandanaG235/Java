package w11;
class NumberRangeException extends Exception
{
	String message;
	NumberRangeException(String msg)
	{
		this.message=msg;
	}
	public 	String getMessage()
	{
		return message;
	}
}

public class ExceptionDemo
{
	public static void main(String[] args)
	{
		int number=20;
		try
		{
			if(number<10||number>20)
			{
				throw new NumberRangeException("Number not within specified range");
			}
			System.out.println("The number in range is:"+number);
		}
		catch(NumberRangeException nre)
		{
			System.out.println(nre.getMessage());
		}
	}
	

}
