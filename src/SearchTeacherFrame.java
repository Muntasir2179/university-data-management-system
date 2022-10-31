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

public class SearchTeacherFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textSalary;
	private JTextField textCourse;
	private JTextField textDate;
	private JTextField textGender;
	private JTextField textDesignation;
	private JTextField textSearchId;
	
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchTeacherFrame frame = new SearchTeacherFrame();
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
	public SearchTeacherFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(211, 13, 459, 570);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Name:");
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(65, 78, 76, 21);
		panel.add(label);
		
		textName = new JTextField();
		textName.setForeground(new Color(0, 0, 0));
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(220, 78, 186, 22);
		panel.add(textName);
		
		JLabel label_1 = new JLabel("ID:");
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(65, 115, 76, 21);
		panel.add(label_1);
		
		textId = new JTextField();
		textId.setForeground(new Color(0, 0, 0));
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(220, 115, 139, 22);
		panel.add(textId);
		
		JLabel label_2 = new JLabel("Age:");
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_2.setBounds(65, 152, 76, 21);
		panel.add(label_2);
		
		textAge = new JTextField();
		textAge.setForeground(new Color(0, 0, 0));
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(220, 152, 57, 22);
		panel.add(textAge);
		
		JLabel label_3 = new JLabel("Date Of Birth:");
		label_3.setForeground(new Color(0, 0, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_3.setBounds(65, 186, 127, 21);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Address:");
		label_4.setForeground(new Color(0, 0, 0));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_4.setBounds(65, 223, 93, 21);
		panel.add(label_4);
		
		textAddress = new JTextField();
		textAddress.setForeground(new Color(0, 0, 0));
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(220, 223, 207, 22);
		panel.add(textAddress);
		
		JLabel label_5 = new JLabel("Phone Number:");
		label_5.setForeground(new Color(0, 0, 0));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_5.setBounds(65, 297, 139, 21);
		panel.add(label_5);
		
		textPhone = new JTextField();
		textPhone.setForeground(new Color(0, 0, 0));
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(220, 297, 186, 22);
		panel.add(textPhone);
		
		JLabel label_6 = new JLabel("Email:");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(65, 331, 139, 21);
		panel.add(label_6);
		
		textEmail = new JTextField();
		textEmail.setForeground(new Color(0, 0, 0));
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(220, 331, 186, 22);
		panel.add(textEmail);
		
		JLabel label_7 = new JLabel("Gender:");
		label_7.setForeground(new Color(0, 0, 0));
		label_7.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_7.setBounds(65, 257, 76, 21);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Designation:");
		label_8.setForeground(new Color(0, 0, 0));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_8.setBounds(64, 366, 127, 21);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Salary:");
		label_9.setForeground(new Color(0, 0, 0));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_9.setBounds(64, 403, 127, 21);
		panel.add(label_9);
		
		textSalary = new JTextField();
		textSalary.setForeground(new Color(0, 0, 0));
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalary.setColumns(10);
		textSalary.setBounds(219, 403, 93, 22);
		panel.add(textSalary);
		
		JLabel label_10 = new JLabel("Course Teaches:");
		label_10.setForeground(new Color(0, 0, 0));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_10.setBounds(64, 437, 143, 21);
		panel.add(label_10);
		
		textCourse = new JTextField();
		textCourse.setForeground(new Color(0, 0, 0));
		textCourse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCourse.setColumns(10);
		textCourse.setBounds(219, 437, 139, 22);
		panel.add(textCourse);
		
		textDate = new JTextField();
		textDate.setForeground(Color.BLACK);
		textDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDate.setColumns(10);
		textDate.setBounds(220, 187, 139, 22);
		panel.add(textDate);
		
		textGender = new JTextField();
		textGender.setForeground(Color.BLACK);
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textGender.setColumns(10);
		textGender.setBounds(220, 258, 57, 22);
		panel.add(textGender);
		
		textDesignation = new JTextField();
		textDesignation.setForeground(Color.BLACK);
		textDesignation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDesignation.setColumns(10);
		textDesignation.setBounds(220, 367, 139, 22);
		panel.add(textDesignation);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textName.setText("");
				textId.setText("");
				textAge.setText("");
				textDate.setText("");
				textAddress.setText("");
				textGender.setText("");
				textPhone.setText("");
				textEmail.setText("");
				textDesignation.setText("");
				textSalary.setText("");
				textCourse.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnClear.setBounds(168, 502, 97, 25);
		panel.add(btnClear);
		
		JLabel lblTeacherInformation = new JLabel("Teacher Information");
		lblTeacherInformation.setForeground(Color.BLACK);
		lblTeacherInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTeacherInformation.setBounds(140, 13, 186, 21);
		panel.add(lblTeacherInformation);
		
		textSearchId = new JTextField();
		textSearchId.setForeground(Color.BLACK);
		textSearchId.setFont(new Font("Tahoma", Font.BOLD, 18));
		textSearchId.setColumns(10);
		textSearchId.setBounds(24, 74, 152, 33);
		contentPane.add(textSearchId);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FileOperationsForTeacher ft = new FileOperationsForTeacher();
				Teacher t = null;
				if(!textSearchId.getText().equals("")) {
					t = ft.search(textSearchId.getText());
				}else {
					JOptionPane.showMessageDialog(null, "Enter ID for searching.");
				}
				
				if(t != null) {
					textName.setText(t.getName());
					textId.setText(t.getId());
					textAge.setText(t.getAge());
					textDate.setText(t.getBirthDate());
					textAddress.setText(t.getAddress());
					textGender.setText(t.getGender());
					textPhone.setText(t.getPhoneNumber());
					textEmail.setText(t.getGmail());
					textDesignation.setText(t.getDesignation());
					textSalary.setText(t.getSalary());
					textCourse.setText(t.getCourseTeaches());
				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSearch.setBounds(48, 180, 97, 25);
		contentPane.add(btnSearch);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnBack.setBounds(48, 266, 97, 25);
		contentPane.add(btnBack);
	}
}
