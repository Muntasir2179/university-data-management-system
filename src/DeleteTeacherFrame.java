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
import java.io.IOException;
import java.text.ParseException;
import java.awt.event.ActionEvent;

public class DeleteTeacherFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textId;
	private JTextField textAge;
	private JTextField textGender;
	private JTextField textDate;
	private JTextField textAddress;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textDesignation;
	private JTextField textSalary;
	private JTextField textCourse;
	private JTextField textDeleteId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteTeacherFrame frame = new DeleteTeacherFrame();
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
	public DeleteTeacherFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(222, 13, 382, 551);
		contentPane.add(panel);
		
		JLabel lblTeacherInformation = new JLabel("Teacher Information");
		lblTeacherInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTeacherInformation.setBounds(101, 13, 177, 16);
		panel.add(lblTeacherInformation);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(30, 66, 56, 16);
		panel.add(label_1);
		
		textName = new JTextField();
		textName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textName.setColumns(10);
		textName.setBounds(168, 64, 177, 22);
		panel.add(textName);
		
		JLabel label_2 = new JLabel("ID:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(30, 93, 56, 16);
		panel.add(label_2);
		
		textId = new JTextField();
		textId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textId.setColumns(10);
		textId.setBounds(168, 91, 114, 22);
		panel.add(textId);
		
		JLabel label_3 = new JLabel("Age:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(30, 120, 56, 16);
		panel.add(label_3);
		
		textAge = new JTextField();
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAge.setColumns(10);
		textAge.setBounds(168, 118, 41, 22);
		panel.add(textAge);
		
		JLabel label_4 = new JLabel("Gender:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(30, 148, 69, 16);
		panel.add(label_4);
		
		textGender = new JTextField();
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textGender.setColumns(10);
		textGender.setBounds(168, 145, 63, 22);
		panel.add(textGender);
		
		JLabel label_5 = new JLabel("Date of Birth:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(30, 179, 114, 16);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Address:");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(30, 206, 100, 16);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Phone number:");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(30, 233, 126, 16);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(30, 260, 56, 16);
		panel.add(label_8);
		
		textDate = new JTextField();
		textDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDate.setColumns(10);
		textDate.setBounds(168, 176, 100, 22);
		panel.add(textDate);
		
		textAddress = new JTextField();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAddress.setColumns(10);
		textAddress.setBounds(168, 203, 187, 22);
		panel.add(textAddress);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPhone.setColumns(10);
		textPhone.setBounds(168, 230, 116, 22);
		panel.add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEmail.setColumns(10);
		textEmail.setBounds(168, 257, 163, 22);
		panel.add(textEmail);
		
		JLabel lblDesignation = new JLabel("Designation:");
		lblDesignation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDesignation.setBounds(30, 290, 114, 16);
		panel.add(lblDesignation);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSalary.setBounds(30, 317, 100, 16);
		panel.add(lblSalary);
		
		JLabel lblCourseTeaches = new JLabel("Course Teaches:");
		lblCourseTeaches.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCourseTeaches.setBounds(30, 344, 126, 16);
		panel.add(lblCourseTeaches);
		
		textDesignation = new JTextField();
		textDesignation.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDesignation.setColumns(10);
		textDesignation.setBounds(168, 287, 136, 22);
		panel.add(textDesignation);
		
		textSalary = new JTextField();
		textSalary.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSalary.setColumns(10);
		textSalary.setBounds(168, 314, 100, 22);
		panel.add(textSalary);
		
		textCourse = new JTextField();
		textCourse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCourse.setColumns(10);
		textCourse.setBounds(168, 341, 136, 22);
		panel.add(textCourse);
		
		JButton buttonClear = new JButton("Clear");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clear();
			}
		});
		buttonClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonClear.setBounds(133, 430, 97, 25);
		panel.add(buttonClear);
		
		textDeleteId = new JTextField();
		textDeleteId.setFont(new Font("Tahoma", Font.BOLD, 17));
		textDeleteId.setColumns(10);
		textDeleteId.setBounds(40, 84, 133, 35);
		contentPane.add(textDeleteId);
		
		JButton buttonShow = new JButton("Show Data");
		buttonShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOperationsForTeacher ft = new FileOperationsForTeacher();
					
					if(textDeleteId.getText().trim().equals("")) {
						throw new NullPointerException();
					}
					
					Teacher t = ft.search(textDeleteId.getText().trim());
					
					if(t.getId().equals(textDeleteId.getText().trim())) {
						textName.setText(t.getName());
						textId.setText(t.getId());
						textAge.setText(t.getAge());
						textGender.setText(t.getGender());
						textDate.setText(t.getBirthDate());
						textAddress.setText(t.getAddress());
						textPhone.setText(t.getPhoneNumber());
						textEmail.setText(t.getGmail());
						textDesignation.setText(t.getDesignation());
						textSalary.setText(t.getSalary());
						textCourse.setText(t.getCourseTeaches());
					}
					
				}catch(Exception x) {
					JOptionPane.showMessageDialog(null, "Enter ID.");
				}
			}
		});
		buttonShow.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonShow.setBounds(40, 161, 133, 25);
		contentPane.add(buttonShow);
		
		JButton buttonDelete = new JButton("Delete");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileOperationsForTeacher ft = new FileOperationsForTeacher();
					
					if(textDeleteId.getText().trim().equals("")) {
						throw new NullPointerException();
					}
					
					Teacher t = (Teacher)ft.delete(textDeleteId.getText().trim());
					
					if(t != null) {
						clear();
					}
				}catch(NullPointerException x) {
					JOptionPane.showMessageDialog(null, "Enter ID for deleting.");
				}
			}
		});
		buttonDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonDelete.setBounds(40, 250, 97, 25);
		contentPane.add(buttonDelete);
		
		JButton buttonBack = new JButton("Back");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		buttonBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonBack.setBounds(40, 333, 97, 25);
		contentPane.add(buttonBack);
	}
	
	public void clear() {
		textName.setText("");
		textId.setText("");
		textAge.setText("");
		textGender.setText("");
		textDate.setText("");
		textAddress.setText("");
		textPhone.setText("");
		textEmail.setText("");
		textDesignation.setText("");
		textSalary.setText("");
		textCourse.setText("");
	}
}
