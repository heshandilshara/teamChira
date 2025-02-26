public class Demo{
	public static void main(String[] args){
		Cylinder c1 = new Cylinder();
		Cylinder c2 = new Cylinder(10.0);
		Cylinder c3 = new Cylinder(7.0, 10.0);

		System.out.println("Cylinder 1 -> Radius: " + c1.getRadius() + ", Height: " + c1.getHeight() + ", Base Area: " + c1.getArea() + ", Volume: " + c1.getVolume());
                System.out.println("Cylinder 2 -> Radius: " + c2.getRadius() + ", Height: " + c2.getHeight() + ", Base Area: " + c2.getArea() + ", Volume: " + c2.getVolume());
                System.out.println("Cylinder 3 -> Radius: " + c3.getRadius() + ", Height: " + c3.getHeight() + ", Base Area: " + c3.getArea() + ", Volume: " + c3.getVolume());

	}
}