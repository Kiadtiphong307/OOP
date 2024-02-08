package Vehicle;

public class Car extends Transportarion{


    public void move() {
        super.SetFuel(super.getFuel() - 5);
    }

    public void move(int amount) {
        super.SetFuel(super.getFuel() - (amount*5));
    }
    








}
