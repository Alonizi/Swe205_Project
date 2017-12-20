

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Panel;

public class MainPage extends JFrame {
	private JTextField txtSearchForCar;
	JButton CartButton ;

	public MainPage() {
		getContentPane().setBackground(UIManager.getColor("ToolTip.background"));
		getContentPane().setLayout(null);
		
		JMenu Account = new JMenu("Account");
		Account.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		Account.setBackground(UIManager.getColor("ToolTip.background"));
		Account.setBounds(480, 0, 155, 40);
		getContentPane().add(Account);
		
		JMenuItem Settings = new JMenuItem("Settings");
		Account.add(Settings);
		
		JMenuItem Logout = new JMenuItem("Logout");
		Account.add(Logout);
		
		txtSearchForCar = new JTextField();
		txtSearchForCar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSearchForCar.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearchForCar.setText("search for car");
		txtSearchForCar.setBounds(39, 148, 576, 32);
		getContentPane().add(txtSearchForCar);
		txtSearchForCar.setColumns(10);
		
		JButton Search = new JButton("Search");
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Search.setBounds(267, 198, 89, 41);
		getContentPane().add(Search);
		
		Panel ResultsPAnel = new Panel();
		ResultsPAnel.setBackground(UIManager.getColor("ToggleButton.highlight"));
		ResultsPAnel.setBounds(22, 269, 605, 428);
		getContentPane().add(ResultsPAnel);
		ResultsPAnel.setLayout(null);
		
		JLabel SearResultsLabel = new JLabel("Search Results :");
		SearResultsLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		SearResultsLabel.setBounds(24, 24, 149, 29);
		ResultsPAnel.add(SearResultsLabel);
		
		JLabel LinesLabel = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------");
		LinesLabel.setBounds(10, 64, 595, 14);
		ResultsPAnel.add(LinesLabel);
				Panel panel = new Panel();
		panel.setBounds(0, 0, 476, 40);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton MainButton = new JButton("Main");
		MainButton.setOpaque(true);
		MainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		MainButton.setBackground(UIManager.getColor("info"));
		MainButton.setBounds(10, 2, 125, 38);
		MainButton.setBorderPainted(false);

		panel.add(MainButton);
		
		 CartButton = new JButton("Cart");
		CartButton.setBounds(170, 2, 125, 40);
		CartButton.setOpaque(true);
		CartButton.setBorderPainted(false);
		CartButton.addActionListener(new ButtonListener());

		panel.add(CartButton);
		
		JButton ReveiwsButton = new JButton("Reviews");
		ReveiwsButton.setBounds(316, 0, 135, 40);
		ReveiwsButton.setOpaque(true);
		ReveiwsButton.setBorderPainted(false);
		panel.add(ReveiwsButton);
	}

	public class CartDialog extends JDialog
	{
		public CartDialog()
		{
			setSize(300,300);

		}
	}


	public class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == CartButton) {
				CartDialog cd = new CartDialog();
				cd.setVisible(true);
			}


		}


	}
}
