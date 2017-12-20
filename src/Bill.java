
public class Bill {
	private Car car;
	private Account acc;
	private int daysRented;
	private double totalPrice;
	
	public Bill(Car car, Account acc, int daysRented, double totalPrice) {
		this.car = car;
		this.acc = acc;
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
		return " The car " + car.getCarName() + " rented by the user: " + acc.getUsername() + " was rented for " + daysRented + "days, and the total price is: " + totalPrice;
	}
}
