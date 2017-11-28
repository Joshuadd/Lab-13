import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangeFrame extends JFrame{
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 600;
	
	private static final int DEFAULT_HEIGHT = 600;
	
	public ColorChangeFrame() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		
		//create buttons
		JButton changeButton = new JButton("Change");
		JButton resetButton = new JButton("Reset");
		JButton closeButton = new JButton("Close");
		
		buttonPanel = new JPanel();
		
		//add buttons to panel
		buttonPanel.add(changeButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);
		
		//add panel to frame
		add(buttonPanel);
		
		//create button actions
		ColorAction changeAction = new ColorAction();
		ResetAction resetAction = new ResetAction();
		CloseAction closeAction = new CloseAction();
		
		//associate actions with buttons
		changeButton.addActionListener(changeAction);
		resetButton.addActionListener(resetAction);
		closeButton.addActionListener(closeAction);	
	}
	
	private class CloseAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			dispose();
		}
	}
	
	private class ResetAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			buttonPanel.setBackground(Color.LIGHT_GRAY);
			
		}
		
	}
	
	/* An action listener that sets the panel's background color */
	private class ColorAction implements ActionListener
	{
		private Color backgroundColor;
		protected int numClicks = 0;
		
		public ColorAction() {
		}
		
		public void actionPerformed(ActionEvent event)
		{
			if(buttonPanel.getBackground() == Color.LIGHT_GRAY)
				numClicks = 0;
			numClicks++;
			if(numClicks % 4 == 0) {
				backgroundColor = Color.PINK;
			} else if (numClicks % 3 == 0) {
				backgroundColor = Color.ORANGE;
			} else if (numClicks % 2 == 0) {
				backgroundColor = Color.GREEN;
			} else {
				backgroundColor = Color.BLACK;
			}
			buttonPanel.setBackground(backgroundColor);
		}
	}
}