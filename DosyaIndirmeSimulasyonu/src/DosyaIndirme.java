import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.awt.event.ActionEvent;


public class DosyaIndirme extends JFrame {

	private int say = 0;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DosyaIndirme frame = new DosyaIndirme();
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
	public DosyaIndirme() {
		setResizable(false);
		setTitle("Dosya İndirme Simulasyonu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar checkprogress = new JProgressBar();
		checkprogress.setStringPainted(true);
		checkprogress.setBounds(105, 80, 439, 64);
		contentPane.add(checkprogress);
		
		JButton dosyaindir = new JButton("Dosya İndirmeyi Başlat");
		dosyaindir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				javax.swing.Timer timer = new javax.swing.Timer(500, null);
				
				timer.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						say++;
						
						checkprogress.setValue(say);
						
						if(checkprogress.getValue() == 100) {
							
							//JOptionPane.showMessageDialog(DosyaIndirme.this, "Dosya İndirme Tamamlandı...");
							
							timer.stop();
							
							SonucSayfasi sonucsayfasi = new SonucSayfasi();
							
							setVisible(false);
							sonucsayfasi.setVisible(true);
							
						}
					}
				});
				
				timer.start();
			}
		});
		dosyaindir.setBounds(198, 262, 251, 51);
		contentPane.add(dosyaindir);
		setLocationRelativeTo(null);
	}
}
