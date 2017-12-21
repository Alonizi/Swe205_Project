import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
//this is a JDialog class
public class Admincar extends JDialog {
	private JTextField AdminTextArea;
	public Admincar() {
		setSize(400,400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel CarsTab = new JLabel("Cars");
		CarsTab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		CarsTab.setBounds(171, 10, 45, 13);
		getContentPane().add(CarsTab);
		
		JButton CarsAdd = new JButton("Add");
		CarsAdd.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		CarsAdd.setBackground(Color.GREEN);
		CarsAdd.setBounds(289, 81, 85, 21);
		getContentPane().add(CarsAdd);
		
		JButton CarsDelete = new JButton("Delete");
		CarsDelete.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		CarsDelete.setBackground(Color.RED);
		CarsDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		CarsDelete.setBounds(289, 122, 85, 21);
		getContentPane().add(CarsDelete);
		
		JButton CarsModify = new JButton("Modify");
		CarsModify.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		CarsModify.setBackground(Color.YELLOW);
		CarsModify.setBounds(289, 167, 85, 21);
		getContentPane().add(CarsModify);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 80, 248, 259);
		getContentPane().add(textArea);
		
		AdminTextArea = new JTextField();
		AdminTextArea.setBounds(278, 227, 96, 19);
		getContentPane().add(AdminTextArea);
		AdminTextArea.setColumns(10);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Admincar();
	}
}
