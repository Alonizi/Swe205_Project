

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Panel;
import java.util.InputMismatchException;

public class MainPage extends JFrame {
	private JTextField txtSearchForCar;
	JButton CartButton ;
	JTextArea resultArea ;
	DataBase db = new DataBase();

	public MainPage() {
		db.readDatabaseFiles();
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
		txtSearchForCar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
txtSearchForCar.setText("");
			}
		});
		txtSearchForCar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSearchForCar.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearchForCar.setText("search for car");
		txtSearchForCar.setBounds(39, 148, 576, 32);
		getContentPane().add(txtSearchForCar);
		txtSearchForCar.setColumns(10);
		
		JButton Search = new JButton("Search");
		Search.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			int i=1;
				try{
					int searchedModel= Integer.parseInt(txtSearchForCar.getText());
					resultArea.setText("");

					for(Car c : db.cars){
						if(c.model == searchedModel )
							resultArea.setText(resultArea.getText() +"\n"+(i++)+"- "+c.toString());
					}
					
				}
				catch(NumberFormatException nfe){
					resultArea.setText("");

					for(Car c : db.cars){
						if(c.carName.contains(txtSearchForCar.getText()) || c.manufacture.contains(txtSearchForCar.getText()))
							resultArea.setText(resultArea.getText() +"\n"+(i++)+"- "+c.toString());
					}
					
					}
			
				
			}
		});
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Search.setBounds(267, 198, 89, 41);
		getContentPane().add(Search);
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
		
				Panel panel = new Panel();
				  panel.setBounds(0, 0, 476, 40); 
				    getContentPane().add(panel); 

		panel.setLayout(null);
		resultArea.setEditable(false);
		resultArea.setFont(new Font("Times New Roman", Font.BOLD, 22));
		for(int i=0;i<db.cars.size();i++){
			resultArea.setText(resultArea.getText()+"\n"+(i+1)+"- "+db.cars.get(i).toString()+"\n");
			
		}
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
