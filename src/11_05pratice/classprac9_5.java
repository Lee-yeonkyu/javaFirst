import javax.swing.*;
import java.awt.*;

public class classprac9_5 extends JFrame{
	public classprac9_5() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5);
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(" ÀÌ¸§"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ÇÐ¹ø"));
		c.add(new JTextField(""));
		c.add(new JLabel(" ÇÐ°ú"));
		c.add(new JTextField(""));
		c.add(new JLabel(" °ú¸ñ"));
		c.add(new JTextField(""));
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new classprac9_5();
	}

}