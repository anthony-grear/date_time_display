package dateTime;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DateTime {	
		
	public static void main(String[] args) throws InterruptedException {
		//Schedule a job for the event-dispatching thread
		//creating and showing the application's GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {					
				MainFrame frame = new MainFrame();
			}				
		});		
	}	
}
