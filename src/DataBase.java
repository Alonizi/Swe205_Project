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
		int i=0;
		FileInputStream carinstream = new FileInputStream("cars.txt");
		FileInputStream accountinstream = new FileInputStream("accounts.txt");
		FileInputStream billinstream = new FileInputStream("bills.txt");
		Scanner mycarfile = new Scanner(carinstream);
		Scanner myaccfile = new Scanner(accountinstream);
		Scanner mybillfile = new Scanner(billinstream);
		while(mycarfile.hasNext()){
			cars.add(new Car(mycarfile.next(), mycarfile.next(), mycarfile.nextInt(), mycarfile.nextInt(), mycarfile.next(), mycarfile.nextBoolean(), mycarfile.nextBoolean(), mycarfile.nextBoolean(), mycarfile.next(),mycarfile.nextInt()));
//i++;
//System.out.println(i);
			
/*			System.out.println(mycarfile.next());
			System.out.println(mycarfile.next());
			System.out.println(mycarfile.nextInt());
			System.out.println(mycarfile.nextInt());
			System.out.println(mycarfile.next());
			System.out.println(mycarfile.nextBoolean());
			System.out.println(mycarfile.nextBoolean());
			System.out.println(mycarfile.nextBoolean());
			System.out.println(mycarfile.next());
			System.out.println(mycarfile.nextInt());*/
		}
		
		

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

}
