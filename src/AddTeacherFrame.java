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
import com.toedter.calendar.JDateChooser;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class AddTeacherFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textSalary;
	private JTextField textCourse;
	
	JComboBox comboBox;
	JDateChooser dateChooser;
	JRadioButton male;
	JRadioButton female;
	JRadioButton others;
	
	private String name;
	private String id;
	private String age;
	private String address;
	private String phoneNumber;
	private String gmail;
	private String designation;
	private String salary;
	private String gender;
	private String date;
	private String courseTeaches;
	
	String[] options = {"Senior Lecturer", "Jonior Lecturer", "Professor", "Associate Professor"};
	private JTextField textEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTeacherFrame frame = new AddTeacherFrame();
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
	public AddTeacherFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterValidInformation = new JLabel("Enter valid information for Teacher");
		lblEnterValidInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterValidInformation.setBounds(158, 28, 314, 21);
		contentPane.add(lblEnterValidInformation);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(120, 71, 76, 21);
		contentPane.add(lblName);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setBounds(275, 71, 186, 22);
		contentPane.add(textName);
		textName.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblId.setBounds(120, 108, 76, 21);
		contentPane.add(lblId);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(275, 108, 139, 22);
		contentPane.add(textId);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAge.setBounds(120, 145, 76, 21);
		contentPane.add(lblAge);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(275, 145, 57, 22);
		contentPane.add(textAge);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDateOfBirth.setBounds(120, 179, 127, 21);
		contentPane.add(lblDateOfBirth);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(274, 181, 100, 22);
		contentPane.add(dateChooser);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(120, 216, 93, 21);
		contentPane.add(lblAddress);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(275, 216, 207, 22);
		contentPane.add(textAddress);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGender.setBounds(120, 250, 76, 21);
		contentPane.add(lblGender);
		
		male = new JRadioButton("Male");
		male.setFont(new Font("Tahoma", Font.BOLD, 13));
		male.setForeground(new Color(255, 255, 255));
		male.setBackground(new Color(0, 128, 128));
		male.setBounds(272, 253, 60, 25);
		contentPane.add(male);
		
		female = new JRadioButton("Female");
		female.setForeground(Color.WHITE);
		female.setFont(new Font("Tahoma", Font.BOLD, 13));
		female.setBackground(new Color(0, 128, 128));
		female.setBounds(336, 253, 76, 25);
		contentPane.add(female);
		
		others = new JRadioButton("Others");
		others.setForeground(Color.WHITE);
		others.setFont(new Font("Tahoma", Font.BOLD, 13));
		others.setBackground(new Color(0, 128, 128));
		others.setBounds(412, 253, 76, 25);
		contentPane.add(others);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(120, 290, 139, 21);
		contentPane.add(lblPhoneNumber);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(275, 290, 186, 22);
		contentPane.add(textPhone);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setForeground(Color.WHITE);
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDesignation.setBounds(119, 359, 127, 21);
		contentPane.add(lblDesignation);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setForeground(Color.WHITE);
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSalary.setBounds(119, 396, 127, 21);
		contentPane.add(lblSalary);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalary.setColumns(10);
		textSalary.setBounds(274, 396, 93, 22);
		contentPane.add(textSalary);
		
		JLabel lblCourseTeaches = new JLabel("Course Teaches:");
		lblCourseTeaches.setForeground(Color.WHITE);
		lblCourseTeaches.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCourseTeaches.setBounds(119, 430, 143, 21);
		contentPane.add(lblCourseTeaches);
		
		textCourse = new JTextField();
		textCourse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCourse.setColumns(10);
		textCourse.setBounds(274, 430, 139, 22);
		contentPane.add(textCourse);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(119, 489, 97, 25);
		contentPane.add(btnBack);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				try {
					if(male.isSelected())
						gender = "Male";
					if(female.isSelected())
						gender = "Female";
					if(others.isSelected())
						gender = "Others";
					
					name = textName.getText();
					id = textId.getText();
					age = textAge.getText();
					date = sdf.format(dateChooser.getDate());
					address = textAddress.getText();
					phoneNumber = textPhone.getText();
					gmail = textEmail.getText();
					designation = comboBox.getSelectedItem().toString();
					salary = textSalary.getText();
					courseTeaches = textCourse.getText();
					
					Teacher t = new Teacher(name, id, age, address, gender, phoneNumber, gmail, date, designation, salary, courseTeaches);
					FileOperationsForTeacher ft = new FileOperationsForTeacher();
					ft.add(t);
					JOptionPane.showMessageDialog(null, "Teacher data added.");
				} catch (ParseException e) {
					JOptionPane.showMessageDialog(null, "Invalid data encountered.");
				} catch (NullPointerException x){
					JOptionPane.showMessageDialog(null, "Enter complete data.");
				}
				clear();
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(372, 489, 97, 25);
		contentPane.add(btnAdd);
		
		comboBox = new JComboBox(options);
		comboBox.setSelectedItem(null);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(274, 360, 167, 22);
		contentPane.add(comboBox);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(120, 324, 139, 21);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(275, 324, 186, 22);
		contentPane.add(textEmail);
	}
	
	public void clear() {
		textName.setText("");
		textId.setText("");
		textAge.setText("");
		dateChooser.setCalendar(null);
		textAddress.setText("");
		textPhone.setText("");
		textEmail.setText("");
		comboBox.setSelectedItem(null);
		textSalary.setText("");
		textCourse.setText("");
		male.setSelected(false);
		female.setSelected(false);
		others.setSelected(false);
	}
}
