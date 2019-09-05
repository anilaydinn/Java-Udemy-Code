import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KelimeveHarfSayisi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KelimeveHarfSayisi frame = new KelimeveHarfSayisi();
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
	public KelimeveHarfSayisi() {
		setTitle("Kelime ve Harf Sayısı");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea yazi_alani = new JTextArea();
		yazi_alani.setBounds(22, 45, 403, 139);
		contentPane.add(yazi_alani);
		
		JLabel kelime_alani = new JLabel("Kelime Sayısı : ");
		kelime_alani.setBounds(28, 12, 137, 15);
		contentPane.add(kelime_alani);
		
		JLabel harf_alani = new JLabel("Harf Sayısı :");
		harf_alani.setBounds(270, 12, 106, 15);
		contentPane.add(harf_alani);
		
		JButton goster = new JButton("Kelime ve Harf Sayısı Göster");
		goster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String yazi = yazi_alani.getText();
				
				int karakter_sayisi = 0;
				int kelime_sayisi = 0;
				
				for(int i = 0; i < yazi.length(); i++) {
					
					if(yazi.charAt(i) != ' ') {
						
						karakter_sayisi++;
					}
				}
				
				String[] kelime_array = yazi.split(" ");
				
				for(String kelime : kelime_array) {
					
					kelime_sayisi++;
				}
				
				kelime_alani.setText("Kelime Sayısı : " + kelime_sayisi);
				harf_alani.setText("Harf Sayısı : " + karakter_sayisi);
			}
		});
		goster.setBounds(78, 214, 298, 25);
		contentPane.add(goster);
		
	}
}
