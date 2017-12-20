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
		// TO BE DONE LATER ! 
		try{
		//	int i=0;
		FileInputStream carinstream = new FileInputStream("cars.txt");
		FileInputStream accountinstream = new FileInputStream("accounts.txt");
		FileInputStream billinstream = new FileInputStream("bills.txt");
		Scanner myfile = new Scanner(carinstream);
		while(myfile.hasNext()){
			cars.add(new Car(myfile.next(), myfile.next(), myfile.nextInt(), myfile.nextInt(), myfile.next(), myfile.nextBoolean(), myfile.nextBoolean(), myfile.nextBoolean(), myfile.next(),myfile.nextInt()));
			
		}
		carinstream.close();
		myfile = new Scanner(accountinstream);
		while(myfile.hasNext()){
			
		accounts.add(new Account(myfile.next(), myfile.next(), myfile.next(), myfile.next(), myfile.next()));
		}
		accountinstream.close();
		myfile = new Scanner(billinstream);
		while(myfile.hasNext()){
			
		bills.add(new Bill(myfile.nextInt(), myfile.next(), myfile.next(), myfile.nextInt(), myfile.nextDouble()));	

		}
		billinstream.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}

}
