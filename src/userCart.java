import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;

public class userCart extends JDialog {
	private JTextField deleteTextArea;
	public userCart() {
		setSize(400,400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel labelCart = new JLabel("Cart");
		labelCart.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		labelCart.setBounds(158, 10, 45, 13);
		getContentPane().add(labelCart);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 50, 248, 206);
		getContentPane().add(textArea);
		
		JButton deleteItem = new JButton("Delete");
		deleteItem.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		deleteItem.setBackground(Color.RED);
		deleteItem.setBounds(289, 107, 85, 21);
		getContentPane().add(deleteItem);
		
		deleteTextArea = new JTextField();
		deleteTextArea.setColumns(10);
		deleteTextArea.setBounds(278, 178, 96, 19);
		getContentPane().add(deleteTextArea);
		
		JLabel labelTotal = new JLabel("Total price:");
		labelTotal.setBounds(10, 289, 85, 13);
		getContentPane().add(labelTotal);
		
		JLabel totalPrice = new JLabel("xxxxx");
		totalPrice.setBounds(143, 289, 115, 13);
		getContentPane().add(totalPrice);
		
		JLabel discountLabel = new JLabel("Discount:");
		discountLabel.setBounds(10, 312, 85, 13);
		getContentPane().add(discountLabel);
		
		JLabel discountValue = new JLabel("yyyyyy");
		discountValue.setBounds(143, 312, 115, 13);
		getContentPane().add(discountValue);
		
		JLabel finalLabel = new JLabel("Final price:");
		finalLabel.setBounds(10, 338, 85, 13);
		getContentPane().add(finalLabel);
		
		JLabel finalPrice = new JLabel("zzzzzzzz");
		finalPrice.setBounds(143, 335, 115, 13);
		getContentPane().add(finalPrice);
		setVisible(true);
	}
	public static void main(String[] args) {
		new userCart();
	}

}
