import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class StudentDetails extends JFrame {

	protected static final String String = null;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDetails frame = new StudentDetails();
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
	public StudentDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentDetails = new JLabel("Student Details");
		lblStudentDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		table = new JTable();
		
		JButton btnClickHereTo = new JButton("Click Here To View Data");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","072304");
					String query="select * from loan";
					
					java.sql.PreparedStatement ps=conn.prepareStatement(query);
					  ResultSet res=ps.executeQuery();
					 	            
					  table.setModel(DbUtils.resultSetToTableModel(res));
		}catch(Exception ex)
		{
			System.out.println(ex);
	
		
			}
			}
		});
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnHome)
				{
					Home h=new Home(String);
					h.setVisible(true);
					dispose();
				}
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblIdno = new JLabel("IDNO");
		lblIdno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(btnClickHereTo)
					.addPreferredGap(ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
					.addComponent(btnHome)
					.addGap(38))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(134, Short.MAX_VALUE)
					.addComponent(lblStudentDetails, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
					.addGap(120))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addComponent(lblIdno, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
					.addComponent(lblLoan, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(81))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblStudentDetails)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLoan)
						.addComponent(lblIdno))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClickHereTo)
						.addComponent(btnHome))
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
