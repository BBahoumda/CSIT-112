import java.awt.*;
import javax.swing.*;
import javax.swing.Box;

public class IntroPanel extends JPanel {
	 IntroPanel() 
	{
		setBackground(Color.green);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel label1 = new JLabel("Layout Manager Demo");
		JLabel label2 = new JLabel("Pick a tab to see an example of a layout manager");
		
		add(Box.createRigidArea(new Dimension(0, 20)));
		add(label1);
		add(Box.createRigidArea(new Dimension(0, 20)));
		add(label2);
	}

}
