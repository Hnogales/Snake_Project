import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		
		this.add(new GamePanel()); // or GamePanel panel = new GamePanel();
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null); // This will appear in middle of screen.
	}

}
