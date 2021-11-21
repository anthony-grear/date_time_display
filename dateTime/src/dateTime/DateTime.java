package dateTime;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class DateTime {
	
	
	//frame constructor
	private static void createAndShowGUI() {
		//create and set up window
		JFrame frame = new JFrame("Date and Time");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,190);
		frame.setLocation(950,100);
		
		JLabel timeLabel = new JLabel();
		frame.getContentPane().setLayout(new GridBagLayout());
		//add controls
		GridBagConstraints gridConstraints = new GridBagConstraints();
		
		timeLabel.setText("Hello World");
		gridConstraints.gridx=0;
		gridConstraints.gridy=0;
		frame.getContentPane().add(timeLabel,gridConstraints);
		
		
		frame.setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread
		//creating and showing the application's GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
	}
	
	
	
		
	

	
}
