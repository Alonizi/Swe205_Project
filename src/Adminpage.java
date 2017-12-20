import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Adminpage extends JFrame{
	
	public Adminpage() {
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(null);
		setSize(700,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton adminCars = new JButton("Cars");
		adminCars.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Admincar ac = new Admincar();
				ac.setVisible(true);
				
			}
		});
		adminCars.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		adminCars.setBackground(Color.CYAN);
		adminCars.setBounds(152, 104, 134, 100);
		getContentPane().add(adminCars);
		
		JButton adminReviews = new JButton("Reviews");
		adminReviews.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		adminReviews.setForeground(Color.BLACK);
		adminReviews.setBackground(Color.CYAN);
		adminReviews.setBounds(368, 104, 134, 100);
		getContentPane().add(adminReviews);
		
		JButton adminAccount = new JButton("Accounts");
			adminAccount.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					Adminaccount acc = new Adminaccount();
					acc.setVisible(true);
					
					
				}
			});
		adminAccount.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		adminAccount.setBackground(Color.CYAN);
		adminAccount.setBounds(152, 280, 134, 101);
		getContentPane().add(adminAccount);
		
		JButton adminBills = new JButton("Bills");
			adminBills.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					Adminbills ab = new Adminbills();
					ab.setVisible(true);
					
				}
			});
		adminBills.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		adminBills.setForeground(Color.BLACK);
		adminBills.setBackground(Color.CYAN);
		adminBills.setBounds(368, 280, 134, 101);
		getContentPane().add(adminBills);
		
		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		nameLabel.setBounds(10, 558, 54, 13);
		getContentPane().add(nameLabel);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addressLabel.setBounds(10, 597, 74, 13);
		getContentPane().add(addressLabel);
		
		JLabel DASHUU = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		DASHUU.setBounds(10, 496, 664, 13);
		getContentPane().add(DASHUU);
		
		JLabel adminInfo = new JLabel("Admin Info");
		adminInfo.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		adminInfo.setBounds(307, 519, 92, 13);
		getContentPane().add(adminInfo);
		
		JLabel adminName = new JLabel("admin");
		adminName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adminName.setBounds(74, 558, 55, 13);
		getContentPane().add(adminName);
		
		JLabel adminAddress = new JLabel("KFUPM_University");
		adminAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adminAddress.setBounds(84, 597, 45, 13);
		getContentPane().add(adminAddress);
		
		JButton adminLogout = new JButton("Logout");
		adminLogout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
			}
		});
		adminLogout.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adminLogout.setBounds(592, 0, 92, 40);
		getContentPane().add(adminLogout);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Adminpage();
	}
}
