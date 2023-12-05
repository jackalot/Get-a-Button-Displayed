import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	MyFrame(){
		//Create
		 button = new JButton();
		 //set the bounds so where its going.
		 // set its width and height
		button.setBounds(150, 100, 250, 50);
		// add action listener
		 button.addActionListener(this);
		 button.setText("Click me, you know you want to!");
		 // Removes the box around a 
		 // button when you click it
		 button.setFocusable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println("poo");
		}
	}
}
 