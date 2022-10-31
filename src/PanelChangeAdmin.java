import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class PanelChangeAdmin extends JPanel {
	private JTextField textCurrentAdminUser;
	private JTextField textNewAdminUser;
	private JPasswordField passwordCurrentAdmin;
	private JPasswordField passwordNewAdmin;
	private JPasswordField passwordConfirm;

	/**
	 * Create the panel.
	 */
	public PanelChangeAdmin() {
		setBackground(new Color(0, 128, 128));
		setBounds(0, 0, 775, 500);
		setVisible(true);
		setLayout(null);
		
		JLabel lblThisIsAdmin = new JLabel("Enter correct informations to change admin");
		lblThisIsAdmin.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblThisIsAdmin.setBounds(133, 0, 542, 43);
		add(lblThisIsAdmin);
		
		JPanel panel = new JPanel();
		panel.setBounds(143, 44, 502, 443);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblCurrentAdminUsername = new JLabel("Current Admin Username:");
		lblCurrentAdminUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurrentAdminUsername.setBounds(146, 24, 191, 16);
		panel.add(lblCurrentAdminUsername);
		
		textCurrentAdminUser = new JTextField();
		textCurrentAdminUser.setBounds(147, 52, 191, 22);
		panel.add(textCurrentAdminUser);
		textCurrentAdminUser.setColumns(10);
		
		JLabel lblCurrentAdminPassword = new JLabel("Current Admin Password:");
		lblCurrentAdminPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurrentAdminPassword.setBounds(145, 86, 191, 16);
		panel.add(lblCurrentAdminPassword);
		
		JLabel lblNewAdminPassword = new JLabel("New Admin Username:");
		lblNewAdminPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewAdminPassword.setBounds(145, 146, 191, 16);
		panel.add(lblNewAdminPassword);
		
		textNewAdminUser = new JTextField();
		textNewAdminUser.setColumns(10);
		textNewAdminUser.setBounds(147, 174, 191, 22);
		panel.add(textNewAdminUser);
		
		JLabel lblNewAdminPassword_1 = new JLabel("New Admin Password:");
		lblNewAdminPassword_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewAdminPassword_1.setBounds(146, 209, 191, 16);
		panel.add(lblNewAdminPassword_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblConfirmPassword.setBounds(146, 272, 191, 16);
		panel.add(lblConfirmPassword);
		
		JButton btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean found = false;
				//getting inputs of current admin
				String username, pass, personal = "admin";
				username = textCurrentAdminUser.getText();
				pass = passwordCurrentAdmin.getText();
				
				//getting input of new admin
				String newAdminUser, newAdminPass, passConfim;
				newAdminUser = textNewAdminUser.getText();
				newAdminPass = passwordNewAdmin.getText();
				passConfim = passwordConfirm.getText();
				
				if(newAdminPass.equals(passConfim)) {
					try {
						File file = new File("LoginData.txt");
						if(!file.exists()) {
							throw new FileNotFoundException("File not found.");
						}else {
							RandomAccessFile raf = new RandomAccessFile(file,"rw");
							
							
							File fileTemp = new File("TempLoginData.txt");
							if(!fileTemp.exists()) {
								fileTemp.createNewFile();
							}
							RandomAccessFile tempRaf = new RandomAccessFile(fileTemp, "rw");
							
							while(raf.getFilePointer() < raf.length()) {
								String[] data = {raf.readLine(), raf.readLine(), raf.readLine()};
								if(data[0].equals(username) && data[1].equals(pass) && data[2].equals(personal)) {
									found = true;
									tempRaf.writeBytes(newAdminUser+"\r\n"+newAdminPass+"\r\n"+personal);
									tempRaf.writeBytes(System.lineSeparator());
								}else {
									tempRaf.writeBytes(data[0]+"\r\n"+data[1]+"\r\n"+data[2]);
									tempRaf.writeBytes(System.lineSeparator());
								}
							}
							
							raf.close();
							tempRaf.close();
							
							file.delete();
							fileTemp.renameTo(file);
							
							if(found == true) {
								JOptionPane.showMessageDialog(null, "Admin changed.");
								Login log = new Login();
								log.makeLoginVisible(true);
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "Incorrect Information." + "\n" + "Please Try Again.");
							}
						}
					}catch(NullPointerException x) {
						JOptionPane.showMessageDialog(null, "Enter complete data.");
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null, "Invalid data encountered.");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Invalid password."+"\n"+"Please try again.");
				}
			}
		});
		btnChange.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnChange.setBounds(184, 376, 106, 25);
		panel.add(btnChange);
		
		passwordCurrentAdmin = new JPasswordField();
		passwordCurrentAdmin.setBounds(147, 111, 115, 22);
		panel.add(passwordCurrentAdmin);
		
		passwordNewAdmin = new JPasswordField();
		passwordNewAdmin.setBounds(147, 238, 115, 22);
		panel.add(passwordNewAdmin);
		
		passwordConfirm = new JPasswordField();
		passwordConfirm.setBounds(147, 301, 115, 22);
		panel.add(passwordConfirm);
	}
	public void dispose() {
	    JFrame parent = (JFrame) this.getTopLevelAncestor();
	    parent.dispose();
	}
}
