package Personnel;

// import Vehicle.Transportarion;
import Vehicle.Car;

public class Person {
	private String name;
	private int money;
	
	
	
    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

 
	
	
 
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
    public void buy(Car C) {
        money = money - C.getPrice();

    }


	

}
