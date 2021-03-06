// this class is responsible for displaying the car's name, price, account's name, and days rented 
// to the user after he completes his payment 
public class Bill {
	int billNumber;
	  Car car;
	  String carname;
	 Account acc;
	 String accountname;
	 int daysRented;
	 double totalPrice;
	
	public Bill(int billNumber,String carname, String accountname, int daysRented, double totalPrice) {
		this.billNumber = billNumber;
		this.carname = carname;
		this.accountname = accountname;
		this.daysRented = daysRented;
		this.totalPrice = totalPrice;
	}


	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String toString() {
		return "Bill Number: " + billNumber +  " The car " + carname + " rented by the user: " + accountname + " was rented for " + daysRented + "days, and the total price is: " + totalPrice;
	}
}
