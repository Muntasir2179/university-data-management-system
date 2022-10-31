import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TeacherListFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel model;
	
	private int tableControler = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherListFrame frame = new TeacherListFrame();
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
	public TeacherListFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1163, 643);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton buttonLoad = new JButton("Load Data");
		buttonLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileOperationsForTeacher ft = new FileOperationsForTeacher();
				
				if(tableControler == 0) {
					try {
						ArrayList<Teacher> list = ft.display();
						if(list.isEmpty()) {
							JOptionPane.showMessageDialog(null, "Data not found.");
						}else {
							for(int i=0; i<list.size(); i++) {
								String[] data = {list.get(i).getName(), list.get(i).getId(), list.get(i).getAge(), 
										list.get(i).getBirthDate(), list.get(i).getGender(), list.get(i).getAddress(), 
										list.get(i).getPhoneNumber(), list.get(i).getGmail(), list.get(i).getDesignation(), 
										list.get(i).getSalary(), list.get(i).getCourseTeaches()};
								
								model.addRow(data);
							}
							tableControler++;
						}
					}catch (NullPointerException e) {
						JOptionPane.showMessageDialog(null, "Invalid data encountered.");
					}
				}
			}
		});
		buttonLoad.setFont(new Font("Tahoma", Font.BOLD, 17));
		buttonLoad.setBounds(12, 63, 121, 25);
		contentPane.add(buttonLoad);
		
		JButton buttonBack = new JButton("Back");
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		buttonBack.setFont(new Font("Tahoma", Font.BOLD, 17));
		buttonBack.setBounds(24, 148, 97, 25);
		contentPane.add(buttonBack);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(153, 13, 992, 582);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		model = new DefaultTableModel();
		String[] columnsName= {"Name","Id","Age","Gender","Date of Birth","Address","Phone","Gmail","Designation","Salary","Course Teaches"};
		model.setColumnIdentifiers(columnsName);
		table.setModel(model);
		scrollPane.setViewportView(table);
	}
}
