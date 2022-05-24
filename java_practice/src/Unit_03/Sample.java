package Unit_03;

import java.io.IOException;
import java.util.InputMismatchException;

public class Sample
{

	public static void main(String[] args)
	{
		try 
		{
			int a=100/0;
			System.out.println(a);
		
		}
		
		catch(InputMismatchException e)	
		{
			System.out.println("exception "+e.getMessage());	
		}
		
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());	
//		}
		
		finally
		{                                   // "FINALLY ALWAYS RUNS"
			System.out.println("djkfhdkjf");// if there is exception or no exception finally would always run
			                                // if there is an exception in try block but there is no appropriate
			                                // catch block to catch that expression still finally would run.
		}
		
		System.out.println("done");

		
	}

}
