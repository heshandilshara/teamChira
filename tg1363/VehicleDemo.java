//Driver class

public class VehicleDemo{
	public static void main(String[] args){
                Vehicle v = new Vehicle(); //super class object
		v.start();
		System.out.println("Vehicle Color:"+v.color);
		//v.drive(); //compile error
		//v.topSpeed; //compile error
		 v.drift();

		Car c = new Car(); //sub class object
		c.start();
		c.drive();
		c.drift();
		System.out.println("Car Color:"+c.color);
		System.out.println("Car top speed:"+c.topSpeed);


	
	
	}
}