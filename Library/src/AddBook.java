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
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class AddBook extends JFrame {

	protected static final String String = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBook frame = new AddBook();
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
	public AddBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAddBook = new JLabel("Add Book");
		lblAddBook.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblBookAuthor = new JLabel("Book Author");
		lblBookAuthor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblBookName = new JLabel("Book Name");
		lblBookName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		
		SpinnerModel spinnerModel = new SpinnerNumberModel(10, 
		         0, 
		         100, 
		         1);
		      JSpinner spinner = new JSpinner(spinnerModel);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnAddBook)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","072304");
						String query = "insert into book values(?,?,?,?)";
						PreparedStatement ps=conn.prepareStatement(query);
						
						 ps.setString(1, textField.getText());
				            ps.setString(2,textField_1.getText());
				            ps.setString(3,textField_2.getText());
				             ps.setString(4, (String) spinner.getValue());
				            ps.executeUpdate();
				            JOptionPane.showMessageDialog(null,"Book Added");
				            textField.setText("");
				            textField_1.setText("");
				            textField_2.setText("");
				           
				            
				}
					catch(Exception e)
					{
						System.out.println(e);
					}
			}}
		});
		btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnHome)
				{
					Home h=new Home(String);
					h.setVisible(true);
					dispose();
				}
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnRemoveBook = new JButton("Remove Book");
		btnRemoveBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnRemoveBook)
				{
					try
					{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","072304");
                     String BId=textField.getText();				
                     
                    int val= (int) spinner.getValue();
                    String query = "select Number from book where BookID='"+BId+"'";

                    PreparedStatement ps = con.prepareStatement(query);

                    
                    ResultSet rs =ps.executeQuery();
                    String number = null;
                    if(rs.next())
                        number = rs.getString(1);
                    int num=Integer.parseInt(number);
                    num=num-val;
                 number=Integer.toString(num);
					String query1="update book set number='"+number+"'where BookID='"+BId+"'";
					
				
			        java.sql.PreparedStatement ps1=con.prepareStatement(query1);
			        
					
					ps1.executeUpdate();
					JOptionPane.showMessageDialog(null,"Book Removed");
					 textField.setText("");
			            textField_1.setText("");
			            textField_2.setText("");
					
					
					con.close();
					ps.close();
					}catch(Exception e)
					{
						e.printStackTrace();
					}
			}}
		});
		btnRemoveBook.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblBookId)
						.addComponent(lblBookAuthor)
						.addComponent(btnAddBook)
						.addComponent(lblNumber)
						.addComponent(lblBookName))
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_2)
							.addComponent(textField_1)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
							.addComponent(spinner))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnRemoveBook)
							.addGap(55)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnHome)
					.addGap(33))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(187)
					.addComponent(lblAddBook, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(206, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addComponent(lblAddBook)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookId))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBookAuthor)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBookName))
					.addGap(47)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumber))
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddBook)
						.addComponent(btnHome)
						.addComponent(btnRemoveBook))
					.addGap(36))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
