package Vehicle;

public class Transportarion { 
    private int fuel ;
    private int speed;
    private String wheelTpye;
	private int price;
;
	public Transportarion() {
		fuel = 80;
	}
    
    //Fuel
	public int getFuel() {
		return fuel;
	}
	//use function
	public void SetFuel(int fuel) {
		this.fuel = fuel;
		
	}

	//move
	public void move() {
		fuel = fuel - 1;
	}
	
	
	//speed
	public int getSpeed() {
		return speed;
	}
	//use function
	public void SetSpeed(int speed) {
		this.speed = speed;
		
	}
	
	//wheelTpye
    public String getWheelTpye() {
        return wheelTpye;
    }
    //use function
    public void SetWheelTpye(String wheelTpye) {
        this.wheelTpye = wheelTpye;
    }

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
