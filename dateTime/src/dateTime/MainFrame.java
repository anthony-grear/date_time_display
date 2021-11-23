package dateTime;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.BorderLayout;

public class MainFrame {
	private JFrame frame;
//	private JPanel panel;
	private JPanel panel2;
//	private JButton button;
	private JLabel label;
	private Timer timer;
	private BorderLayout borderLayout; 
	public MainFrame() {
		initialize();
	}
	
	public String GetTime() {
		DateTimeFormatter dateTimeFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		LocalDateTime localDateTime = LocalDateTime.now();
		String formattedDateTimeObj = localDateTime.format(dateTimeFormatObj);
		return formattedDateTimeObj;
	}
	
	
	
	public void initialize() {
		frame = new JFrame();		
		this.frame.setTitle("Date and Time");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(250,185);
		this.frame.setLocation(950,100);
		this.frame.setLayout(new BorderLayout());		

		
		panel2 = new JPanel();
		this.panel2.setBackground(new Color(0,255,0));
		borderLayout = new BorderLayout();
		this.panel2.setLayout(this.borderLayout);
		this.frame.add(panel2, BorderLayout.CENTER);
		
		label = new JLabel(GetTime(), SwingConstants.CENTER);
		
		this.panel2.add(label, BorderLayout.CENTER);

		
		
		timer = new Timer(1000, new ActionListener() {		 
			@Override
			public void actionPerformed(ActionEvent e) {				
				label.setText(GetTime());
			}
			
		});
		this.timer.start();		
		this.frame.setVisible(true);
	}
}
