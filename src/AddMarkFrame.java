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

public class AddMarkFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textId;
	private JTextField textQuiz;
	private JTextField textHomeWork;
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
					AddMarkFrame frame = new AddMarkFrame();
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
	public AddMarkFrame() {
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 622, 612);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblId.setForeground(new Color(255, 255, 255));
		lblId.setBounds(175, 103, 74, 16);
		contentPane.add(lblId);
		
		textId = new JTextField();
		textId.setBounds(301, 99, 114, 22);
		contentPane.add(textId);
		textId.setColumns(10);
		
		JLabel lblFathersName = new JLabel("Quiz:");
		lblFathersName.setForeground(Color.WHITE);
		lblFathersName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFathersName.setBounds(175, 136, 63, 16);
		contentPane.add(lblFathersName);
		
		textQuiz = new JTextField();
		textQuiz.setColumns(10);
		textQuiz.setBounds(301, 132, 74, 22);
		contentPane.add(textQuiz);
		
		JLabel lblMothersName = new JLabel("Homework:");
		lblMothersName.setForeground(Color.WHITE);
		lblMothersName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMothersName.setBounds(175, 169, 114, 16);
		contentPane.add(lblMothersName);
		
		textHomeWork = new JTextField();
		textHomeWork.setColumns(10);
		textHomeWork.setBounds(301, 166, 74, 22);
		contentPane.add(textHomeWork);
		
		JLabel lblMothersName_1 = new JLabel("Assignment:");
		lblMothersName_1.setForeground(Color.WHITE);
		lblMothersName_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMothersName_1.setBounds(175, 200, 114, 22);
		contentPane.add(lblMothersName_1);
		
		textAssignment = new JTextField();
		textAssignment.setColumns(10);
		textAssignment.setBounds(301, 200, 74, 22);
		contentPane.add(textAssignment);
		
		JLabel lblMothersPhoneNumber = new JLabel("Midturm:");
		lblMothersPhoneNumber.setForeground(Color.WHITE);
		lblMothersPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMothersPhoneNumber.setBounds(175, 235, 95, 16);
		contentPane.add(lblMothersPhoneNumber);
		
		textMidturm = new JTextField();
		textMidturm.setColumns(10);
		textMidturm.setBounds(301, 233, 74, 22);
		contentPane.add(textMidturm);
		
		JLabel lblFinal = new JLabel("Final:");
		lblFinal.setForeground(Color.WHITE);
		lblFinal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFinal.setBounds(175, 271, 63, 16);
		contentPane.add(lblFinal);
		
		textFinal = new JTextField();
		textFinal.setColumns(10);
		textFinal.setBounds(301, 269, 74, 22);
		contentPane.add(textFinal);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String id = textId.getText();
					double quiz = Double.parseDouble(textQuiz.getText());
					double assignment = Double.parseDouble(textAssignment.getText());
					double homeWork = Double.parseDouble(textHomeWork.getText());
					double midturm = Double.parseDouble(textMidturm.getText());
					double finalExam = Double.parseDouble(textFinal.getText());
					
					StudentMarks stdMark = new StudentMarks(id,quiz,assignment,homeWork, midturm, finalExam);
					
					FileOperationsForStudent fs = new FileOperationsForStudent();
					fs.addMarks(stdMark);
					
					clean();
				}catch(NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Enter complete data.");
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setForeground(new Color(0, 0, 0));
		btnAdd.setBounds(349, 375, 69, 25);
		contentPane.add(btnAdd);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DashBoard d = new DashBoard();
				d.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBounds(175, 377, 84, 25);
		contentPane.add(btnBack);
		
		JLabel lblEnterValidInformation = new JLabel("Enter valid information for student");
		lblEnterValidInformation.setForeground(Color.WHITE);
		lblEnterValidInformation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEnterValidInformation.setBounds(151, 29, 310, 16);
		contentPane.add(lblEnterValidInformation);
	}
	
	public void clean() {
		textId.setText("");
		textQuiz.setText("");
		textAssignment.setText("");
		textHomeWork.setText("");
		textMidturm.setText("");
		textFinal.setText("");
	}
}
