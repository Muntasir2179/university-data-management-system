import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class AddStudentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTaker;
	private JTextField idTaker;
	private JTextField ageTaker;
	private JTextField addressTaker;
	private JTextField phoneNumberTaker;
	private JTextField emailTaker;
	private JTextField creditTaker;
	private JTextField cgpaTaker;

	private String[] comboBoxOptions = {"CSE","EEE","ETE","BBA"};
	
	
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
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton male = new JRadioButton("Male");
	JRadioButton female = new JRadioButton("Female");
	JRadioButton others = new JRadioButton("Others");
	
	JDateChooser dateOfBirth = new JDateChooser();
	private JDateChooser dateOfBirthTaker;
	JComboBox departmenttaker = new JComboBox(comboBoxOptions);
	private JComboBox departmentTaker;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudentFrame frame = new AddStudentFrame();
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
	public AddStudentFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblName.setBounds(109, 85, 56, 16);
		contentPane.add(lblName);
		
		nameTaker = new JTextField();
		nameTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nameTaker.setBounds(269, 85, 205, 22);
		contentPane.add(nameTaker);
		nameTaker.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblId.setBounds(109, 122, 56, 16);
		contentPane.add(lblId);
		
		idTaker = new JTextField();
		idTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		idTaker.setColumns(10);
		idTaker.setBounds(269, 122, 205, 22);
		contentPane.add(idTaker);
		
		JButton addButton = new JButton("Add");
		addButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		addButton.addActionListener(new ActionListener() {
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
					
					name = nameTaker.getText();
					id = idTaker.getText();
					age = ageTaker.getText();
					address = addressTaker.getText();
					gmail = emailTaker.getText();
					date = df.format(dateOfBirthTaker.getDate());
					phoneNumber = phoneNumberTaker.getText();
					department = departmentTaker.getSelectedItem().toString();
					cgpa = cgpaTaker.getText();
					credit = creditTaker.getText();
					std = new Student(name, id, age, address, gmail, date, gander, phoneNumber, department, cgpa, credit);
				
					
					FileOperationsForStudent fs = new FileOperationsForStudent();
					fs.add(std);
					
					clean();
					
				}catch(ParseException e){
					JOptionPane.showMessageDialog(null, "Ivalid data incountered.");
				}catch(NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Enter complete data.");
				}
			}
		});
		addButton.setBounds(377, 483, 97, 25);
		contentPane.add(addButton);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAge.setBounds(109, 157, 56, 22);
		contentPane.add(lblAge);
		
		ageTaker = new JTextField();
		ageTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ageTaker.setColumns(10);
		ageTaker.setBounds(269, 157, 44, 22);
		contentPane.add(ageTaker);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(109, 229, 76, 16);
		contentPane.add(lblAddress);
		
		addressTaker = new JTextField();
		addressTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		addressTaker.setColumns(10);
		addressTaker.setBounds(269, 227, 205, 22);
		contentPane.add(addressTaker);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth:");
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDateOfBirth.setBounds(109, 265, 122, 16);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblGander = new JLabel("Gander:");
		lblGander.setForeground(Color.WHITE);
		lblGander.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGander.setBounds(109, 194, 68, 22);
		contentPane.add(lblGander);
		
		male = new JRadioButton("Male");
		male.setFont(new Font("Tahoma", Font.BOLD, 13));
		male.setForeground(Color.WHITE);
		buttonGroup.add(male);
		male.setBackground(new Color(0, 128, 128));
		male.setBounds(269, 193, 68, 25);
		contentPane.add(male);
		
		female = new JRadioButton("Female");
		female.setFont(new Font("Tahoma", Font.BOLD, 13));
		female.setForeground(Color.WHITE);
		buttonGroup.add(female);
		female.setBackground(new Color(0, 128, 128));
		female.setBounds(332, 193, 75, 25);
		contentPane.add(female);
		
		others = new JRadioButton("Others");
		others.setFont(new Font("Tahoma", Font.BOLD, 13));
		others.setForeground(Color.WHITE);
		buttonGroup.add(others);
		others.setBackground(new Color(0, 128, 128));
		others.setBounds(407, 193, 76, 25);
		contentPane.add(others);
		
		dateOfBirthTaker = new JDateChooser();
		dateOfBirthTaker.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 15));
		dateOfBirthTaker.setBounds(269, 262, 100, 22);
		contentPane.add(dateOfBirthTaker);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(109, 296, 133, 16);
		contentPane.add(lblPhoneNumber);
		
		phoneNumberTaker = new JTextField();
		phoneNumberTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		phoneNumberTaker.setColumns(10);
		phoneNumberTaker.setBounds(269, 294, 205, 22);
		contentPane.add(phoneNumberTaker);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(109, 327, 114, 16);
		contentPane.add(lblEmail);
		
		emailTaker = new JTextField();
		emailTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		emailTaker.setColumns(10);
		emailTaker.setBounds(269, 325, 205, 22);
		contentPane.add(emailTaker);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setForeground(Color.WHITE);
		lblDepartment.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDepartment.setBounds(109, 361, 114, 16);
		contentPane.add(lblDepartment);
		
		JLabel lblCredit = new JLabel("Credit:");
		lblCredit.setForeground(Color.WHITE);
		lblCredit.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCredit.setBounds(109, 426, 114, 16);
		contentPane.add(lblCredit);
		
		creditTaker = new JTextField();
		creditTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		creditTaker.setColumns(10);
		creditTaker.setBounds(269, 424, 56, 22);
		contentPane.add(creditTaker);
		
		cgpaTaker = new JTextField();
		cgpaTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cgpaTaker.setColumns(10);
		cgpaTaker.setBounds(269, 390, 56, 22);
		contentPane.add(cgpaTaker);
		
		JLabel lblCgpa = new JLabel("C.G.P.A:");
		lblCgpa.setForeground(Color.WHITE);
		lblCgpa.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCgpa.setBounds(109, 392, 114, 16);
		contentPane.add(lblCgpa);
		
		departmentTaker = new JComboBox(comboBoxOptions);
		departmentTaker.setFont(new Font("Tahoma", Font.PLAIN, 15));
		departmentTaker.setSelectedItem(null);
		departmentTaker.setBounds(269, 360, 81, 22);
		contentPane.add(departmentTaker);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(106, 483, 79, 25);
		contentPane.add(btnBack);
		
		JLabel lblEnterValidInformation = new JLabel("Enter valid information for student");
		lblEnterValidInformation.setForeground(Color.WHITE);
		lblEnterValidInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterValidInformation.setBounds(141, 25, 304, 16);
		contentPane.add(lblEnterValidInformation);
	}
	
	
	public void clean() {
		nameTaker.setText("");
		idTaker.setText("");
		ageTaker.setText("");
		addressTaker.setText("");
		emailTaker.setText("");
		dateOfBirthTaker.setCalendar(null);
		phoneNumberTaker.setText("");
		departmentTaker.setSelectedItem(null);
		cgpaTaker.setText("");
		creditTaker.setText("");
		male.setSelected(false);
		female.setSelected(false);
		others.setSelected(false);
	}
}
