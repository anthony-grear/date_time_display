package dateTime;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DateTime extends JFrame {
	public static void main(String[] args) {
		new DateTime();
		
	}
	public DateTime() {
		setSize(300,190);
		setLocation(950,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Current Date Time");
		setVisible(true);
	}
}
