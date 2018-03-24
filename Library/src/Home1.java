import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home1 extends JFrame {

	
	
	private JPanel contentPane;

		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home1 frame = new Home1(toString());
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
	public Home1(String a) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnViewBooks = new JButton("Add Librarian");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnViewBooks)
				{
					AddLibrarian a=new AddLibrarian();
					a.setVisible(true);
					dispose();
				}
			}
		});
		btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnRemoveLibrarian = new JButton("Remove Librarian");
		btnRemoveLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnRemoveLibrarian)
				{
					RemoveLibrarian h=new RemoveLibrarian();
					h.setVisible(true);
					dispose();
				}
			}
		});
		btnRemoveLibrarian.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_1 = new JButton("Librarian Details\r\n\r\n\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1)
				{
					LIbrarianDetails s=new LIbrarianDetails();
					s.setVisible(true);
					dispose();
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l=new Login();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JLabel lblNewLabel = new JLabel(a);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(72, Short.MAX_VALUE)
					.addComponent(lblWelcome, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addGap(57))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(149)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnRemoveLibrarian, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
						.addComponent(btnViewBooks, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
					.addGap(124))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWelcome)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnRemoveLibrarian, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(btnNewButton_1)
					.addGap(37)
					.addComponent(btnNewButton_2)
					.addGap(48))
		);
		contentPane.setLayout(gl_contentPane);
		this.setResizable(false);

	}
}
