import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

public class PanelStudent extends JPanel {
	/**
	 * Create the panel.
	 */
	public PanelStudent() {
		setBackground(new Color(0, 128, 128));
		setBounds(0, 0, 775, 500);
		setVisible(true);
		setLayout(null);
		
		JPanel panelAddStudent = new JPanel();
		panelAddStudent.setBackground(new Color(173, 216, 230));
		panelAddStudent.addMouseListener(new PanelButtonMouseAdapter(panelAddStudent) {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddStudentFrame addStudent = new AddStudentFrame();
				addStudent.setVisible(true);
				dispose();
			}
		});
		panelAddStudent.setBounds(104, 125, 157, 105);
		add(panelAddStudent);
		panelAddStudent.setLayout(null);
		
		JLabel lblAddStudent = new JLabel("Add Student");
		lblAddStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStudent.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddStudent.setBounds(22, 34, 119, 31);
		panelAddStudent.add(lblAddStudent);
		
		JPanel panelAddMarks = new JPanel();
		panelAddMarks.setBackground(new Color(173, 216, 230));
		panelAddMarks.addMouseListener(new PanelButtonMouseAdapter(panelAddMarks) {
			@Override
			public void mouseClicked(MouseEvent e) {
				AddMarkFrame addMark = new AddMarkFrame();
				addMark.setVisible(true);
				dispose();
			}
		});
		panelAddMarks.setLayout(null);
		panelAddMarks.setBounds(303, 125, 157, 105);
		add(panelAddMarks);
		
		JLabel lbladdMarks = new JLabel("Add Marks");
		lbladdMarks.setHorizontalAlignment(SwingConstants.CENTER);
		lbladdMarks.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbladdMarks.setBounds(22, 34, 119, 31);
		panelAddMarks.add(lbladdMarks);
		
		JPanel panelSearch = new JPanel();
		panelSearch.addMouseListener(new PanelButtonMouseAdapter(panelSearch) {
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchStudentFrame search = new SearchStudentFrame();
				search.setVisible(true);
				dispose();
			}
		});
		panelSearch.setBackground(new Color(173, 216, 230));
		panelSearch.setLayout(null);
		panelSearch.setBounds(509, 125, 157, 105);
		add(panelSearch);
		
		JLabel lblSearch = new JLabel("Search");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSearch.setBounds(22, 34, 119, 31);
		panelSearch.add(lblSearch);
		
		JPanel panelEdit = new JPanel();
		panelEdit.addMouseListener(new PanelButtonMouseAdapter(panelEdit) {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditStudentFrame edit = new EditStudentFrame();
				edit.setVisible(true);
				dispose();
			}
		});
		panelEdit.setBackground(new Color(173, 216, 230));
		panelEdit.setLayout(null);
		panelEdit.setBounds(104, 278, 157, 105);
		add(panelEdit);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdit.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEdit.setBounds(22, 34, 119, 31);
		panelEdit.add(lblEdit);
		
		JPanel panelDelete = new JPanel();
		panelDelete.addMouseListener(new PanelButtonMouseAdapter(panelDelete) {
			@Override
			public void mouseClicked(MouseEvent e) {
				DeleteStudentFrame delete = new DeleteStudentFrame();
				delete.setVisible(true);
				dispose();
			}
		});
		panelDelete.setBackground(new Color(173, 216, 230));
		panelDelete.setLayout(null);
		panelDelete.setBounds(303, 278, 157, 105);
		add(panelDelete);
		
		JLabel lblDelete = new JLabel("Delete");
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDelete.setBounds(22, 34, 119, 31);
		panelDelete.add(lblDelete);
		
		JPanel panelList = new JPanel();
		panelList.addMouseListener(new PanelButtonMouseAdapter(panelList) {
			@Override
			public void mouseClicked(MouseEvent e) {
				StudentListFrame list = new StudentListFrame();
				list.setVisible(true);
				dispose();
			}
		});
		panelList.setBackground(new Color(173, 216, 230));
		panelList.setLayout(null);
		panelList.setBounds(509, 278, 157, 105);
		add(panelList);
		
		JLabel lblList = new JLabel("List");
		lblList.setHorizontalAlignment(SwingConstants.CENTER);
		lblList.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblList.setBounds(22, 34, 119, 31);
		panelList.add(lblList);
		
		JLabel lblStudentPanel = new JLabel("Student Panel");
		lblStudentPanel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblStudentPanel.setBounds(317, 26, 137, 30);
		add(lblStudentPanel);
	}
	
	
	
	
	//for disposing this panel
	public void dispose() {
	    JFrame parent = (JFrame) this.getTopLevelAncestor();
	    parent.dispose();
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
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
			panel.setBackground(new Color(173, 216, 230));
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
