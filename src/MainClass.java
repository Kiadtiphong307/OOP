import java .util.Scanner;

import Personnel.Person;
import Vehicle.Car;
// import Vehicle.Tank;
// import Vehicle.Transportarion;

public class MainClass {

	public static void main(String[] args) {
		
		
	try (Scanner scan = new Scanner(System.in)) {
		//input value
		// Transportarion t = new Transportarion(); //use import Transportarion
		Car C = new Car();
		// Tank T = new Tank();
		
		
		


		
		// System.out.print("Enter Fuel = ");
		// t.SetFuel(scan.nextInt());
		
		// System.out.print("Enter Speed = ");
		// t.SetSpeed(scan.nextInt());
		
		// System.out.print("Enter WheelTpye = ");
		// t.SetWheelTpye(scan.next());

	
		//output
		// System.out.println("Fuel = " + t.getFuel());
		// System.out.println("Speed = " + t.getSpeed());
		// System.out.println("WheelTpye = " + t.getWheelTpye());

		// System.out.println("Fuel in Constructor  = " + t.getFuel());
		// t.move();
		// System.out.println("Fuel in after move  = " + t.getFuel());

		
		// System.out.println("Car Fuel before moving  = " + C.getFuel());
		// C.move();
		// System.out.println("Car Fuel after moving  = " + C.getFuel());
		

		// System.out.println("Tank Fuel before moving  = " + T.getFuel());
		// T.move();
		// System.out.println("Tank Fuel after moving  = " + T.getFuel());

		// System.out.println("Car Fuel before moving stack  = " + C.getFuel());
		// C.move(2);
		// System.out.println("Car Fuel after moving  stack = " + C.getFuel());

		//code อาทิตย์ที่แล้ว
		C.setPrice(50000);
		Person p = new Person("Boss", 5000000);
		System.out.println("Name = " + p.getName() + " Money = " + p.getMoney());
		
		p.buy(C);
		System.out.println("Name = " + p.getName() + " Money = " + p.getMoney());

		
	}




	}

}
