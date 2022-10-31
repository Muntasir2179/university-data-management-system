import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchStudentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField id;
	private JTextField age;
	private JTextField gender;
	private JTextField dateOfBirth;
	private JTextField address;
	private JTextField phone;
	private JTextField email;
	private JTextField department;
	private JTextField cgpa;
	private JTextField credit;
	private JTextField searchId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchStudentFrame frame = new SearchStudentFrame();
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
	public SearchStudentFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(237, 13, 367, 551);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentInformation = new JLabel("Student Information");
		lblStudentInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblStudentInformation.setBounds(95, 13, 177, 16);
		panel.add(lblStudentInformation);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(30, 64, 56, 16);
		panel.add(lblName);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name.setBounds(156, 62, 163, 22);
		panel.add(name);
		name.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblId.setBounds(30, 91, 56, 16);
		panel.add(lblId);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		id.setColumns(10);
		id.setBounds(156, 89, 114, 22);
		panel.add(id);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAge.setBounds(30, 118, 56, 16);
		panel.add(lblAge);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 15));
		age.setColumns(10);
		age.setBounds(156, 116, 41, 22);
		panel.add(age);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(30, 145, 69, 16);
		panel.add(lblGender);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gender.setColumns(10);
		gender.setBounds(156, 143, 63, 22);
		panel.add(gender);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDateOfBirth.setBounds(30, 176, 114, 16);
		panel.add(lblDateOfBirth);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(30, 203, 100, 16);
		panel.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhoneNumber.setBounds(30, 230, 126, 16);
		panel.add(lblPhoneNumber);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(30, 257, 56, 16);
		panel.add(lblEmail);
		
		dateOfBirth = new JTextField();
		dateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dateOfBirth.setColumns(10);
		dateOfBirth.setBounds(156, 174, 163, 22);
		panel.add(dateOfBirth);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.PLAIN, 15));
		address.setColumns(10);
		address.setBounds(156, 201, 187, 22);
		panel.add(address);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phone.setColumns(10);
		phone.setBounds(156, 228, 116, 22);
		panel.add(phone);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		email.setColumns(10);
		email.setBounds(156, 255, 163, 22);
		panel.add(email);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDepartment.setBounds(30, 287, 114, 16);
		panel.add(lblDepartment);
		
		JLabel lblCgpa = new JLabel("C.G.P.A:");
		lblCgpa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCgpa.setBounds(30, 314, 100, 16);
		panel.add(lblCgpa);
		
		JLabel lblCredit = new JLabel("Credit:");
		lblCredit.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCredit.setBounds(30, 341, 100, 16);
		panel.add(lblCredit);
		
		department = new JTextField();
		department.setFont(new Font("Tahoma", Font.PLAIN, 15));
		department.setColumns(10);
		department.setBounds(156, 285, 56, 22);
		panel.add(department);
		
		cgpa = new JTextField();
		cgpa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cgpa.setColumns(10);
		cgpa.setBounds(156, 312, 56, 22);
		panel.add(cgpa);
		
		credit = new JTextField();
		credit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		credit.setColumns(10);
		credit.setBounds(156, 339, 56, 22);
		panel.add(credit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(133, 430, 97, 25);
		panel.add(btnClear);
		
		searchId = new JTextField();
		searchId.setFont(new Font("Tahoma", Font.PLAIN, 17));
		searchId.setColumns(10);
		searchId.setBounds(67, 84, 133, 35);
		contentPane.add(searchId);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOperationsForStudent fs = new FileOperationsForStudent();
					
					if(searchId.getText().trim().equals("")) {
						throw new NullPointerException();
					}else {
					
						Student std = fs.search(searchId.getText().trim());

						if(searchId.getText().equals(std.getId())) {
							name.setText(std.getName());
							id.setText(std.getId());
							age.setText(std.getAge());
							gender.setText(std.getGender());
							dateOfBirth.setText(std.getBirthDate());
							address.setText(std.getAddress());
							phone.setText(std.getPhoneNumber());
							email.setText(std.getGmail());
							department.setText(std.getDepartment());
							cgpa.setText(std.getCgpa());
							credit.setText(std.getCredit());
						}else {
							clear();
						}
					}
				}catch(NullPointerException x) {
					JOptionPane.showMessageDialog(null, "Enter correct ID for searching.");
				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSearch.setBounds(67, 176, 97, 25);
		contentPane.add(btnSearch);
		
		JLabel lblId_1 = new JLabel("ID:");
		lblId_1.setForeground(new Color(255, 255, 255));
		lblId_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblId_1.setBounds(20, 94, 35, 16);
		contentPane.add(lblId_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(67, 281, 97, 25);
		contentPane.add(btnBack);
	}
	
	public void clear() {
		name.setText("");
		id.setText("");
		age.setText("");
		gender.setText("");
		dateOfBirth.setText("");
		address.setText("");
		phone.setText("");
		email.setText("");
		department.setText("");
		cgpa.setText("");
		credit.setText("");
	}
}
