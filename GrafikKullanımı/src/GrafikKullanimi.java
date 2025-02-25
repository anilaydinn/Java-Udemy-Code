import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GrafikKullanimi extends JPanel {

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.RED);
		
		g.drawRect(100, 10, 30, 40);
		
		g.fillRect(200, 100, 30, 40);
		
		g.setColor(Color.BLUE);
		
		g.drawOval(200, 200, 60, 30);
		
		g.fillOval(300, 300, 40, 40);
		
		g.setColor(Color.YELLOW);
		
		g.drawLine(100, 100, 300, 300);
	}
	
	public GrafikKullanimi() {
		
		setBackground(Color.BLACK);
	}

}
