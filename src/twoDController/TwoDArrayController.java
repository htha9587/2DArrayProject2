package twoDController;

import twoDController.twoDRunner;
import twoDModel.twoDModel;
import twoDView.TwoDArrayFrame;
import twoDView.TwoDArrayPanel;
import twoDModel.Timer;
/**
 * 2-24-16
 * @author htha9587
 *Controller class for 2D Array Recursion project.
 *Version 0.2
 */

public class TwoDArrayController 
{
	private TwoDArrayPanel display;
	private TwoDArrayFrame baseFrame;
	private twoDModel mathTool;
	private twoDModel testTool;
	private Timer executionTime;
	private String calculatedValue;
	private String componentCount;
	private String testPanel;
	
	
	public TwoDArrayController()
	{
		baseFrame = new TwoDArrayFrame(this);
		mathTool = new twoDModel("Harry");
		executionTime = new Timer();
		calculatedValue = "";
		componentCount = "";
		
	}
	
	public void start()
	{
		calculatedValue = Integer.toString(mathTool.factorialNumber(0));
		
	}
	public String getCalculatedValue() {
		return calculatedValue;
	}

	public void setCalculatedValue(String calculatedValue) {
		this.calculatedValue = calculatedValue;
	}

	/**
	 * Starts the program.
	 */
			
	
	private void twoDArrayFrame()
	{
		
		{
			
			
			
		}
		
}
	
	public TwoDArrayFrame getBaseFrame() 
	{
		return baseFrame;
	}
	
	private void shutDown()
	{
	
	}
	/**
	 * Exits the program.
	 */
	
	public String doFactorial(String currentInput)
	{
		int doFactorial = 0;
		
		calculatedValue = "The sequence is at " + currentInput + " is" + 
				Integer.toString(mathTool.fibonacciNumber(Integer.parseInt(currentInput)));
		
	return calculatedValue;
	}
	
	public String doFibonacci(String currentInput)
	{
	int doFibonacci = 0;
	
	return calculatedValue;
	}

	public String getComponentCount() 
	{
		return componentCount;
	}

}
