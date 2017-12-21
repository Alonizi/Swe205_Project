import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Adminpage extends JFrame{
	DataBase db = new DataBase();
	 JTextArea CarTextArea;

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
		adminAddress.setBounds(84, 597, 150, 19);
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
	//this is a JDialog class
	 class Adminaccount extends JDialog {
		 JTextArea AccTextArea;
		private JTextField AccModTextField;
		public Adminaccount() {
			db.readDatabaseFiles();
			setSize(400,400);
			setResizable(false);
			getContentPane().setLayout(null);
			
			JLabel AccountLabel = new JLabel("Account");
			AccountLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			AccountLabel.setBounds(151, 10, 87, 13);
			getContentPane().add(AccountLabel);
			
			JButton Accountadd = new JButton("Add");
			Accountadd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					AdminAccountAdd AddAcc =new AdminAccountAdd();
					AddAcc.setVisible(true);
					
				}
			});
			Accountadd.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			Accountadd.setBackground(Color.GREEN);
			Accountadd.setBounds(289, 81, 85, 21);
			getContentPane().add(Accountadd);
			
			JButton Accountdelete = new JButton("Delete");
			Accountdelete.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent arg0) {
					String CarNumber = AccModTextField.getText();
					for(int i = 0; i < db.accounts.size(); i++) 
						if(db.accounts.get(i).username.equalsIgnoreCase(CarNumber)) {
							db.accounts.remove(i);
						
						}
					db.updateDatabaseFiles();
					AccTextArea.setText("");
					for(int i=0;i<db.accounts.size();i++){
						AccTextArea.setText(AccTextArea.getText()+"\n"+(i+1)+"- "+db.accounts.get(i).toString()+"\n");
						
					}
							
						
					
				}
				
			});
			Accountdelete.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			Accountdelete.setBackground(Color.RED);
			Accountdelete.setBounds(289, 190, 85, 21);
			getContentPane().add(Accountdelete);
//			
//			JButton Accountmodify = new JButton("Modify");
//			Accountmodify.setFont(new Font("Times New Roman", Font.ITALIC, 14));
//			Accountmodify.setBackground(Color.YELLOW);
//			Accountmodify.setBounds(289, 167, 85, 21);
//			getContentPane().add(Accountmodify);
			
			AccTextArea = new JTextArea();
			
			AccTextArea.setEditable(false);
			
			JScrollPane scroll = new JScrollPane(AccTextArea);
			scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setBounds(10, 80, 248, 259);
			getContentPane().add(scroll);
			for(int i=0;i<db.accounts.size();i++){
				AccTextArea.setText(AccTextArea.getText()+"\n"+(i+1)+"- "+db.accounts.get(i).toString()+"\n");
				
			}
			
			AccModTextField = new JTextField();
			AccModTextField.setColumns(10);
			AccModTextField.setBounds(278, 227, 96, 19);
			getContentPane().add(AccModTextField);
			setVisible(true);
			
		}
		

	}
	 public class AdminAccountAdd extends JDialog {
			private JTextField AddUsernameTextField;
			private JTextField AddPasswordTextField;
			private JTextField AddPaymentMethodTextField;
			private JTextField AddAddressTextfield;
			private JTextField AddTypeTextField;
			public AdminAccountAdd() {
				getContentPane().setLayout(null);
				setSize(400, 400);
				setResizable(false);
				JLabel AddUsernameLabel = new JLabel("Username");
				AddUsernameLabel.setBounds(72, 78, 74, 13);
				getContentPane().add(AddUsernameLabel);
				
				JLabel AddPasswordLabel = new JLabel("Password");
				AddPasswordLabel.setBounds(72, 110, 74, 13);
				getContentPane().add(AddPasswordLabel);
				
				JLabel AddPaymentMethodLabel = new JLabel("Payment Method");
				AddPaymentMethodLabel.setBounds(72, 142, 115, 13);
				getContentPane().add(AddPaymentMethodLabel);
				
				JLabel AddAdressLabel = new JLabel("Address");
				AddAdressLabel.setBounds(72, 176, 74, 13);
				getContentPane().add(AddAdressLabel);
				
				JLabel AdminAddLabel = new JLabel("Adding Account");
				AdminAddLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
				AdminAddLabel.setBounds(142, 10, 149, 19);
				getContentPane().add(AdminAddLabel);
				
				AddUsernameTextField = new JTextField();
				AddUsernameTextField.setBounds(197, 75, 154, 19);
				getContentPane().add(AddUsernameTextField);
				AddUsernameTextField.setColumns(10);
				
				AddPasswordTextField = new JTextField();
				AddPasswordTextField.setBounds(197, 107, 154, 19);
				getContentPane().add(AddPasswordTextField);
				AddPasswordTextField.setColumns(10);
				
				AddPaymentMethodTextField = new JTextField();
				AddPaymentMethodTextField.setBounds(197, 139, 154, 19);
				getContentPane().add(AddPaymentMethodTextField);
				AddPaymentMethodTextField.setColumns(10);
				
				AddAddressTextfield = new JTextField();
				AddAddressTextfield.setBounds(197, 173, 154, 19);
				getContentPane().add(AddAddressTextfield);
				AddAddressTextfield.setColumns(10);
				
				JButton AdminAddAccountBtn = new JButton("Add");
				AdminAddAccountBtn.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent arg0) {
						
						String username = AddUsernameTextField.getText();
						String password = AddPasswordTextField.getText();						
						String paymentMethod = AddPaymentMethodTextField.getText();
						String address = AddAddressTextfield.getText();
						String type = AddTypeTextField.getText(); 
						boolean isAvailable = false;
						for(int i = 0; i < db.accounts.size(); i++)
							if(db.accounts.get(i).username.equalsIgnoreCase(username)) {
								isAvailable=true;
							}
								
						if (isAvailable) {
							dispose();
							AdminAccountAdd x = new AdminAccountAdd();
							JOptionPane.showMessageDialog(x, "User already exists!");
								x.dispose();
						}
						else {
						db.accounts.add(new Account(username, password, address, paymentMethod, type));
						db.updateDatabaseFiles();
						dispose();

						}
						
					}
					
				});

				AdminAddAccountBtn.setFont(new Font("Times New Roman", Font.ITALIC, 14));
				AdminAddAccountBtn.setBounds(233, 267, 85, 21);
				getContentPane().add(AdminAddAccountBtn);
				
				AddTypeTextField = new JTextField();
				AddTypeTextField.setColumns(10);
				AddTypeTextField.setBounds(197, 205, 154, 19);
				getContentPane().add(AddTypeTextField);
				
				JLabel AddTypeLabel = new JLabel("Type");
				AddTypeLabel.setBounds(72, 208, 74, 13);
				getContentPane().add(AddTypeLabel);
				setVisible(true);
			}
			
	 }
	//this is a JDialog class
	 class Admincar extends JDialog {
		
		private JTextField CarModTextField;
		public Admincar() {
			db.readDatabaseFiles();
			setSize(400,400);
			setResizable(false);
			getContentPane().setLayout(null);
			
			JLabel CarsTab = new JLabel("Cars");
			CarsTab.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			CarsTab.setBounds(171, 10, 45, 13);
			getContentPane().add(CarsTab);
			
			JButton CarsAdd = new JButton("Add");
			CarsAdd.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					AdminAddCar AddCar =new AdminAddCar();
					AddCar.setVisible(true);
					
				}
			});
			CarsAdd.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			CarsAdd.setBackground(Color.GREEN);
			CarsAdd.setBounds(289, 81, 85, 21);
			getContentPane().add(CarsAdd);
			
			JButton CarsDelete = new JButton("Delete");
			CarsDelete.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent arg0) {
					int CarNumber = Integer.parseInt(CarModTextField.getText());
					for(int i = 0; i < db.cars.size(); i++) 
						if(db.cars.get(i).CN == CarNumber) {
							db.cars.remove(i);
						
						}
					db.updateDatabaseFiles();
					CarTextArea.setText("");
					for(int i=0;i<db.cars.size();i++){
						CarTextArea.setText(CarTextArea.getText()+"\n"+(i+1)+"- "+db.cars.get(i).toString()+"\n");
						
					}
							
						
					
				}
				
			});
			
			CarsDelete.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			CarsDelete.setBackground(Color.RED);
			CarsDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			CarsDelete.setBounds(289, 190, 85, 21);
			getContentPane().add(CarsDelete);
			
//			JButton CarsModify = new JButton("Modify");
//			CarsModify.setFont(new Font("Times New Roman", Font.ITALIC, 14));
//			CarsModify.setBackground(Color.YELLOW);
//			CarsModify.setBounds(289, 167, 85, 21);
//			getContentPane().add(CarsModify);
			
			CarTextArea = new JTextArea();
			CarTextArea.setEditable(false);
			JScrollPane scroll = new JScrollPane(CarTextArea);
			scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setBounds(10, 80, 248, 259);
			getContentPane().add(scroll);
			for(int i=0;i<db.cars.size();i++){
				CarTextArea.setText(CarTextArea.getText()+"\n"+(i+1)+"- "+db.cars.get(i).toString()+"\n");
				
			}
			
			CarModTextField = new JTextField();
			CarModTextField.setBounds(278, 227, 96, 19);
			getContentPane().add(CarModTextField);
			CarModTextField.setColumns(10);
			setVisible(true);
		}
	
	}
	 public class AdminAddCar extends JDialog {
			private JTextField ManufacturerTextField;
			private JTextField NameTextField;
			private JTextField ModelTextField;
			private JTextField SeatsTextField;
			private JTextField ColorTextField;
			private JTextField DateTextField;
			private JTextField PriceTextField;
			public AdminAddCar() {
				getContentPane().setLayout(null);
				setSize(400, 400);
				
				JLabel LabelManufacturer = new JLabel("Manufacturer");
				LabelManufacturer.setBounds(71, 78, 90, 13);
				getContentPane().add(LabelManufacturer);
				
				JLabel labelName = new JLabel("Name");
				labelName.setBounds(71, 110, 74, 13);
				getContentPane().add(labelName);
				
				JLabel labelModel = new JLabel("Model");
				labelModel.setBounds(71, 142, 115, 13);
				getContentPane().add(labelModel);
				
				JLabel labelSeats = new JLabel("Seats");
				labelSeats.setBounds(71, 176, 74, 13);
				getContentPane().add(labelSeats);
				
				JLabel LabelAddingCar = new JLabel("Adding Car");
				LabelAddingCar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
				LabelAddingCar.setBounds(159, 10, 149, 19);
				getContentPane().add(LabelAddingCar);
				
				ManufacturerTextField = new JTextField();
				ManufacturerTextField.setColumns(10);
				ManufacturerTextField.setBounds(196, 75, 154, 19);
				getContentPane().add(ManufacturerTextField);
				
				NameTextField = new JTextField();
				NameTextField.setColumns(10);
				NameTextField.setBounds(196, 107, 154, 19);
				getContentPane().add(NameTextField);
				
				ModelTextField = new JTextField();
				ModelTextField.setColumns(10);
				ModelTextField.setBounds(196, 139, 154, 19);
				getContentPane().add(ModelTextField);
				
				SeatsTextField = new JTextField();
				SeatsTextField.setColumns(10);
				SeatsTextField.setBounds(196, 173, 154, 19);
				getContentPane().add(SeatsTextField);
				
				JButton AddCarBtn = new JButton("Add");
				AddCarBtn.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent arg0) {
						String manufacturer = ManufacturerTextField.getText();
						String name = NameTextField.getText();
						int model = Integer.parseInt(ModelTextField.getText());
						int numSeats = Integer.parseInt(SeatsTextField.getText());
						String color = ColorTextField.getText();
						String date = DateTextField.getText();
						int price = Integer.parseInt(PriceTextField.getText());
						
						db.cars.add(new Car(manufacturer, name, model, numSeats, color, true, false, false, date, price));
						
						db.updateDatabaseFiles();
						CarTextArea.setText("");
						for(int i=0;i<db.cars.size();i++){
							CarTextArea.setText(CarTextArea.getText()+"\n"+(i+1)+"- "+db.cars.get(i).toString()+"\n");
							
						}
						dispose();
						
					}
					
				});
				AddCarBtn.setFont(new Font("Times New Roman", Font.ITALIC, 14));
				AddCarBtn.setBounds(234, 304, 85, 21);
				getContentPane().add(AddCarBtn);
				
				ColorTextField = new JTextField();
				ColorTextField.setColumns(10);
				ColorTextField.setBounds(196, 202, 154, 19);
				getContentPane().add(ColorTextField);
				
				DateTextField = new JTextField();
				DateTextField.setColumns(10);
				DateTextField.setBounds(196, 236, 154, 19);
				getContentPane().add(DateTextField);
				
				JLabel labelColor = new JLabel("Color");
				labelColor.setBounds(71, 205, 115, 13);
				getContentPane().add(labelColor);
				
				JLabel labelDate = new JLabel("Date");
				labelDate.setBounds(71, 236, 74, 13);
				getContentPane().add(labelDate);
				
				PriceTextField = new JTextField();
				PriceTextField.setColumns(10);
				PriceTextField.setBounds(196, 265, 154, 19);
				getContentPane().add(PriceTextField);
				
				JLabel labelPrice = new JLabel("Price");
				labelPrice.setBounds(71, 268, 74, 13);
				getContentPane().add(labelPrice);
				setVisible(true);
			}
			
	 }
	//this is a JDialog class
	 class Adminbills extends JDialog {
		 JTextArea BillTextArea;
		private JTextField BillModTextField;
		public Adminbills() {
			db.readDatabaseFiles();
			setSize(400,400);
			setResizable(false);
			getContentPane().setLayout(null);
			
			JLabel billsLabel = new JLabel("Bills");
			billsLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			billsLabel.setBounds(171, 10, 45, 13);
			getContentPane().add(billsLabel);
			
			JButton deleteBills = new JButton("Delete");
			deleteBills.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent arg0) {
					int BillNumber = Integer.parseInt(BillModTextField.getText());
					for(int i = 0; i < db.bills.size(); i++) 
						if(db.bills.get(i).billNumber == BillNumber) {
							db.bills.remove(i);
						
						}
					db.updateDatabaseFiles();
					BillTextArea.setText("");
					for(int i=0;i<db.bills.size();i++){
						BillTextArea.setText(BillTextArea.getText()+"\n"+(i+1)+"- "+db.bills.get(i).toString()+"\n");
						
					}
							
						
					
				}
				
			});
			deleteBills.setFont(new Font("Times New Roman", Font.ITALIC, 14));
			deleteBills.setBackground(Color.RED);
			deleteBills.setBounds(289, 190, 85, 21);
			getContentPane().add(deleteBills);
			
			BillTextArea = new JTextArea();
			BillTextArea.setEditable(false);
			
			JScrollPane scroll = new JScrollPane(BillTextArea);
			scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			scroll.setBounds(10, 80, 248, 259);
			getContentPane().add(scroll);
			for(int i=0;i<db.bills.size();i++){
				BillTextArea.setText(BillTextArea.getText()+"\n"+(i+1)+"- "+db.bills.get(i).toString()+"\n");
				
			}
			
			BillModTextField = new JTextField();
			BillModTextField.setColumns(10);
			BillModTextField.setBounds(278, 227, 96, 19);
			getContentPane().add(BillModTextField);
			setVisible(true);
		}
		

	}


}
