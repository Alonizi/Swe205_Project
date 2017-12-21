

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Panel;
import java.util.InputMismatchException;
import java.awt.Component;
import java.awt.Color;

public class MainPage extends JFrame {
	private JTextField txtSearchForCar;
	JTextArea resultArea ;
	DataBase db = new DataBase();
	private JTextField Addtextindex;
	JTextArea textArea ;
	userCart uc;
	JLabel totalPrice, finalPrice, discountValue;
	int computePrice = 0;

	public MainPage() {
		uc= new userCart();
		setSize(700,700);
		db.readDatabaseFiles();
		getContentPane().setBackground(UIManager.getColor("ToolTip.background"));
		getContentPane().setLayout(null);
		
		txtSearchForCar = new JTextField();
		txtSearchForCar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
txtSearchForCar.setText("");
			}
		});
		txtSearchForCar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtSearchForCar.setHorizontalAlignment(SwingConstants.CENTER);
		txtSearchForCar.setText("search for car by manufacture or name");
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
		Search.setBounds(49, 197, 89, 41);
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
		
		JButton HomeButton = new JButton("Home");
		HomeButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				resultArea.setFont(new Font("Times New Roman", Font.BOLD, 22));
				for(int i=0;i<db.cars.size();i++){
					resultArea.setText(resultArea.getText()+"\n"+(i+1)+"- "+db.cars.get(i).toString()+"\n");
					
				}
				Addtextindex.setText("Index");
				txtSearchForCar.setText("search for car by manufacture or name");
			}
		});
		HomeButton.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		HomeButton.setBounds(517, 0, 167, 75);
		getContentPane().add(HomeButton);
		
		JButton CartButton = new JButton("Cart");
		CartButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				 
				uc.setVisible(true);
				
				
			}
		});
		CartButton.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		CartButton.setBounds(189, 0, 167, 75);
		getContentPane().add(CartButton);
		
		JButton ReviewButton = new JButton("Review");
		ReviewButton.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		ReviewButton.setBounds(352, 0, 167, 75);
		getContentPane().add(ReviewButton);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 69, 22);
		getContentPane().add(menuBar);
		
		JMenu mnAccount = new JMenu("Account");
		mnAccount.setForeground(Color.BLUE);
		menuBar.add(mnAccount);
		
		JMenuItem Settingmenuitem = new JMenuItem("Setting");
		mnAccount.add(Settingmenuitem);
		
		JMenuItem Logoutmenuitem = new JMenuItem("Logout");
		mnAccount.add(Logoutmenuitem);
		Logoutmenuitem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
				
			}
		});
		
	
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				resultArea.setFont(new Font("Times New Roman", Font.BOLD, 22));
				for(int i=0;i<db.cars.size();i++){
					resultArea.setText(resultArea.getText()+"\n"+(i+1)+"- "+db.cars.get(i).toString()+"\n");
					
				}		
			}
		});
		ResetButton.setBounds(189, 197, 89, 41);
		getContentPane().add(ResetButton);
		
		Addtextindex = new JTextField();
		Addtextindex.setHorizontalAlignment(SwingConstants.CENTER);
		Addtextindex.setText("Index");
		Addtextindex.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
Addtextindex.setText("");
			}
		});
		Addtextindex.setBounds(352, 219, 122, 19);
		getContentPane().add(Addtextindex);
		Addtextindex.setColumns(10);
		
		JButton AddButton = new JButton("Add");
		AddButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				uc.setVisible(true);
		int CarNum = Integer.parseInt(Addtextindex.getText());
			db.updateDatabaseFiles();
			
			for(int i=0;i<db.cars.size();i++) {
				if(CarNum == db.cars.get(i).CN) {
					textArea.setText(textArea.getText()+"\n"+db.cars.get(i).toString());
					computePrice += db.cars.get(i).price;
					totalPrice.setText("" + computePrice);
				}
			}
				
			}
		});
		AddButton.setBounds(510, 216, 89, 22);
		getContentPane().add(AddButton);
	}

	public class CartDialog extends JDialog
	{
		public CartDialog()
		{
			setSize(300,300);

		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	class userCart extends JDialog {
		private JTextField deleteTextArea;
		public userCart() {
			setSize(400,400);
			setResizable(false);
			getContentPane().setLayout(null);
			
			JLabel labelCart = new JLabel("Cart");
			labelCart.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			labelCart.setBounds(158, 10, 45, 13);
			getContentPane().add(labelCart);
			

			 textArea = new JTextArea();
			textArea.setBounds(10, 50, 248, 206);
			JScrollPane scroll = new JScrollPane(resultArea);
			scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
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
			
			totalPrice = new JLabel("");
			totalPrice.setBounds(143, 289, 115, 13);
			getContentPane().add(totalPrice);
			
			JLabel discountLabel = new JLabel("Discount:");
			discountLabel.setBounds(10, 312, 85, 13);
			getContentPane().add(discountLabel);
			
			discountValue = new JLabel("0");
			discountValue.setBounds(143, 312, 115, 13);
			getContentPane().add(discountValue);
			
			JLabel finalLabel = new JLabel("Final price:");
			finalLabel.setBounds(10, 338, 85, 13);
			getContentPane().add(finalLabel);
			
			finalPrice = new JLabel("zzzzzzzz");
			finalPrice.setBounds(143, 335, 115, 13);
			getContentPane().add(finalPrice);
			//setVisible(true);
		}
		

	}
}
