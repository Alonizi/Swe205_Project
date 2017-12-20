import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PasswordHelpWindow extends JFrame {
	private JTextField textField;
	public PasswordHelpWindow() {
		getContentPane().setBackground(UIManager.getColor("info"));
		getContentPane().setLayout(null);
		
		JLabel lblForgotYouPassword = new JLabel("Forgot You Password?");
		lblForgotYouPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblForgotYouPassword.setBounds(194, 11, 239, 73);
		getContentPane().add(lblForgotYouPassword);
		
		JLabel lblEnterYourEmail = new JLabel("Enter Your Email");
		lblEnterYourEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterYourEmail.setBounds(90, 170, 155, 42);
		getContentPane().add(lblEnterYourEmail);
		
		textField = new JTextField();
		textField.setBounds(71, 217, 383, 42);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.setBounds(219, 349, 155, 42);
		getContentPane().add(btnSend);
		setSize(646	, 629);
	}
}
