package src;

import javax.swing.JFrame;


public class GameFrame {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("easter_egg_1");

		GamePanel panel = new GamePanel();
		frame.add(panel);
		frame.pack();

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
