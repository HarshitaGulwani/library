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

public class LIbrarianDetails extends JFrame {

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
					LIbrarianDetails frame = new LIbrarianDetails();
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
	public LIbrarianDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibrarianDetails = new JLabel("Librarian Details");
		lblLibrarianDetails.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		table = new JTable();
		
		JButton btnClickHereTo = new JButton("Click Here to View Data");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","072304");
					String query="select * from librarian";
					
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
					Home1 h=new Home1(String);
					h.setVisible(true);
					dispose();
				}
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("LID");
		
		JLabel lblNewLabel_1 = new JLabel("FName");
		
		JLabel lblNewLabel_2 = new JLabel("LName");
		
		JLabel lblNewLabel_3 = new JLabel("Contact");
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(table, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(49)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLibrarianDetails, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addGap(39)
									.addComponent(lblNewLabel_2)
									.addGap(39)
									.addComponent(lblNewLabel_3)))
							.addGap(12)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnClickHereTo)
					.addPreferredGap(ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
					.addComponent(btnHome)
					.addGap(34))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(344, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4)
					.addGap(41))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibrarianDetails)
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnClickHereTo)
						.addComponent(btnHome))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
