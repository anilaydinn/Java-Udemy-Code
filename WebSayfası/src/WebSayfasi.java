import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class WebSayfasi extends JFrame {

	private int say = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebSayfasi frame = new WebSayfasi();
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
	public WebSayfasi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField web_sayfasi = new TextField();
		web_sayfasi.setBounds(10, 110, 430, 19);
		contentPane.add(web_sayfasi);
		
		JButton tikla_butonu = new JButton("Tıkla");
		tikla_butonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String internet_adresi = web_sayfasi.getText();
				
				Desktop d = Desktop.getDesktop();
				
				try {
					d.browse(new URI(internet_adresi));
				} catch (IOException e1) {
					
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					
					e1.printStackTrace();
				}
				
				/*say++;
				
				System.out.println("Butona " + say + " kere tıklandı...");*/
			}
		});
		tikla_butonu.setBounds(163, 208, 114, 25);
		contentPane.add(tikla_butonu);
		
	}
}
