package twoDModel;

/**
 * version 0.3
 * @author htha9587
 * Framework for 2D Creation Project.
 *
 */

import twoDController.TwoDArrayController;
import twoDView.TwoDArrayFrame;
import twoDView.TwoDArrayPanel;
import java.math.BigInteger;

public class twoDModel 
{

	private String content;
	private String userName;
	private String fibonacciNumber;
	private String factorialNumber;
	private String factorialNumber1;
	private int fibonacciIteration;
	private int factorialIteration;
	public long startTime;
	public long endTime;
	
	
	

	
	public twoDModel(String userName)
	{
		this.userName = userName;
		
	}
	
	public boolean quitChecker(String currentInput)
	{
		boolean hasQuit = false;
		
		if(currentInput.equals("quit"))
		{
			hasQuit = true;
		}
		
		return hasQuit;
	}
	
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null)
		{
			if(currentInput.length() >=1)
			{
				hasLength = true;
			}
		}
		
		return hasLength;
	}
	
	
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.toLowerCase().contains(content.toLowerCase()))
		{
			hasContent = true;
		}
		
		return hasContent;	
		
	}
	/**
	 * Checks if content is existent.
	 */
	
	public String toString()
	{
		String info = "Content, "+ "userName";
		return info;
	}
	
	public int fibonacciNumber(int n)
	{
		if(n < 0 )
			return Integer.MIN_VALUE;
		if(n == 0 || n==1)
			return 1;
		else 
			return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
	}
	
	public int factorialNumber(int n)
	{
		if(n < 0 )
			return Integer.MIN_VALUE;
		if (n == 0)
		{
			return  1;
		}
		else
		{
			return n * factorialNumber(n - 1);
		}
	}
		
	public int fibonacciIteration(int n)	
	{
		int x, y, z;
		
		startTime = System.nanoTime();
		if(n == 0)
			return 0;
		else
		{
			x = 0;
			y = 1;
			for(int i = 0; i <= n; i++)
			{
				z = x + y;
				x = y;
				y = z;
			}
			endTime = System.nanoTime();
			return y;
		}
		
		
		
	}
	
	public BigInteger factorialIteration(int n)
	{
		BigInteger factValue = BigInteger.ONE;
		for( int i = 2; i <= n; i++)
		{
			factValue = factValue.multiply(BigInteger.valueOf(i));
		}
		return factValue;
	}

	
	
}
