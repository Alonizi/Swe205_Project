

import javax.swing.*;
<<<<<<< HEAD
import java.awt.*;
=======

>>>>>>> 2a444096cdbf39dd7c8d5aa2efcc348be27c75af
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {
	private JTextField txtSearchForCar;
	JButton CartButton ;
	JTextArea resultArea ;

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
<<<<<<< HEAD
		
		JPanel ResultsPAnel = new JPanel();

//		ResultsPAnel.setBackground(UIManager.getColor("ToggleButton.highlight"));
		ResultsPAnel.setBounds(22, 269, 605, 428);
		//getContentPane().add(ResultsPAnel);
		//ResultsPAnel.setLayout(null);
//		JTextArea resultsArea = new JTextArea(250,500);
//		resultsArea.setText("HELLLO WORLDD ");
//		ResultsPAnel.add(resultsArea);

		JTextArea resulsTxtArea=new JTextArea(50,50);
		JScrollPane scroll = new JScrollPane(resulsTxtArea);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		resulsTxtArea.setVisible(true);
		ResultsPAnel.add(resulsTxtArea);
		ResultsPAnel.add(scroll);
//		resulsTxtArea.setVisible(true);

		getContentPane().add(ResultsPAnel);

		//JLabel SearResultsLabel = new JLabel("Search Results :");
		//SearResultsLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		//SearResultsLabel.setBounds(24, 24, 149, 29);
		//ResultsPAnel.add(SearResultsLabel);
		
		//JLabel LinesLabel = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------");
		//LinesLabel.setBounds(10, 64, 595, 14);
		//ResultsPAnel.add(LinesLabel);
=======
		resultArea = new JTextArea();
		Panel ResultsPAnel = new Panel();
		ResultsPAnel.setBackground(UIManager.getColor("ToggleButton.highlight"));
		ResultsPAnel.setBounds(22, 269, 605, 415);
		getContentPane().add(ResultsPAnel);
		ResultsPAnel.setLayout(null);


		
		
		
		JLabel SearResultsLabel = new JLabel("");
		SearResultsLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		SearResultsLabel.setBounds(24, 24, 149, 29);
		ResultsPAnel.add(SearResultsLabel);
		
		JLabel LinesLabel = new JLabel("");
		LinesLabel.setBounds(10, 64, 595, 14);
		ResultsPAnel.add(LinesLabel);
		
>>>>>>> 2a444096cdbf39dd7c8d5aa2efcc348be27c75af
				Panel panel = new Panel();
				  panel.setBounds(0, 0, 476, 40); 
				    getContentPane().add(panel); 

		panel.setLayout(null);
		resultArea.setEditable(false);
		//resultArea.setLineWrap(true);
		
		//resultArea.setText("adasdaslllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllldasdl\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\\n\n\n\n\n\n\n\n\n\n\nasjdaosifjesdifffffffffffffffffffffffffffffffoeiwfjsodijfsdoifjdsofijdsofijsdofijsofisdjfodsijfdsoifjdsfos");
		JScrollPane scroll = new JScrollPane(resultArea);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(0, 0, 599, 415);
		ResultsPAnel.add(scroll);
		
		
		
		
		
		getContentPane().add(panel);
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
		CartButton.addActionListener(new MainMenuListener());

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


	public class MainMenuListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == CartButton) {
				CartDialog cd = new CartDialog();
				cd.setVisible(true);
				
			}


		}


	}
}
