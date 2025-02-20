public class A{
        A(){
         System.out.println("Inside A's Constructor");
         }
         A(String s){
		this();
		System.out.println("Inside A parameterized constructor");
	}
}