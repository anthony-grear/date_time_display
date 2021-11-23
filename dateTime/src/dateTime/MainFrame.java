package dateTime;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainFrame {
	private JFrame frame;
	private JPanel panel;
	private JPanel panel2;
	private JButton button;
	private JLabel label;
	
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
		
		panel = new JPanel();
		this.panel.setBackground(new Color(0,0,255));
		this.panel.setSize(new Dimension(100, 30));
		this.frame.add(panel, BorderLayout.WEST);
		
		panel2 = new JPanel();
		this.panel2.setBackground(new Color(0,255,0));
		this.panel2.setSize(new Dimension(100, 30));
		this.frame.add(panel2, BorderLayout.EAST);
		
		label = new JLabel();
		this.panel2.add(label);
		this.label.setText(GetTime());
		
		button = new JButton();
		this.button.setText("Current Time");
		this.button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				label.setText(GetTime());
			}
			
		});
		this.panel.add(button);
		
		
		
		this.frame.setVisible(true);
	}
}
