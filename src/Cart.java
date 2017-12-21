// the cart class is responsible for temporarily holding the user's chosen cars before he proceed 
// with the payment 

public class Cart {
private Car car;
private int Fprice;

	public Cart(Car car,int Fprice) {
		this.car=car;
		this.Fprice=Fprice;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getFprice() {
		return Fprice;
	}

	public void setFprice(int fprice) {
		Fprice = fprice;
	}

	@Override
	public String toString() {
		return "Cart [car=" + car + ", Fprice=" + Fprice + "]";
	}
	
	
	
	
}
