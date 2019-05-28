import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CatchButtonGameV1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton[] buttons= new JButton[9];
	public Random random=new Random();
	public int randomInt=random.nextInt(9);
	public CatchButtonGameV1() {
		this.setTitle("Catch me if you can!");
		this.getContentPane().setLayout(new GridLayout(3,3));
		for(int i=0;i<9;i++)
		{
			buttons[i]=new JButton();
			buttons[i].addMouseListener(new M0l());
			add(buttons[i]);
		}
		buttons[randomInt].setText("Click me");
		pack();
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[]args) {
		new CatchButtonGameV1();
	}
	class M0l implements MouseListener {
		public void mouseClicked(MouseEvent m) {
		}
		public void mousePressed(MouseEvent m) {
		}
		public void mouseReleased(MouseEvent m) {
		}
		public void mouseEntered(MouseEvent m) {
			JButton t=(JButton)m.getSource();
			if(t.getText().equals("Click me")) {
				t.setText("");
				do {
					randomInt=random.nextInt(9);
				}while(t==buttons[randomInt]);
				buttons[randomInt].setText("Click me");
			}
		}
		public void mouseExited(MouseEvent m) {
		}
	}
}