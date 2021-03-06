//this class is used to hold the car's information such as 
//manufacture,name,model,number of seats,color, whether its rented or not, whether it needs a fix or a service 
//the date the car is added,its price,and a unique identifier for each car  
public class Car {
    String manufacture ;
    String carName ;
    int model ;
    int seats ;
    String color ;
    boolean isRentable ;
    boolean needFix ;
    boolean needService ;
    String date ;
    int price;
    int CN;

    public Car(String manufacture , String carName , int model , int seats , String color , boolean isRentable ,
               boolean needFix , boolean needService , String date,int price)
    {
        this.manufacture = manufacture ;
        this.carName = carName ;
        this.model = model ;
        this.seats = seats ;
        this.color = color ;
        this.isRentable = isRentable ;
        this.needFix = needFix ;
        this.needService = needService ;
        this.date = date;
        this.price=price;
        this.CN = -1;

    }

    //Getters

    public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCN() {
		return CN;
	}

	public void setCN(int cN) {
		CN = cN;
	}

	public String getManufacture() {
        return manufacture;
    }

    public String getCarName() {
        return carName;
    }

    public int getModel() {
        return model;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean isRentable() {
        return isRentable;
    }

    public boolean isNeedFix() {
        return needFix;
    }

    public boolean isNeedService() {
        return needService;
    }

    public String getDate() {
        return date;
    }



    //Setters


    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
	public String toString() {
    	if(isRentable)
		return  manufacture + "  ,"+ carName + " ,"+ model + " ," + color+" ,"+price+ "  	Ready to Rent" +" ---------CAR#: "+CN;
		return  manufacture + "  ,"+ carName + " ,"+ model + " ," + color+" ,"+price+ "  	Rented" +" ---------CAR#: "+CN;

    }

	public void setRentable(boolean rentable) {
        isRentable = rentable;
    }

    public void setNeedFix(boolean needFix) {
        this.needFix = needFix;
    }

    public void setNeedService(boolean needService) {
        this.needService = needService;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
