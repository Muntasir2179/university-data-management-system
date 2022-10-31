import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;

public class DashBoard extends JFrame {

	private JPanel contentPane;
	
	private PanelStudent panelStudentMenu;
	private PanelTeacher panelTeacherMenu;
	private PanelStuff panelStuffMenu;
	private PanelChangeAdmin panelAdminMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard();
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
	public DashBoard() {
		setResizable(false);
		setBackground(new Color(95, 158, 160));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1071, 620);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelStudentMenu = new PanelStudent();
		panelStudentMenu.setSize(760, 520);
		panelStudentMenu.setLocation(0, 0);
		panelTeacherMenu = new PanelTeacher();
		panelTeacherMenu.setSize(760, 520);
		panelTeacherMenu.setLocation(0, 0);
		panelStuffMenu = new PanelStuff();
		panelStuffMenu.setSize(760, 520);
		panelStuffMenu.setLocation(0, 0);
		panelAdminMenu = new PanelChangeAdmin();
		panelStudentMenu.setSize(760, 520);
		panelStudentMenu.setLocation(0, 0);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(0, 128, 128));
		menu.setBounds(0, 0, 246, 585);
		contentPane.add(menu);
		menu.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon("E:\\NSU\\NSU curiculam\\Semester 4\\CSE 215 Lab\\Final Project\\University Data Management System\\Application Degine\\Images\\university.png"));
		logo.setBounds(12, 40, 222, 137);
		menu.add(logo);
		
		JPanel panelStudent = new JPanel();
		panelStudent.setForeground(new Color(0, 128, 128));
		panelStudent.addMouseListener(new PanelButtonMouseAdapter(panelStudent) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelStudentMenu);
			}
		});
		panelStudent.setBackground(new Color(0, 128, 128));
		panelStudent.setBounds(0, 190, 246, 50);
		menu.add(panelStudent);
		panelStudent.setLayout(null);
		
		JLabel lblHome = new JLabel("Student");
		lblHome.setForeground(new Color(255, 255, 255));
		lblHome.setHorizontalAlignment(SwingConstants.LEFT);
		lblHome.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHome.setBounds(60, 14, 89, 24);
		panelStudent.add(lblHome);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("E:\\NSU\\NSU curiculam\\Semester 4\\CSE 215 Lab\\Final Project\\University Data Management System\\Application Degine\\Images\\student.png"));
		label.setBounds(28, 10, 33, 32);
		panelStudent.add(label);
		
		JPanel panelTeacher = new JPanel();
		panelTeacher.setForeground(new Color(0, 128, 128));
		panelTeacher.addMouseListener(new PanelButtonMouseAdapter(panelTeacher) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelTeacherMenu);
			}
		});
		panelTeacher.setBackground(new Color(0, 128, 128));
		panelTeacher.setBounds(0, 240, 246, 50);
		menu.add(panelTeacher);
		panelTeacher.setLayout(null);
		
		JLabel lblTeacher = new JLabel("Teacher");
		lblTeacher.setBounds(60, 13, 85, 24);
		panelTeacher.add(lblTeacher);
		lblTeacher.setHorizontalAlignment(SwingConstants.LEFT);
		lblTeacher.setForeground(Color.WHITE);
		lblTeacher.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(27, 0, 35, 40);
		panelTeacher.add(label_1);
		label_1.setIcon(new ImageIcon("E:\\NSU\\NSU curiculam\\Semester 4\\CSE 215 Lab\\Final Project\\University Data Management System\\Application Degine\\Images\\teacher.png"));
		
		JPanel panelStuff = new JPanel();
		panelStuff.setForeground(new Color(0, 128, 128));
		panelStuff.addMouseListener(new PanelButtonMouseAdapter(panelStuff) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelStuffMenu);
			}
		});
		panelStuff.setBackground(new Color(0, 128, 128));
		panelStuff.setBounds(0, 289, 246, 50);
		menu.add(panelStuff);
		panelStuff.setLayout(null);
		
		JLabel lblStuff = new JLabel("Stuff");
		lblStuff.setHorizontalAlignment(SwingConstants.LEFT);
		lblStuff.setForeground(Color.WHITE);
		lblStuff.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStuff.setBounds(60, 13, 85, 24);
		panelStuff.add(lblStuff);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("E:\\NSU\\NSU curiculam\\Semester 4\\CSE 215 Lab\\Final Project\\University Data Management System\\Application Degine\\Images\\stuff.png"));
		label_2.setBounds(28, 5, 33, 32);
		panelStuff.add(label_2);
		
		JPanel panelChangeAdmin = new JPanel();
		panelChangeAdmin.setForeground(new Color(0, 128, 128));
		panelChangeAdmin.addMouseListener(new PanelButtonMouseAdapter(panelChangeAdmin) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAdminMenu);
			}
		});
		panelChangeAdmin.addMouseListener(new PanelButtonMouseAdapter(panelChangeAdmin));
		panelChangeAdmin.setBackground(new Color(0, 128, 128));
		panelChangeAdmin.setBounds(0, 339, 246, 50);
		menu.add(panelChangeAdmin);
		panelChangeAdmin.setLayout(null);
		
		JLabel lblChangeAdmin = new JLabel("Change Admin");
		lblChangeAdmin.setHorizontalAlignment(SwingConstants.LEFT);
		lblChangeAdmin.setForeground(Color.WHITE);
		lblChangeAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblChangeAdmin.setBounds(60, 13, 131, 24);
		panelChangeAdmin.add(lblChangeAdmin);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("E:\\NSU\\NSU curiculam\\Semester 4\\CSE 215 Lab\\Final Project\\University Data Management System\\Application Degine\\Images\\Admin_change.png"));
		label_3.setBounds(30, 8, 33, 32);
		panelChangeAdmin.add(label_3);
		
		JPanel panelLogout = new JPanel();
		panelLogout.setForeground(new Color(0, 128, 128));
		panelLogout.addMouseListener(new PanelButtonMouseAdapter(panelLogout) {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you want to logout?") == 0) {
					Login lg = new Login();
					lg.makeLoginVisible(true);
					DashBoard.this.dispose();
				}
			}
		});
		panelLogout.setBackground(new Color(0, 128, 128));
		panelLogout.setBounds(0, 389, 246, 50);
		menu.add(panelLogout);
		panelLogout.setLayout(null);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setBounds(60, 13, 85, 24);
		panelLogout.add(lblLogout);
		lblLogout.setHorizontalAlignment(SwingConstants.LEFT);
		lblLogout.setForeground(Color.WHITE);
		lblLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("E:\\NSU\\NSU curiculam\\Semester 4\\CSE 215 Lab\\Final Project\\University Data Management System\\Application Degine\\Images\\logout (1).png"));
		label_5.setBounds(31, 5, 33, 32);
		panelLogout.add(label_5);
		
		JPanel panelMainContent = new JPanel();
		panelMainContent.setBackground(new Color(0, 128, 128));
		panelMainContent.setBounds(271, 35, 755, 520);
		contentPane.add(panelMainContent);
		panelMainContent.setVisible(true);
		panelMainContent.setLayout(null);
		
		panelMainContent.add(panelStudentMenu);
		panelMainContent.add(panelTeacherMenu);
		panelMainContent.add(panelStuffMenu);
		panelMainContent.add(panelAdminMenu);
		
		menuClicked(panelMainContent);
	}
	
	public void menuClicked(JPanel panel) {
		panelStudentMenu.setVisible(false);
		panelTeacherMenu.setVisible(false);
		panelStuffMenu.setVisible(false);
		panelAdminMenu.setVisible(false);
		
		panel.setVisible(true);
	}
	
	public class PanelButtonMouseAdapter extends MouseAdapter {
		JPanel panel;
		
		//constructor
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(0,128,128));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60,179,133));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112,128,144));
		}
	}
}
