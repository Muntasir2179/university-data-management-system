import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frmLogin;
	private JTextField txtusername;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;
	JRadioButton adminSelect;
	JRadioButton teaSelect;
	JRadioButton stuSelect;
	JRadioButton stuffSelect;
	
	private String userName, pass, personal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setResizable(false);
		frmLogin.getContentPane().setBackground(new Color(0, 128, 128));
		frmLogin.setFont(new Font("Dialog", Font.BOLD, 14));
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 661, 470);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					userName = txtusername.getText().trim();
					pass = passwordField.getText();
					
					if(adminSelect.isSelected() == true) {
						personal = "admin";
					}else if(teaSelect.isSelected() == true) {
						personal = "teacher";
					}else if(stuSelect.isSelected() == true) {
						personal = "student";
					}else if(stuffSelect.isSelected() == true) {
						personal = "stuff";
					}else {
						JOptionPane.showMessageDialog(null,"Select user option.");
					}
					
					if(userName.equals("") || pass.equals("") || personal.equals("")) {
						JOptionPane.showMessageDialog(null, "Enter complete data.");
					}else {
							if(personal.equals("admin")) {
								if(checkLogin(userName, pass, personal) == true) {
									JOptionPane.showMessageDialog(null, "Welcome");
									frmLogin.dispose();
									DashBoard bord = new DashBoard();
									bord.setVisible(true);
								}else {
									JOptionPane.showMessageDialog(null, "You are not regestered.");
								}
							}else if(personal.equals("student")) {
								if(checkLogin(userName, pass, personal) == true) {
									FileOperationsForStudent fs = new FileOperationsForStudent();
									UserStudentFrame userStd = new UserStudentFrame();
									
									Student s = fs.search(userName);
									StudentMarks sm = fs.searchMarks(userName);
									if( s == null) {
										JOptionPane.showMessageDialog(null, "Your data is not added yet.");
									}else {
										userStd.setStd(s);
										userStd.setStdMark(sm);
										userStd.setStudentInformation();
										userStd.setVisible(true);
										
										frmLogin.dispose();
									}
								}else {
									JOptionPane.showMessageDialog(null, "You are not regestered.");
								}
							}else if(personal.equals("teacher")) {
								if(checkLogin(userName, pass, personal) == true) {
									FileOperationsForTeacher ft = new FileOperationsForTeacher();
									UserTeacherFrame userTea = new UserTeacherFrame();
									
									Teacher t = ft.search(userName);
									
									if(t == null) {
										JOptionPane.showMessageDialog(null, "Your data is not added yet.");
									}else {
										userTea.setTea(t);
										userTea.setInformation();
										userTea.setVisible(true);
										
										frmLogin.dispose();
									}
								}else {
									JOptionPane.showMessageDialog(null, "You are not regestered.");
								}
							}else if(personal.equals("stuff")) {
								if(checkLogin(userName, pass, personal) == true) {
									FileOperationsForStuff fst = new FileOperationsForStuff();
									UserStuffFrame userStf = new UserStuffFrame();
									
									Stuff stf = fst.search(userName);
									
									if(stf == null) {
										JOptionPane.showMessageDialog(null, "Your data is not added yet.");
									}else {
										userStf.setStu(stf);
										userStf.setInformation();
										userStf.setVisible(true);
										
										frmLogin.dispose();
									}
								}else {
									JOptionPane.showMessageDialog(null, "You are not regestered.");
								}
							}else {
								JOptionPane.showMessageDialog(null, "Enter complete data.");
							}
					}
				}catch(NullPointerException e) {
					//JOptionPane.showMessageDialog(null, "Enter complete data.");
				}
			}
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBounds(204, 322, 97, 33);
		frmLogin.getContentPane().add(btnLogin);
		
		txtusername = new JTextField();
		txtusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtusername.setBounds(204, 34, 272, 25);
		frmLogin.getContentPane().add(txtusername);
		txtusername.setColumns(10);
		
		stuSelect = new JRadioButton("Student");
		stuSelect.setForeground(new Color(255, 255, 255));
		stuSelect.setBackground(new Color(0, 128, 128));
		buttonGroup.add(stuSelect);
		stuSelect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		stuSelect.setBounds(212, 122, 89, 25);
		frmLogin.getContentPane().add(stuSelect);
		
		teaSelect = new JRadioButton("Teacher");
		teaSelect.setForeground(new Color(255, 255, 255));
		teaSelect.setBackground(new Color(0, 128, 128));
		buttonGroup.add(teaSelect);
		teaSelect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		teaSelect.setBounds(212, 152, 103, 25);
		frmLogin.getContentPane().add(teaSelect);
		
		stuffSelect = new JRadioButton("Stuff");
		stuffSelect.setForeground(new Color(255, 255, 255));
		stuffSelect.setBackground(new Color(0, 128, 128));
		buttonGroup.add(stuffSelect);
		stuffSelect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		stuffSelect.setBounds(212, 186, 73, 25);
		frmLogin.getContentPane().add(stuffSelect);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(204, 80, 272, 25);
		frmLogin.getContentPane().add(passwordField);
		
		adminSelect = new JRadioButton("Admin");
		adminSelect.setForeground(new Color(255, 255, 255));
		adminSelect.setBackground(new Color(0, 128, 128));
		buttonGroup.add(adminSelect);
		adminSelect.setFont(new Font("Tahoma", Font.PLAIN, 18));
		adminSelect.setBounds(212, 216, 78, 25);
		frmLogin.getContentPane().add(adminSelect);
		Image img = new ImageIcon(this.getClass().getResource("Image4.jpg")).getImage();
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Muntasir\\eclipse-workspace\\Application Degine\\Images\\lock.png"));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(174, 76, 34, 33);
		frmLogin.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Muntasir\\eclipse-workspace\\Application Degine\\Images\\profile-user.png"));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(174, 31, 34, 33);
		frmLogin.getContentPane().add(label_2);
		
		JButton buttonRegister = new JButton("Register");
		buttonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = false;
				userName = txtusername.getText().trim();
				pass = passwordField.getText();
				
				if(adminSelect.isSelected() == true) {
					personal = "admin";
					File file = new File("LoginData.txt");
					if(file.exists()) {
						try {
							boolean found = false;
							RandomAccessFile raf = new RandomAccessFile(file,"rw");
							
							while(raf.getFilePointer() < raf.length()) {
								String[] data = {raf.readLine(), raf.readLine(), raf.readLine()};
								if(data[2].equals("admin")) {
									found = true;
								}
							}
							
							if(found == true) {
								JOptionPane.showMessageDialog(null, "Cannot register more than one admin.");
							}else {
								raf.writeBytes(userName+"\r\n"+pass+"\r\n"+personal);
								raf.writeBytes(System.lineSeparator());
								JOptionPane.showMessageDialog(null, "Registration successfull.");
							}
							
							raf.close();
						} catch (FileNotFoundException e1) {
							JOptionPane.showMessageDialog(null, "File not found.");
						} catch (IOException e1) {
							JOptionPane.showMessageDialog(null, "Invalid data encountered.");
						}
					}
				}else if(teaSelect.isSelected() == true) {
					
					
					personal = "teacher";
					FileOperationsForTeacher ft = new FileOperationsForTeacher();
					if(ft.search(userName) != null) {
						writeInLogin(userName, pass, personal);
						JOptionPane.showMessageDialog(null, "Registration successfull.");
					}else {
						JOptionPane.showMessageDialog(null, "Your cannot register."+"\n"+"your data is not added yet.");
					}
					
					
				}else if(stuSelect.isSelected() == true) {
					
					personal = "student";
					FileOperationsForStudent fst = new FileOperationsForStudent();
					if(fst.search(userName) != null) {
						writeInLogin(userName, pass, personal);
						JOptionPane.showMessageDialog(null, "Registration successfull.");
					}else {
						JOptionPane.showMessageDialog(null, "Your cannot register."+"\n"+"your data is not added yet.");
					}
					
				}else if(stuffSelect.isSelected() == true) {
					
					personal = "stuff";
					FileOperationsForStuff fs = new FileOperationsForStuff();
					if(fs.search(userName) != null) {
						writeInLogin(userName, pass, personal);
						JOptionPane.showMessageDialog(null, "Registration successfull.");
					}else {
						JOptionPane.showMessageDialog(null, "Your cannot register."+"\n"+"your data is not added yet.");
					}
					
					
				}else {
					JOptionPane.showMessageDialog(null, "Enter complete data.");
				}
			}
		});
		buttonRegister.setForeground(Color.BLACK);
		buttonRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		buttonRegister.setBackground(Color.WHITE);
		buttonRegister.setBounds(327, 322, 134, 33);
		frmLogin.getContentPane().add(buttonRegister);
	}
	
	/*Definied not generated*/
	public void makeLoginVisible(boolean value) {
		frmLogin.setVisible(value);
	}
	
	//check username and password
	public boolean checkLogin(String username, String pass, String personal) {
		boolean found = false;
		try {
			File file = new File("LoginData.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			RandomAccessFile raf = new RandomAccessFile(file,"rw");
			
			while(raf.getFilePointer() < raf.length()) {
				String[] data = {raf.readLine(), raf.readLine(), raf.readLine()};
				if(data[0].equals(username) && data[1].equals(pass) && data[2].equals(personal)) {
					raf.close();
					return true;
				}
			}
			
			raf.close();
			
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,e.getMessage());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Invalid data encountered.");
		}
		
		return false;
	}
	
	//search method for searching in idlist.txt
	@SuppressWarnings("finally")
	public boolean searchInFile(String searchId) {
		boolean found = false;
		try {
			File file = new File("StudentIdList.txt");
			if(!file.exists()) {
				//JOptionPane.showMessageDialog(null, "File not found.");
				return false;
			}else {
				RandomAccessFile raf = new RandomAccessFile(file,"rw");
				String readId;
				while(raf.getFilePointer() < raf.length()) {
					readId = raf.readLine();
					if(searchId.equals(readId)) {
						found = true;
					}
				}
				raf.close();
			}
		} catch (IOException e) {
			//JOptionPane.showMessageDialog(null, "Invalid data encountered.");
		} finally {
			return found;
		}
	}
	
	//writing in LoginData.txt
	public void writeInLogin(String userName, String pass, String personal) {
		boolean found = false;
		File file = new File("LoginData.txt");
		if(file.exists()) {
			try {
				RandomAccessFile raf = new RandomAccessFile(file,"rw");
				while(raf.getFilePointer() < raf.length()) {
					String[] data = {raf.readLine(), raf.readLine(), raf.readLine()};
					if(data[0].equals(userName) == true && data[1].equals(pass) && data[2].equals(personal)) {
						found = true;
					}
				}
				if(found == false) {
					raf.writeBytes(userName+"\r\n"+pass+"\r\n"+personal);
					raf.writeBytes(System.lineSeparator());
				}else {
					JOptionPane.showMessageDialog(null, "You are already registered.");
				}
				
				raf.close();
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "File not found.");
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Invalid data encountered.");
			}
		}
	}
}
