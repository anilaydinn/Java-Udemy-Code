import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KullaniciGirisi extends JFrame {

	private JPanel contentPane;
	private JTextField kullanici_adi_alani;
	private JPasswordField parola_alani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KullaniciGirisi frame = new KullaniciGirisi();
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
	public KullaniciGirisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton giris = new JButton("Giriş Yap");
		giris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanici_adi = kullanici_adi_alani.getText();
				String parola = new String(parola_alani.getPassword());
				String message;
				
				if(kullanici_adi.equals("Anıl Aydın") && parola.equals("12345")) {
					
					message = "Hoşgeldiniz, " + kullanici_adi; 
				}
				else if(!kullanici_adi.equals("Anıl Aydın") && parola.equals("12345")) {
					
					message = "Kullanıcı Adı Hatalı.";
				}
				else if(kullanici_adi.equals("Anıl Aydın") && !parola.equals("12345")) {
					
					message = "Parola Hatalı.";
				}
				else {
					
					message = "Kullanıcı Adı ve Parola Hatalı.";
				}
				
				if(message.equals("Hoşgeldiniz, " + kullanici_adi)) {
								
					JOptionPane.showMessageDialog(null, message);
					System.exit(0);
				}
				else {
					
					JOptionPane.showMessageDialog(null, message);
				}
				
				JOptionPane.showMessageDialog(null, message);
				
				kullanici_adi_alani.setText("");
				parola_alani.setText("");
			}
		});
		giris.setBounds(135, 137, 216, 25);
		contentPane.add(giris);
		
		kullanici_adi_alani = new JTextField();
		kullanici_adi_alani.setBounds(135, 59, 216, 19);
		contentPane.add(kullanici_adi_alani);
		kullanici_adi_alani.setColumns(10);
		
		parola_alani = new JPasswordField();
		parola_alani.setBounds(135, 93, 216, 19);
		contentPane.add(parola_alani);
		
		JLabel lblKullancAd = new JLabel("Kullanıcı Adı :");
		lblKullancAd.setBounds(24, 61, 93, 15);
		contentPane.add(lblKullancAd);
		
		JLabel lblParola = new JLabel("Parola :");
		lblParola.setBounds(24, 95, 83, 15);
		contentPane.add(lblParola);
	}
}
