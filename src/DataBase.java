import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class DataBase {
	ArrayList<Car> cars;
	ArrayList<Account> accounts;
	ArrayList<Bill> bills;
	
	public DataBase(){
		cars = new ArrayList<Car>();
		accounts = new ArrayList<Account>();
		bills = new ArrayList<Bill>();
		
		
		
	}
	
	public void readDatabaseFiles(){
		cars.clear();
		accounts.clear();
		bills.clear();
		 
		try{
		int i=0;
		FileInputStream carinstream = new FileInputStream("cars.txt");
		FileInputStream accountinstream = new FileInputStream("accounts.txt");
		FileInputStream billinstream = new FileInputStream("bills.txt");
		Scanner mycarfile = new Scanner(carinstream);
		Scanner myaccfile = new Scanner(accountinstream);
		Scanner mybillfile = new Scanner(billinstream);
		while(mycarfile.hasNext()){
			cars.add(new Car(mycarfile.next(), mycarfile.next(), mycarfile.nextInt(), mycarfile.nextInt(), mycarfile.next(), mycarfile.nextBoolean(), mycarfile.nextBoolean(), mycarfile.nextBoolean(), mycarfile.next(),mycarfile.nextInt()));

		}
		for( i=0;i<cars.size();i++)
			cars.get(i).CN = (i+1);
		
		

		while(myaccfile.hasNext()){
			
	
			accounts.add(new Account(myaccfile.next(), myaccfile.next(), myaccfile.next(), myaccfile.next(), myaccfile.next()));
		}
		
		
		while(mybillfile.hasNext()){
			
		bills.add(new Bill(mybillfile.nextInt(), mybillfile.next(), mybillfile.next(), mybillfile.nextInt(), mybillfile.nextDouble()));	

		}
		billinstream.close();
		mybillfile.close();
		carinstream.close();
		mycarfile.close();
		accountinstream.close();
		myaccfile.close();
		
		}
		catch(FileNotFoundException e){

			System.out.println("File Not Found");
		}
		catch (IOException ioe){
			System.out.println("IO Exception");
			
		}
		}
	public void updateDatabaseFiles(){
		try{
			FileOutputStream carOutStream = new FileOutputStream("cars.txt",false);
			FileOutputStream accOutStream = new FileOutputStream("accounts.txt",false);
			FileOutputStream billOutStream = new FileOutputStream("bills.txt",false);
			PrintWriter carpw = new PrintWriter(carOutStream);
			PrintWriter accpw = new PrintWriter(accOutStream);
			PrintWriter billpw = new PrintWriter(billOutStream);
			for(Car c : cars){
			carpw.print(c.manufacture+" "+ c.carName + " "+ c.model+ " "+c.seats +" "+c.color +" "+c.isRentable +" "+ c.needFix+ " "+ c.needService +" "+ c.date + " "+ c.price+"\n");	
				
			}
			for(Account acc: accounts){	
			accpw.print(acc.username + " "+ acc.password+ " "+acc.adress+ " "+acc.PaymentInfo+ " "+acc.type+"\n" );
			}
			for(Bill bill : bills){
				billpw.print(bill.billNumber+ " "+bill.carname+ " "+bill.accountname+ " "+bill.daysRented+ " "+bill.totalPrice+"\n");
			}
			//carOutStream.close();
			//accOutStream.close();
			//billOutStream.close();
			carpw.close();
			accpw.close();
			billpw.close();
		}
		catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		cars.clear();
		accounts.clear();
		bills.clear();
		readDatabaseFiles();
		
		
	}

}
