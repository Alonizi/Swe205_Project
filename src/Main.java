
public class Main {
	public static void main(String[] args) {
		DataBase database = new DataBase();
		database.readDatabaseFiles();
		// Reading Cars
		System.out.println("BEFORE MODIFYING---------------------------");
		System.out.println("Cars:");
		for(Car car : database.cars)
		System.out.println(car);
		
		//Reading Accounts
		System.out.println("Accounts:");
		/*for(Account account : database.accounts)
			System.out.println(account);*/
		System.out.println(database.accounts.size());
		for(int i=0;i<database.accounts.size();i++)
			System.out.println(database.accounts.get(i));
		
		
		//Reading Bills
		System.out.println("Bills:");
		for(Bill bill : database.bills)
			System.out.println(bill);
		
	}

}
