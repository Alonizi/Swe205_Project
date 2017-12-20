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
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
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
		UsernameFeild.setBounds(290, 315, 330, 46);
		getContentPane().add(UsernameFeild);
		UsernameFeild.setColumns(10);
		
		PasswordFeild = new JPasswordField();
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
		lblForgotYouPassword.setBounds(467, 392, 179, 25);
		getContentPane().add(lblForgotYouPassword);
		setSize(1000,800);
	}
	public static void main(String[] args) {
		db.readDatabaseFiles();
		new LoginScreen().setVisible(true);
		
	}
}
