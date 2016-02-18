package twoDView;
import javax.swing.JFrame;
import java.awt.*;
import twoDController.TwoDArrayController;

/**
 * Version 0.1
 * @author htha9587
 *Creates JFrame for 2D Array GUI.
 *2-8-16
 */

public class TwoDArrayFrame extends JFrame
{
	private TwoDArrayController baseController;
	private TwoDArrayPanel basePanel;
	
	public TwoDArrayFrame(TwoDArrayController baseController)
	{
		this.baseController = baseController; //Assign data parameter.
		basePanel = new TwoDArrayPanel(baseController);
		setUpFrame();
	}
	
	/**
	 * Helper method to set up JFrame.
	 */
	
	private void setUpFrame()
	{
		this.setContentPane(basePanel); //Required for GUI frame.
		this.setResizable(false); //Optional
		this.setTitle("title"); // Sets title
		this.setSize(400, 400); // Sets size
		this.setVisible(true); // Last line in method.
	}
	
	public TwoDArrayController getBaseController()
	{
		return baseController;
	}
	
}
