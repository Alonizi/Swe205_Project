import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.UIManager;


import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class LoginScreen  extends JFrame{
	 static DataBase db = new DataBase();

	private JTextField UsernameFeild;
	private JPasswordField PasswordFeild;
	public LoginScreen() {
		getContentPane().setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));
		getContentPane().setBackground(UIManager.getColor("OptionPane.questionDialog.titlePane.background"));
		getContentPane().setLayout(null);
		
		JLabel lblZerosixty = new JLabel("Zero2Sixty");
		lblZerosixty.setFont(new Font("Century Schoolbook L", Font.BOLD | Font.ITALIC, 30));
		lblZerosixty.setHorizontalAlignment(SwingConstants.CENTER);
		lblZerosixty.setBounds(132, 38, 691, 133);
		getContentPane().add(lblZerosixty);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUsername.setBounds(155, 315, 139, 52);
		getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblPassword.setBounds(159, 420, 120, 52);
		getContentPane().add(lblPassword);
		
		UsernameFeild = new JTextField();
		UsernameFeild.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_ENTER) {
					boolean logged = false;
					String username = UsernameFeild.getText();
					String password = PasswordFeild.getText();
					for(Account acc : db.accounts)
						if(username.equalsIgnoreCase(acc.username) && password.equals(acc.password) ){
							if(!username.equals("admin")){
							MainPage mp = new MainPage();
							mp.setVisible(true);
							mp.setSize(700,700);
							logged = true;
							}
							else{
								Adminpage ap = new Adminpage();
								ap.setVisible(true);
								logged = true;
							}
						}
					if(!logged)
					JOptionPane.showMessageDialog(new LoginScreen() ,"Wrong Account");
				}
				
			}
		});
		UsernameFeild.setBounds(290, 315, 330, 46);
		getContentPane().add(UsernameFeild);
		UsernameFeild.setColumns(10);
		
		PasswordFeild = new JPasswordField();
		PasswordFeild.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()== KeyEvent.VK_ENTER) {
					boolean logged = false;
					String username = UsernameFeild.getText();
					String password = PasswordFeild.getText();
					for(Account acc : db.accounts)
						if(username.equalsIgnoreCase(acc.username) && password.equals(acc.password) ){
							if(!username.equals("admin")){
							MainPage mp = new MainPage();
							mp.setVisible(true);
							mp.setSize(700,700);
							logged = true;
							}
							else{
								Adminpage ap = new Adminpage();
								ap.setVisible(true);
								logged = true;
							}
						}
					if(!logged)
					JOptionPane.showMessageDialog(new LoginScreen() ,"Wrong Account");
				}
				
			}
		});
		PasswordFeild.setBounds(297, 420, 323, 52);
		getContentPane().add(PasswordFeild);
		PasswordFeild.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				boolean logged = false;
				String username = UsernameFeild.getText();
				String password = PasswordFeild.getText();
				for(Account acc : db.accounts)
					if(username.equalsIgnoreCase(acc.username) && password.equals(acc.password) ){
						if(!username.equals("admin")){
						MainPage mp = new MainPage();
						mp.setVisible(true);
						mp.setSize(700,700);
						logged = true;
						}
						else{
							Adminpage ap = new Adminpage();
							ap.setVisible(true);
							logged = true;
						}
					}
				if(!logged)
				JOptionPane.showMessageDialog(new LoginScreen() ,"Wrong Account");
			}
		});
		
		btnLogin.setBounds(308, 550, 139, 52);
		getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				  class UserAccountAdd extends JDialog {
						private JTextField AddUsernameTextField;
						private JTextField AddPasswordTextField;
						private JTextField AddPaymentMethodTextField;
						private JTextField AddAddressTextfield;
						private JTextField AddTypeTextField;
						public UserAccountAdd() {
							getContentPane().setLayout(null);
							setSize(400, 400);
							setResizable(false);
							JLabel AddUsernameLabel = new JLabel("Username");
							AddUsernameLabel.setBounds(72, 78, 74, 13);
							getContentPane().add(AddUsernameLabel);
							
							JLabel AddPasswordLabel = new JLabel("Password");
							AddPasswordLabel.setBounds(72, 110, 74, 13);
							getContentPane().add(AddPasswordLabel);
							
							JLabel AddPaymentMethodLabel = new JLabel("Payment Method");
							AddPaymentMethodLabel.setBounds(72, 142, 115, 13);
							getContentPane().add(AddPaymentMethodLabel);
							
							JLabel AddAdressLabel = new JLabel("Address");
							AddAdressLabel.setBounds(72, 176, 74, 13);
							getContentPane().add(AddAdressLabel);
							
							JLabel AdminAddLabel = new JLabel("Adding Account");
							AdminAddLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
							AdminAddLabel.setBounds(142, 10, 149, 19);
							getContentPane().add(AdminAddLabel);
							
							AddUsernameTextField = new JTextField();
							AddUsernameTextField.setBounds(197, 75, 154, 19);
							getContentPane().add(AddUsernameTextField);
							AddUsernameTextField.setColumns(10);
							
							AddPasswordTextField = new JTextField();
							AddPasswordTextField.setBounds(197, 107, 154, 19);
							getContentPane().add(AddPasswordTextField);
							AddPasswordTextField.setColumns(10);
							
							AddPaymentMethodTextField = new JTextField();
							AddPaymentMethodTextField.setBounds(197, 139, 154, 19);
							getContentPane().add(AddPaymentMethodTextField);
							AddPaymentMethodTextField.setColumns(10);
							
							AddAddressTextfield = new JTextField();
							AddAddressTextfield.setBounds(197, 173, 154, 19);
							getContentPane().add(AddAddressTextfield);
							AddAddressTextfield.setColumns(10);
							
							JButton AdminAddAccountBtn = new JButton("Add");
							AdminAddAccountBtn.addActionListener(new ActionListener() {
								
								
								public void actionPerformed(ActionEvent arg0) {
									
									String username = AddUsernameTextField.getText();
									String password = AddPasswordTextField.getText();						
									String paymentMethod = AddPaymentMethodTextField.getText();
									String address = AddAddressTextfield.getText();
									String type = AddTypeTextField.getText();
									//AdminAccountAdd acad = 
									boolean isAvailable = false;
									for(int i = 0; i < db.accounts.size(); i++)
										if(db.accounts.get(i).username.equalsIgnoreCase(username)) {
											isAvailable=true;
										}
											
									if (isAvailable) {
										dispose();
										UserAccountAdd x = new UserAccountAdd();
										JOptionPane.showMessageDialog(x, "User already exists!");
											x.dispose();
									}
									else {
									db.accounts.add(new Account(username, password, address, paymentMethod, type));
									db.updateDatabaseFiles();
									dispose();

									}
								
									
								}
								
								
							});

							AdminAddAccountBtn.setFont(new Font("Times New Roman", Font.ITALIC, 14));
							AdminAddAccountBtn.setBounds(233, 267, 85, 21);
							getContentPane().add(AdminAddAccountBtn);
							
							AddTypeTextField = new JTextField();
							AddTypeTextField.setColumns(10);
							AddTypeTextField.setText("User");
							AddTypeTextField.setEditable(false);
							AddTypeTextField.setBounds(197, 205, 154, 19);
							getContentPane().add(AddTypeTextField);
							
							JLabel AddTypeLabel = new JLabel("Type");
							AddTypeLabel.setBounds(72, 208, 74, 13);
							getContentPane().add(AddTypeLabel);
							setVisible(true);
						}
						
			
				  }
					new UserAccountAdd().setVisible(true);
				
			}
		});
		btnSignUp.setBounds(481, 550, 139, 52);
		getContentPane().add(btnSignUp);
		
		JLabel lblForgotYouPassword = new JLabel("forgot you password?");
		lblForgotYouPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			PasswordHelpWindow x =	new PasswordHelpWindow();
			x.setVisible(true);
			}
		});
		lblForgotYouPassword.setForeground(Color.BLUE);
		lblForgotYouPassword.setBounds(467, 392, 190, 25);
		lblForgotYouPassword.setText("forgot you password?");
		getContentPane().add(lblForgotYouPassword);
		setSize(1000,800);
	}
	public static void main(String[] args) {
		db.readDatabaseFiles();
		new LoginScreen().setVisible(true);
		
	}
}
