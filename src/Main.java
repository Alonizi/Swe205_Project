
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
		database.bills.add(new Bill(1, "Anyhting", "SomeWiredPerson", 5, 400));
		database.bills.add(new Bill(2, "Anyhtings", "SomeWiredPerson", 5, 200));
		database.accounts.add(new Account("a", "a", "a", "a", "User"));
		for(int i=0;i<database.cars.size();i++)
			if(database.cars.get(i).CN == 4)
				database.cars.remove(i);
		
		database.updateDatabaseFiles();
		
		System.out.println("AFTER MODIFYING---------------------------");

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
