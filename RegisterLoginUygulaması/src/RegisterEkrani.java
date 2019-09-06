import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RegisterEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField kullanici_adi_alani;
	private JPasswordField parola_alani;
	private JButton register;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterEkrani frame = new RegisterEkrani();
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
	public RegisterEkrani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel registerpanel = new JPanel();
		registerpanel.setBackground(new Color(148, 0, 211));
		registerpanel.setBounds(12, 12, 426, 246);
		contentPane.add(registerpanel);
		registerpanel.setLayout(null);
		
		JLabel lblKullancAd = new JLabel("Kullanıcı Adı:");
		lblKullancAd.setForeground(new Color(255, 255, 255));
		lblKullancAd.setFont(new Font("Dialog", Font.BOLD, 14));
		lblKullancAd.setBounds(65, 31, 130, 15);
		registerpanel.add(lblKullancAd);
		
		JLabel lblParola = new JLabel("Parola:");
		lblParola.setForeground(new Color(255, 255, 255));
		lblParola.setFont(new Font("Dialog", Font.BOLD, 14));
		lblParola.setBounds(65, 67, 130, 15);
		registerpanel.add(lblParola);
		
		kullanici_adi_alani = new JTextField();
		kullanici_adi_alani.setBounds(213, 29, 183, 19);
		registerpanel.add(kullanici_adi_alani);
		kullanici_adi_alani.setColumns(10);
		
		parola_alani = new JPasswordField();
		parola_alani.setBounds(213, 65, 183, 19);
		registerpanel.add(parola_alani);
		
		register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanici_adi = kullanici_adi_alani.getText();
				String parola = new String(parola_alani.getPassword());
				
				ArrayList<User> user_list = AnaEkran.getUser_list();
				
				user_list.add(new User(kullanici_adi, parola));
				
				setVisible(false); 
			}
		});
		register.setBounds(154, 130, 114, 25);
		registerpanel.add(register);
	}
}
