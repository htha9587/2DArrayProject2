package twoDView;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.*;
import twoDController.TwoDArrayController;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Button;


public class TwoDArrayPanel extends JPanel
{
	
	private TwoDArrayController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private JTextArea firstTextArea;
	private SpringLayout baseLayout;
	private JLabel firstLabel;
	private JTextField textField;
	private JTextField textField_1;
	
	
	
	public TwoDArrayPanel(TwoDArrayController baseController)
	{
		
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	firstButton = new JButton("");
	baseLayout.putConstraint(SpringLayout.WEST, firstButton, 64, SpringLayout.WEST, this);
	firstTextField = new JTextField("");
	baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 10, SpringLayout.NORTH, this);
	firstTextArea = new JTextArea("");
	baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 62, SpringLayout.EAST, firstTextArea);
	firstLabel = new JLabel("");
		
		setUpPanel();
		setUpLayout();
		setUpListeners();
		
	}
	

	private void setUpPanel() 
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(firstTextArea);
		this.add(firstLabel);
		
	}

	private void setUpLayout() 
	{
		JLabel label = new JLabel("New label");
		baseLayout.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, firstButton);
		add(label);
		
		JTextArea textArea = new JTextArea();
		add(textArea);
		
		textField = new JTextField();
		baseLayout.putConstraint(SpringLayout.SOUTH, label, -2, SpringLayout.NORTH, textField);
		baseLayout.putConstraint(SpringLayout.SOUTH, textField, -213, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 6, SpringLayout.SOUTH, textField);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 51, SpringLayout.WEST, this);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		baseLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 65, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, btnNewButton, 38, SpringLayout.WEST, this);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(btnNewButton);
		// TODO Auto-generated constructor stub
	
		/**
		 * Sets Layout.
		 */
	}

	private void setUpListeners()
	{
			
		/**
		 * Checks for mouse  to change window color.	
		 */
			this.addMouseListener(new MouseListener()
			{
				public void mouseClicked(MouseEvent clicked)
				{
		//changeRandomColor();
				if(SwingUtilities.isLeftMouseButton(clicked))
				{
					
				}
				else if (SwingUtilities.isRightMouseButton(clicked))
				{
					
				}
			
			}
			
			public void mouseReleased(MouseEvent released)
			{
	//			changeRandomColor();
			}
			
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			public void mouseEntered(MouseEvent entered)
			{
		//		changeRandomColor();
			}
			
			public void mouseExited(MouseEvent exited)
			{
//				changeRandomColor();
			}
		});
	
	/**
	 * Checks for mouse motion to change color.
	 */
			this.addMouseMotionListener(new MouseMotionListener()
			{
				public void mouseMoved(MouseEvent moved)
				{
					
				}
				
				public void mouseDragged(MouseEvent dragged)
				{
					if(dragged.isAltDown())
					{
						
					}
				}
			});
		}
}