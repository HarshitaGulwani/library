import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class IssueBook extends JFrame {

	protected static final String String = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
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
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIssueBook = new JLabel("Issue Book");
		lblIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("Book Name");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblId_1 = new JLabel("ID NO");
		lblId_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblBookAuthor = new JLabel("Book Author");
		lblBookAuthor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblIssueDate = new JLabel("Issue Date");
		lblIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		comboBox.addItem("7");
		comboBox.addItem("8");
		comboBox.addItem("9");
		comboBox.addItem("10");
		comboBox.addItem("11");
		comboBox.addItem("12");
		comboBox.addItem("13");
		comboBox.addItem("14");
		comboBox.addItem("15");
		comboBox.addItem("16");
		comboBox.addItem("17");
		comboBox.addItem("18");
		comboBox.addItem("19");
		comboBox.addItem("20");
		comboBox.addItem("21");
		comboBox.addItem("22");
		comboBox.addItem("23");
		comboBox.addItem("24");
		comboBox.addItem("25");
		comboBox.addItem("26");
		comboBox.addItem("27");
		comboBox.addItem("28");
		comboBox.addItem("29");
		comboBox.addItem("30");
		comboBox.addItem("31");
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("1");
		comboBox_1.addItem("2");
		comboBox_1.addItem("3");
		comboBox_1.addItem("4");
		comboBox_1.addItem("5");
		comboBox_1.addItem("6");
		comboBox_1.addItem("7");
		comboBox_1.addItem("8");
		comboBox_1.addItem("9");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		comboBox_1.addItem("12");
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.addItem("2015");
		comboBox_2.addItem("2016");
		comboBox_2.addItem("2017");
		comboBox_2.addItem("2018");
		comboBox_2.addItem("2019");
		JLabel lblExpectedReturn = new JLabel("Expected Return");
		lblExpectedReturn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JComboBox<String> comboBox_3 = new JComboBox<String>();
		comboBox_3.addItem("1");
		comboBox_3.addItem("2");
		comboBox_3.addItem("3");
		comboBox_3.addItem("4");
		comboBox_3.addItem("5");
		comboBox_3.addItem("6");
		comboBox_3.addItem("7");
		comboBox_3.addItem("8");
		comboBox_3.addItem("9");
		comboBox_3.addItem("10");
		comboBox_3.addItem("11");
		comboBox_3.addItem("12");
		comboBox_3.addItem("13");
		comboBox_3.addItem("14");
		comboBox_3.addItem("15");
		comboBox_3.addItem("16");
		comboBox_3.addItem("17");
		comboBox_3.addItem("18");
		comboBox_3.addItem("19");
		comboBox_3.addItem("20");
		comboBox_3.addItem("21");
		comboBox_3.addItem("22");
		comboBox_3.addItem("23");
		comboBox_3.addItem("24");
		comboBox_3.addItem("25");
		comboBox_3.addItem("26");
		comboBox_3.addItem("27");
		comboBox_3.addItem("28");
		comboBox_3.addItem("29");
		comboBox_3.addItem("30");
		comboBox_3.addItem("31");
		
		JComboBox<String> comboBox_4 = new JComboBox<String>();
		comboBox_4.addItem("1");
		comboBox_4.addItem("2");
		comboBox_4.addItem("3");
		comboBox_4.addItem("4");
		comboBox_4.addItem("5");
		comboBox_4.addItem("6");
		comboBox_4.addItem("7");
		comboBox_4.addItem("8");
		comboBox_4.addItem("9");
		comboBox_4.addItem("10");
		comboBox_4.addItem("11");
		comboBox_4.addItem("12");
		JComboBox<String> comboBox_5 = new JComboBox<String>();
		comboBox_5.addItem("2015");
		comboBox_5.addItem("2016");
		comboBox_5.addItem("2017");
		comboBox_5.addItem("2018");
		comboBox_5.addItem("2019");
		JLabel lblLoan = new JLabel("Loan");
		lblLoan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnIssueBook)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","072304");
						String query = "insert into issue values(?,?,?,?,?,?,?)";
						PreparedStatement ps=conn.prepareStatement(query);
						String value=comboBox.getSelectedItem().toString();
						String value_1=comboBox_1.getSelectedItem().toString();
						String value_2=comboBox_2.getSelectedItem().toString();
						String value_3=comboBox_3.getSelectedItem().toString();
						String value_4=comboBox_4.getSelectedItem().toString();
						String value_5=comboBox_5.getSelectedItem().toString();
						value=value+"/"+value_1+"/"+value_2;
						value_3=value_3+"/"+value_4+"/"+value_5;
						 ps.setString(1, textField.getText());
				            ps.setString(2,textField_1.getText());
				            ps.setString(4,textField_2.getText());
				             ps.setString(3,textField_3.getText());
				             ps.setString(5,textField_4.getText());
				             ps.setString(6,value);
				             ps.setString(7, value_3);
				             
				            ps.executeUpdate();
				            String IDNO=textField_2.getText();
				            String query1 = "SELECT loan from loan where IDNO='"+IDNO+"'";
							PreparedStatement ps1=conn.prepareStatement(query1);
							
							
							
					            ResultSet res=ps1.executeQuery();
					            String lo=null;
					            if(res.next())
			                         lo = res.getString(1);
                              textField_5.setText(lo);
				            JOptionPane.showMessageDialog(null,"Book Issued");
				            textField.setText("");
				            textField_1.setText("");
				            textField_2.setText("");
				            textField_3.setText("");
				            textField_4.setText("");
				            textField_5.setText("");
				}
					catch(Exception e)
					{
						System.out.println(e);
					}

				}
				
			}
		});
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(139)
									.addComponent(lblBookId))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblId)
										.addComponent(lblBookAuthor)
										.addComponent(lblIssueDate))
									.addGap(23)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textField_3)
											.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnIssueBook)
											.addComponent(lblLoan)))))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(49)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(lblId_1)
														.addComponent(lblName))
													.addGap(18)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
														.addComponent(textField_4)
														.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(lblExpectedReturn)
													.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
													.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addGap(27))))
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnHome)
									.addGap(126))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(213)
							.addComponent(lblIssueBook)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblIssueBook)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookId))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId)
						.addComponent(lblId_1)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblBookAuthor)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblName)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIssueDate)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblExpectedReturn)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLoan)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnIssueBook)
						.addComponent(btnHome))
					.addGap(19))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
