import java.awt.EventQueue;

import javax.swing.JFrame;

public class Lab13 {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
				{
					public void run() {
						ColorChangeFrame frame = new ColorChangeFrame();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setVisible(true);
					}
				}
		);

	}
}
