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
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class EditStudentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textCgpa;
	private JTextField textCredit;
	
	private String name;
	private String id;
	private String age;
	private String address;
	private String phoneNumber;
	private String gmail;
	private String cgpa;
	private String credit;
	private String gander;
	private String date;
	private String department;
	
	private String[] comboBoxOptions = {"CSE","EEE","ETE","BBA"};
	
	
	JRadioButton male = new JRadioButton();
	JRadioButton female = new JRadioButton();
	JRadioButton others = new JRadioButton();
	JDateChooser dateOfBirthChooser = new JDateChooser();
	JComboBox departmentBox = new JComboBox();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStudentFrame frame = new EditStudentFrame();
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
	public EditStudentFrame() {
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Enter valid information for student");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(146, 26, 304, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(114, 86, 56, 16);
		contentPane.add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(274, 86, 205, 22);
		contentPane.add(textName);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(114, 123, 56, 16);
		contentPane.add(label_2);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(274, 123, 205, 22);
		contentPane.add(textId);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(114, 158, 56, 22);
		contentPane.add(label_3);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(274, 158, 44, 22);
		contentPane.add(textAge);
		
		JLabel label_4 = new JLabel("Gander:");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(114, 195, 68, 22);
		contentPane.add(label_4);
		
		male = new JRadioButton("Male");
		male.setForeground(Color.WHITE);
		male.setFont(new Font("Tahoma", Font.BOLD, 13));
		male.setBackground(new Color(0, 128, 128));
		male.setBounds(274, 194, 68, 25);
		contentPane.add(male);
		
		female = new JRadioButton("Female");
		female.setForeground(Color.WHITE);
		female.setFont(new Font("Tahoma", Font.BOLD, 13));
		female.setBackground(new Color(0, 128, 128));
		female.setBounds(337, 194, 75, 25);
		contentPane.add(female);
		
		others = new JRadioButton("Others");
		others.setForeground(Color.WHITE);
		others.setFont(new Font("Tahoma", Font.BOLD, 13));
		others.setBackground(new Color(0, 128, 128));
		others.setBounds(412, 194, 76, 25);
		contentPane.add(others);
		
		JLabel label_5 = new JLabel("Address:");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(114, 230, 76, 16);
		contentPane.add(label_5);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(274, 228, 205, 22);
		contentPane.add(textAddress);
		
		JLabel label_6 = new JLabel("Date of Birth:");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(114, 266, 122, 16);
		contentPane.add(label_6);
		
		dateOfBirthChooser = new JDateChooser();
		dateOfBirthChooser.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 15));
		dateOfBirthChooser.setBounds(274, 263, 100, 22);
		contentPane.add(dateOfBirthChooser);
		
		JLabel label_7 = new JLabel("Phone Number:");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(114, 297, 133, 16);
		contentPane.add(label_7);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(274, 295, 205, 22);
		contentPane.add(textPhone);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(114, 328, 114, 16);
		contentPane.add(label_8);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(274, 326, 205, 22);
		contentPane.add(textEmail);
		
		JLabel label_9 = new JLabel("Department:");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_9.setBounds(114, 362, 114, 16);
		contentPane.add(label_9);
		
		departmentBox = new JComboBox(comboBoxOptions);
		departmentBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		departmentBox.setBounds(274, 361, 81, 22);
		departmentBox.setSelectedItem(null);
		contentPane.add(departmentBox);
		
		JLabel label_10 = new JLabel("C.G.P.A:");
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_10.setBounds(114, 393, 114, 16);
		contentPane.add(label_10);
		
		textCgpa = new JTextField();
		textCgpa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCgpa.setColumns(10);
		textCgpa.setBounds(274, 391, 56, 22);
		contentPane.add(textCgpa);
		
		JLabel label_11 = new JLabel("Credit:");
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_11.setBounds(114, 427, 114, 16);
		contentPane.add(label_11);
		
		textCredit = new JTextField();
		textCredit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCredit.setColumns(10);
		textCredit.setBounds(274, 425, 56, 22);
		contentPane.add(textCredit);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		back.setFont(new Font("Tahoma", Font.BOLD, 15));
		back.setBounds(111, 484, 79, 25);
		contentPane.add(back);
		
		JButton edit = new JButton("Edit");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Student std;
				if(male.isSelected())
					gander = "Male";
				if(female.isSelected())
					gander = "Female";
				if(others.isSelected())
					gander = "Others";
				
				try {
					SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
					
					name = textName.getText();
					id = textId.getText();
					age = textAge.getText();
					address = textAddress.getText();
					gmail = textEmail.getText();
					date = df.format(dateOfBirthChooser.getDate());
					phoneNumber = textPhone.getText();
					department = departmentBox.getSelectedItem().toString();
					cgpa = textCgpa.getText();
					credit = textCredit.getText();
					
					std = new Student(name, id, age, address, gmail, date, gander, phoneNumber, department, cgpa, credit);
					
					FileOperationsForStudent fs = new FileOperationsForStudent();
					
					fs.edit(std);
					
					clean();
				}catch(ParseException e) {
					JOptionPane.showMessageDialog(null, "Invalid data encountered.");
				}catch(NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Enter complete data.");
				}
			}
		});
		edit.setFont(new Font("Tahoma", Font.BOLD, 15));
		edit.setBounds(382, 484, 97, 25);
		contentPane.add(edit);
	}
	
	public void clean() {
		textName.setText("");
		textId.setText("");
		textAge.setText("");
		textAddress.setText("");
		textEmail.setText("");
		dateOfBirthChooser.setCalendar(null);
		textPhone.setText("");
		departmentBox.setSelectedItem(null);
		textCgpa.setText("");
		textCredit.setText("");
		male.setSelected(false);
		female.setSelected(false);
		others.setSelected(false);
	}
}
