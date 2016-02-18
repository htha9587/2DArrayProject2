package twoDModel;

/**
 * version 0.1
 * @author htha9587
 * Framework for 2D Creation Project.
 *
 */
public class twoDModel 
{

	private String content;
	private String userName;
	
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
		String info = "Content, "+ content + "userName"+ userName;
		return info;
	}
	
}
