import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserStudentFrame extends JFrame {

	private Student std = null;
	private StudentMarks stdMark = null;
	
	private JPanel contentPane;
	
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textGender;
	private JTextField textDateOfBirth;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textDepartment;
	private JTextField textCgpa;
	private JTextField textCredit;
	private JTextField textQuiz;
	private JTextField textHomework;
	private JTextField textAssignment;
	private JTextField textMidturm;
	private JTextField textFinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserStudentFrame frame = new UserStudentFrame();
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
	public UserStudentFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 692);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(12, 13, 412, 619);
		contentPane.add(panel);
		
		JLabel lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPersonalInformation.setBounds(95, 13, 194, 16);
		panel.add(lblPersonalInformation);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(45, 52, 56, 16);
		panel.add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(171, 50, 163, 22);
		panel.add(textName);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(45, 79, 56, 16);
		panel.add(label_2);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(171, 77, 114, 22);
		panel.add(textId);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(45, 106, 56, 20);
		panel.add(label_3);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(171, 104, 41, 22);
		panel.add(textAge);
		
		JLabel label_4 = new JLabel("Gender:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(45, 133, 69, 16);
		panel.add(label_4);
		
		textGender = new JTextField();
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textGender.setColumns(10);
		textGender.setBounds(171, 131, 63, 22);
		panel.add(textGender);
		
		JLabel label_5 = new JLabel("Date of Birth:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(45, 164, 114, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Address:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(45, 191, 100, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Phone number:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(45, 218, 126, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(45, 245, 56, 16);
		panel.add(label_8);
		
		textDateOfBirth = new JTextField();
		textDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDateOfBirth.setColumns(10);
		textDateOfBirth.setBounds(171, 162, 163, 22);
		panel.add(textDateOfBirth);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(171, 189, 187, 22);
		panel.add(textAddress);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(171, 216, 116, 22);
		panel.add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(171, 243, 163, 22);
		panel.add(textEmail);
		
		JLabel label_9 = new JLabel("Department:");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(45, 275, 114, 16);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("C.G.P.A:");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(45, 302, 100, 16);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Credit:");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_11.setBounds(45, 329, 100, 16);
		panel.add(label_11);
		
		textDepartment = new JTextField();
		textDepartment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDepartment.setColumns(10);
		textDepartment.setBounds(171, 273, 56, 22);
		panel.add(textDepartment);
		
		textCgpa = new JTextField();
		textCgpa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCgpa.setColumns(10);
		textCgpa.setBounds(171, 300, 56, 22);
		panel.add(textCgpa);
		
		textCredit = new JTextField();
		textCredit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCredit.setColumns(10);
		textCredit.setBounds(171, 327, 56, 22);
		panel.add(textCredit);
		
		JLabel lblMarkTable = new JLabel("Marks Information");
		lblMarkTable.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMarkTable.setBounds(109, 378, 163, 22);
		panel.add(lblMarkTable);
		
		JButton logout = new JButton("Logout");
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login log = new Login();
				log.makeLoginVisible(true);
				dispose();
			}
		});
		logout.setBounds(160, 563, 74, 25);
		panel.add(logout);
		
		JLabel lblQuiz = new JLabel("Quiz:");
		lblQuiz.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuiz.setBounds(45, 413, 114, 16);
		panel.add(lblQuiz);
		
		textQuiz = new JTextField();
		textQuiz.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textQuiz.setColumns(10);
		textQuiz.setBounds(171, 411, 56, 22);
		panel.add(textQuiz);
		
		JLabel lblHomework = new JLabel("Homework:");
		lblHomework.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHomework.setBounds(45, 440, 100, 16);
		panel.add(lblHomework);
		
		textHomework = new JTextField();
		textHomework.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textHomework.setColumns(10);
		textHomework.setBounds(171, 438, 56, 22);
		panel.add(textHomework);
		
		JLabel lblAssignment = new JLabel("Assignment:");
		lblAssignment.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAssignment.setBounds(45, 467, 100, 16);
		panel.add(lblAssignment);
		
		textAssignment = new JTextField();
		textAssignment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAssignment.setColumns(10);
		textAssignment.setBounds(171, 465, 56, 22);
		panel.add(textAssignment);
		
		JLabel lblMidturm = new JLabel("Midturm:");
		lblMidturm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMidturm.setBounds(45, 492, 100, 16);
		panel.add(lblMidturm);
		
		textMidturm = new JTextField();
		textMidturm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMidturm.setColumns(10);
		textMidturm.setBounds(171, 490, 56, 22);
		panel.add(textMidturm);
		
		JLabel lblFinal = new JLabel("Final:");
		lblFinal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFinal.setBounds(45, 519, 100, 16);
		panel.add(lblFinal);
		
		textFinal = new JTextField();
		textFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFinal.setColumns(10);
		textFinal.setBounds(171, 517, 56, 22);
		panel.add(textFinal);
		
		//setStudentInformation();
	}
	
	public void setStd(Student std) {
		this.std = std;
	}

	public void setStdMark(StudentMarks stdMark) {
		this.stdMark = stdMark;
	}

	public void setStudentInformation() {
		if(std != null) {
			textName.setText(std.getName());
			textId.setText(std.getId());
			textAge.setText(std.getAge());
			textGender.setText(std.getGender());
			textDateOfBirth.setText(std.getBirthDate());
			textAddress.setText(std.getAddress());
			textPhone.setText(std.getPhoneNumber());
			textEmail.setText(std.getGmail());
			textDepartment.setText(std.getDepartment());
			textCgpa.setText(std.getCgpa());
			textCredit.setText(std.getCredit());
		}
		if(stdMark != null) {
			textQuiz.setText(Double.toString(stdMark.getQuiz()));
			textHomework.setText(Double.toString(stdMark.getHomeWork()));
			textAssignment.setText(Double.toString(stdMark.getAssignment()));
			textMidturm.setText(Double.toString(stdMark.getMidturm()));
			textFinal.setText(Double.toString(stdMark.getFinalExam()));
		}
	}
}
