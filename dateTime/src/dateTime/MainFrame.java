package dateTime;
import javax.swing.JFrame;

public class MainFrame {
	private JFrame frame;
	
	public MainFrame() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("Date and Time");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(300,190);
		this.frame.setLocation(950,100);
		this.frame.setVisible(true);
	}
}
