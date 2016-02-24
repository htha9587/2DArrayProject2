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
import java.awt.Component;



public class TwoDArrayPanel extends JPanel
{
	
	private TwoDArrayController baseController;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	private SpringLayout baseLayout;
	
	
	public TwoDArrayPanel(TwoDArrayController baseController)
	{
		
		
	this.baseController = baseController;
	fibonacciButton = new JButton("Fibonacci");
	factorialButton = new JButton("Factorial");
	inputField = new JTextField(25);
	resultsArea = new JTextArea(10,25);
	baseLayout = new SpringLayout();
		
		setUpPanel();
		setUpLayout();
		setUpListeners();
		
	}
	

	private void setUpPanel() 
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		resultsArea.setText(baseController.getCalculatedValue());
		resultsArea.setText(baseController.getComponentCount());
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);
		this.setBackground(Color.RED);
		
		
	}


	private void setUpLayout() 
	{
		JLabel label = new JLabel("New label");
		baseLayout.putConstraint(SpringLayout.EAST, label, 0, SpringLayout.EAST, fibonacciButton);
		add(label);
		
		JTextArea textArea = new JTextArea();
		add(textArea);
		
		inputField = new JTextField();
		baseLayout.putConstraint(SpringLayout.SOUTH, label, -2, SpringLayout.NORTH, inputField);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -213, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 6, SpringLayout.SOUTH, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 51, SpringLayout.WEST, this);
		add(inputField);
		inputField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		baseLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 65, SpringLayout.SOUTH, factorialButton);
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
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if (checkInput(input))
				{
					resultsArea.setText(baseController.doFibonacci(input));
				}
				
			}
			
		});
	
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = inputField.getText();
				if (checkInput(input))
				{
					resultsArea.setText(baseController.doFibonacci(input));
				}
				
			}
		});
		
		
		
		
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Integer.parseInt(input);
			isNumber = true;
		}
		catch (Exception numberException)
		{
			resultsArea.setText("You must type in a number");
		}
		
		return isNumber; 
		
	}
	
	
	
}