import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

class User {
	
	private String kullanici_adi;
	private String parola;
	
	public User(String kullanici_adi, String parola) {
		
		this.kullanici_adi = kullanici_adi;
		this.parola = parola;
	}
	
	public void setKullaniciAdi(String kullanici_adi) {
		
		this.kullanici_adi = kullanici_adi;
	}
	
	public String getKullaniciAdi() {
		
		return this.kullanici_adi;
	}
	
	public void setParola(String parola) {
		
		this.parola = parola;
	}
	
	public String getParola() {
		
		return this.parola;
	}
}

public class AnaEkran extends JFrame {

	
	private static ArrayList<User> user_list = new ArrayList<User>();
	public static ArrayList<User> getUser_list() {
		return user_list;
	}

	public static void setUser_list(ArrayList<User> user_list) {
		AnaEkran.user_list = user_list;
	}

	private JPanel contentPane;
	private JTextField kullaniciadi_alani;
	private JPasswordField parola_alani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaEkran frame = new AnaEkran();
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
	public AnaEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel registerloginpanel = new JPanel();
		registerloginpanel.setBackground(new Color(220, 20, 60));
		registerloginpanel.setBounds(12, 161, 426, 97);
		contentPane.add(registerloginpanel);
		registerloginpanel.setLayout(null);
		
		JButton register = new JButton("Register");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegisterEkrani registerekrani = new RegisterEkrani();
				
				registerekrani.setVisible(true);
			}
		});
		register.setBounds(62, 35, 114, 25);
		registerloginpanel.add(register);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String kullanici_adi = kullaniciadi_alani.getText();
				String parola = new String(parola_alani.getPassword());
				
				if(user_list.size() == 0) {
					
					JOptionPane.showMessageDialog(AnaEkran.this, "Hiçbir kullanıcı bulunmamaktadır...");
				}
				else {
					
					for(User user : user_list) {
						
						if(user.getKullaniciAdi().equals(kullanici_adi) && user.getParola().equals(parola)) {
							
							JOptionPane.showMessageDialog(AnaEkran.this, "Hoşgeldiniz, " + kullanici_adi);
							return;
						}
						
					}
					JOptionPane.showMessageDialog(AnaEkran.this, "Böyle bir kullanıcı bulunmamaktadır. Lütfen register olun...");
				}
			}
		});
		login.setBounds(231, 35, 114, 25);
		registerloginpanel.add(login);
		
		JPanel loginpanel = new JPanel();
		loginpanel.setBackground(new Color(0, 0, 128));
		loginpanel.setBounds(12, 12, 426, 137);
		contentPane.add(loginpanel);
		loginpanel.setLayout(null);
		
		JLabel lblKullancAd = new JLabel("Kullanıcı Adı:");
		lblKullancAd.setFont(new Font("Dialog", Font.BOLD, 14));
		lblKullancAd.setForeground(new Color(255, 255, 255));
		lblKullancAd.setBounds(38, 35, 125, 15);
		loginpanel.add(lblKullancAd);
		
		JLabel lblParola = new JLabel("Parola:");
		lblParola.setFont(new Font("Dialog", Font.BOLD, 14));
		lblParola.setForeground(new Color(255, 255, 255));
		lblParola.setBounds(38, 61, 125, 15);
		loginpanel.add(lblParola);
		
		kullaniciadi_alani = new JTextField();
		kullaniciadi_alani.setBounds(181, 33, 124, 19);
		loginpanel.add(kullaniciadi_alani);
		kullaniciadi_alani.setColumns(10);
		
		parola_alani = new JPasswordField();
		parola_alani.setBounds(181, 59, 124, 19);
		loginpanel.add(parola_alani);
	}
}
