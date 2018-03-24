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
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws SQLException,ClassNotFoundException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		passwordField = new JPasswordField();
		JComboBox<String> comboBox=new JComboBox<String>();
		comboBox.addItem("Admin");
		
		comboBox.addItem("Librarian");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnLogin)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","072304");
				String query = "SELECT * from login where Email =? and Password =? and Post=?";
				PreparedStatement ps=conn.prepareStatement(query);
				String pwd=new String(passwordField.getPassword());
				String value=comboBox.getSelectedItem().toString();
				
				 ps.setString(1, textField.getText());
		            ps.setString(2,pwd);
		            ps.setString(3,value);
		            ResultSet res=ps.executeQuery();
		            if(res.next())
		            {
		            	if(value.equals("Admin"))
		            	{
		            		String val=textField.getText();
		                    Home1 page=new Home1(val);
		                    page.setVisible(true);
		            				            		
		            		dispose();
		            	}else if(value.equals("Librarian"))
		            	{
		            		String val=textField.getText();
		                    Home page=new Home(val);
		                    page.setVisible(true);
		            				            		
		            		dispose();
		            	}
		            	else 		            	{
		            		
		            				            	}
		            }
		            else
	            	{
	            		JOptionPane.showMessageDialog(null, "Invalid username or password");
	            	}
				

				
				
			
			
			conn.close();
			ps.close();
			}
			
			catch(Exception ex)
			{
				System.out.println(ex);
		
			
		}
						
			}
			}});
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JButton btnForgotPassword = new JButton("Forgot Password");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(arg0.getSource()==btnForgotPassword)
				{
					ForgotPassword h=new ForgotPassword();
					h.setVisible(true);
					dispose();
				}
			}
		});
		btnForgotPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Post\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("Library System");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
								.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(47)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
							.addGap(66)
							.addComponent(btnForgotPassword)))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnForgotPassword, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);
	}
}
