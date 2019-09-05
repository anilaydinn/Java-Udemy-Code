import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class Deneme extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deneme frame = new Deneme();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Deneme() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField yazi_alanimiz = new TextField();
		yazi_alanimiz.setBounds(106, 77, 227, 19);
		contentPane.add(yazi_alanimiz);
		
		JButton butonumuz = new JButton("Tıkla");
		butonumuz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				yazi_alanimiz.setText("Deneme");
			}
		});
		butonumuz.setBounds(163, 168, 114, 25);
		butonumuz.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(butonumuz);
		
	}
}
