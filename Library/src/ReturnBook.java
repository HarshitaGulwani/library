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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class ReturnBook extends JFrame {

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
					ReturnBook frame = new ReturnBook();
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
	public ReturnBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblIdNo = new JLabel("ID NO");
		
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
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
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
		
		JLabel lblReturnDate = new JLabel("Return Date");
		lblReturnDate.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.addItem("1");
		comboBox_6.addItem("2");
		comboBox_6.addItem("3");
		comboBox_6.addItem("4");
		comboBox_6.addItem("5");
		comboBox_6.addItem("6");
		comboBox_6.addItem("7");
		comboBox_6.addItem("8");
		comboBox_6.addItem("9");
		comboBox_6.addItem("10");
		comboBox_6.addItem("11");
		comboBox_6.addItem("12");
		comboBox_6.addItem("13");
		comboBox_6.addItem("14");
		comboBox_6.addItem("15");
		comboBox_6.addItem("16");
		comboBox_6.addItem("17");
		comboBox_6.addItem("18");
		comboBox_6.addItem("19");
		comboBox_6.addItem("20");
		comboBox_6.addItem("21");
		comboBox_6.addItem("22");
		comboBox_6.addItem("23");
		comboBox_6.addItem("24");
		comboBox_6.addItem("25");
		comboBox_6.addItem("26");
		comboBox_6.addItem("27");
		comboBox_6.addItem("28");
		comboBox_6.addItem("29");
		comboBox_6.addItem("30");
		comboBox_6.addItem("31");
		
		JComboBox<String> comboBox_7 = new JComboBox<String>();
		comboBox_7.addItem("1");
		comboBox_7.addItem("2");
		comboBox_7.addItem("3");
		comboBox_7.addItem("4");
		comboBox_7.addItem("5");
		comboBox_7.addItem("6");
		comboBox_7.addItem("7");
		comboBox_7.addItem("8");
		comboBox_7.addItem("9");
		comboBox_7.addItem("10");
		comboBox_7.addItem("11");
		comboBox_7.addItem("12");
		
		JComboBox<String> comboBox_8 = new JComboBox<String>();
		comboBox_8.addItem("2015");
		comboBox_8.addItem("2016");
		comboBox_8.addItem("2017");
		comboBox_8.addItem("2018");
		comboBox_8.addItem("2019");
		
		JLabel lblFine = new JLabel("Fine");
		lblFine.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReturnBook)
				{
					try
					{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","072304");
	                 String BID=textField.getText();				
								
					String query="delete from issue where BookId='"+BID+"'";
					
				
			        java.sql.PreparedStatement ps=con.prepareStatement(query);
			        
			        String value_1=comboBox_3.getSelectedItem().toString();
					String value_2=comboBox_6.getSelectedItem().toString();
					 String value_3=comboBox_4.getSelectedItem().toString();
						String value_4=comboBox_7.getSelectedItem().toString();
						if(value_3.equals(value_4))
						{
					int b=Integer.parseInt(value_1);
					int c=Integer.parseInt(value_2);
					int d=c-b;
					int eg=0;
					if(d>0)
					{
						eg=d*25;
					}
					ps.executeUpdate();
					 String IDNO=textField_2.getText();
			            String query1 = "SELECT loan from loan where IDNO='"+IDNO+"'";
						PreparedStatement ps1=con.prepareStatement(query1);
						
						
						
				            ResultSet res=ps1.executeQuery();
				            String lo=null;
				            if(res.next())
		                         lo = res.getString(1);
				            int f=Integer.parseInt(lo);
				            f=f+eg;
				            
				            String h=Integer.toString(f);
				            textField_5.setText(h);
				            String query2="update loan set loan='"+h+"' where IDNO='"+IDNO+"'";
							
							
					        java.sql.PreparedStatement ps2=con.prepareStatement(query2);
					        
							
							ps2.executeUpdate();
					JOptionPane.showMessageDialog(null,"Book Returned");
					 textField.setText("");
			            textField_1.setText("");
			            textField_2.setText("");
			            textField_3.setText("");
			            textField_4.setText("");
			            textField_5.setText("");
					con.close();
					ps.close();
						}else
						{
							JOptionPane.showMessageDialog(null,"Loan exceeded limit");
						}
					}catch(Exception ex)
					{
						ex.printStackTrace();
					}
					
				}
			}
		});
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblReturnBook = new JLabel("Return Book");
		lblReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
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
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBookAuthor)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblIssueDate)
									.addGap(18)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblBookName)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblBookId, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblReturnDate)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(112)
									.addComponent(lblFine))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(102)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblDueDate)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
													.addComponent(lblName)
													.addComponent(lblIdNo)))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(18)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
														.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
														.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(28)
													.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(234)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblReturnBook)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(68)
							.addComponent(btnReturnBook)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblReturnBook)
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookId))
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookName)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblIdNo)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblBookAuthor)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblName)))
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIssueDate)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDueDate)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(51)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReturnDate)
						.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFine)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnReturnBook)
						.addComponent(btnHome))
					.addGap(23))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}

}
