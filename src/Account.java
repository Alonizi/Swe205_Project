import java.util.ArrayList;

//this class is responsible for creating new accounts to be then added to the database system
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
	return "USERNAME: "+username+ "  PASSWORD: " + password + "  ADDRESS: " + adress  + " The user is a/an: " + type;
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
