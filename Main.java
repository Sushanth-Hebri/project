import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//public class button
 class Buttons {
	Buttons()
	{
		JFrame j=new JFrame("Swings");
		JButton b=new JButton("Click mado illi");
		j.add(b);
		b.setBounds(40,50,100, 100);
		j.setVisible(true);
		j.setSize(100,100);
//		j.setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(
				 new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						b.setText("Konegoo click madbitta...");
						
					}
					
				}
				);
	}
	public static void Main(String[] args) {
//		System.out.println("Buttons setting in java");
		new Buttons();
	}
}