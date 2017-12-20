import java.util.ArrayList;


public class Account {
String username;
String password;
String adress;
String PaymentInfo;
String type;
ArrayList<Car> carsRented;
boolean isBanned;
Integer statusCnt;
public Account(String username, String password, String adress,
		String paymentInfo, String type) {
	super();
	this.username = username;
	this.password = password;
	this.adress = adress;
	PaymentInfo = paymentInfo;
	this.type = type;
	carsRented = new ArrayList<Car>();
	isBanned = false;
	statusCnt = 0;
	
}
@Override
public String toString() {
	return "Account [username=" + username + ", password=" + password
			+ ", adress=" + adress + ", PaymentInfo=" + PaymentInfo + ", type="
			+ type + ", carsRented=" + carsRented + ", isBanned=" + isBanned
			+ ", statusCnt=" + statusCnt + "]";
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public void login(){
	
	
}
public void postReveiws(){
	
}
	
	
}
