package dateTime;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BorderLayout;

public class MainFrame {
	private JFrame frame;
//	private JPanel panel;
	private JPanel panel2;
//	private JButton button;
	private JLabel label;
	private Timer timer;
	private FlowLayout flowLayout; 
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
		this.frame.setSize(300,190);
		this.frame.setLocation(950,100);
		this.frame.setLayout(new BorderLayout());		

		
		panel2 = new JPanel();
		this.panel2.setBackground(new Color(0,255,0));
		flowLayout = new FlowLayout();
		this.panel2.setLayout(this.flowLayout);
		this.frame.add(panel2, BorderLayout.CENTER);
		
		label = new JLabel();
		
		this.panel2.add(label);
		this.label.setText(GetTime());
		
		
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
