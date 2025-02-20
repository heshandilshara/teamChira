//subclass

public class Car extends Vehicle{
	int topSpeed=180;
	
	public void drive(){
		System.out.println("Car is driving..!!");
	}
	//OVERRIDING
	@Override
	public String drift(){
		
		System.out.println("Car is drifting..!!");
		return 1;

	}
}