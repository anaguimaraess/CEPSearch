package cep;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("@Author Ana Guimar\u00E3es");
		lblNewLabel.setBounds(46, 68, 178, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar CEP - Vers\u00E3o 1.0");
		lblNewLabel_1.setBounds(46, 43, 178, 14);
		getContentPane().add(lblNewLabel_1);
		
		JButton btnGithub = new JButton("");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				link("https://github.com/anaguimaraess");
			}
		});
		btnGithub.setBorder(null);
		btnGithub.setBackground(SystemColor.control);
		btnGithub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGithub.setToolTipText("Github");
		btnGithub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		btnGithub.setBounds(391, 228, 33, 33);
		getContentPane().add(btnGithub);
		
		JLabel lblNewLabel_2 = new JLabel("Acesso ao Github de Ana Guimar\u00E3es");
		lblNewLabel_2.setBounds(158, 236, 206, 14);
		getContentPane().add(lblNewLabel_2);

	}
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try{
			URI uri = new URI(site);
			desktop.browse(uri);
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
