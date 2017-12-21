import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//this is a JDialog class
public class Adminaccount extends JDialog {
	private JTextField admintextarea;
	public Adminaccount() {
		setSize(400,400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel AccountLabel = new JLabel("Account");
		AccountLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		AccountLabel.setBounds(151, 10, 87, 13);
		getContentPane().add(AccountLabel);
		
		JButton Accountadd = new JButton("Add");
		Accountadd.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		Accountadd.setBackground(Color.GREEN);
		Accountadd.setBounds(289, 81, 85, 21);
		getContentPane().add(Accountadd);
		
		JButton Accountdelete = new JButton("Delete");
		Accountdelete.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		Accountdelete.setBackground(Color.RED);
		Accountdelete.setBounds(289, 122, 85, 21);
		getContentPane().add(Accountdelete);
		
		JButton Accountmodify = new JButton("Modify");
		Accountmodify.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		Accountmodify.setBackground(Color.YELLOW);
		Accountmodify.setBounds(289, 167, 85, 21);
		getContentPane().add(Accountmodify);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 80, 248, 259);
		getContentPane().add(textArea);
		
		admintextarea = new JTextField();
		admintextarea.setColumns(10);
		admintextarea.setBounds(278, 227, 96, 19);
		getContentPane().add(admintextarea);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Adminaccount();
	}

}
