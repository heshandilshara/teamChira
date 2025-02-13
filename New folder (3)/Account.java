class Account{
	int a,b;
	Account(){
	 a=5;
         b=10;
	}
 	public void setData(int a,int b){
	    a= this.a;
	    b= this.b;
	    System.out.println("a = " + a + " b = " + b);

       }
	public void showData(){
	        System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);

	}
	public static void main(String[]args){
                Account myAccount= new Account();
		myAccount.setData(2,3);
		myAccount.showData();
	}


}