// this class is to present the user with the confirmation that he bought the car
public class Payment {
	private Car car;
	private Account acc;
	private int daysRented;
	
	public Payment(Car car, Account acc, int daysRented) {
		this.car = car;
		this.acc = acc;
		this.daysRented = daysRented;
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
	
	public void authentication() {
		
	}
	
	public void constructBill(Bill bill) {
		
	}
	
	public String toString() {
		return "The car " + car + " was rented by the person with the account: " + acc + " for the following number of days: " + daysRented; 
	}
	
	
}
