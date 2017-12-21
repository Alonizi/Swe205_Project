import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//this is a JDialog class
public class Adminbills extends JDialog {
	private JTextField adminbilltextarea;
	public Adminbills() {
		setSize(400,400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel billsLabel = new JLabel("Bills");
		billsLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		billsLabel.setBounds(171, 10, 45, 13);
		getContentPane().add(billsLabel);
		
		JButton deleteBills = new JButton("Delete");
		deleteBills.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		deleteBills.setBackground(Color.RED);
		deleteBills.setBounds(289, 122, 85, 21);
		getContentPane().add(deleteBills);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 80, 248, 259);
		getContentPane().add(textArea);
		
		adminbilltextarea = new JTextField();
		adminbilltextarea.setColumns(10);
		adminbilltextarea.setBounds(278, 227, 96, 19);
		getContentPane().add(adminbilltextarea);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Adminbills();
	}

}
