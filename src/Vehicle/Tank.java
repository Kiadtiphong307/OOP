package Vehicle;

public class Tank extends Transportarion{

    public void move() {
        super.SetFuel(super.getFuel() - 50);
    }


}
