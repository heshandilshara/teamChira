public class B extends A{
 	B(){
               System.out.println("Inside B's Constructor");

          }
	B(String s){
		 super(s);
                 System.out.println(s);
        }
}
