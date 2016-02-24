package twoDModel;


/**
 * Class to get how much time it took to run the algorithm.
 * @author htha9587
 *
 */
public class Timer 
{
	
	private long executionTime;
	
	
	public void codeTimer()
	{
		this.executionTime = 0;
	}
	
	public void startTimer()
	{
		this.executionTime = System.nanoTime();
	}
	
	
	public void stopTimer()
	{
		this.executionTime = System.nanoTime() - executionTime;
	}
	
	public void resetTimer()
	{
		this.executionTime = 0;
	}
	
	// Returns executionTime value for object.
	public long getExecutionTime() 
	{
		return executionTime;
	}

	public String toString()
	{
		String timerDescription = "Current execution time is: " + this.executionTime + 
				"in nanoseconds.";
		return timerDescription;
	}
	
}
