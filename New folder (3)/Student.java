class Student{
       String fName,lName;
       int age;
      Student(){
	     fName="Heshan";
	     lName="Dilshara";
	     age=22;
             
	}
	public Student(String fName,String lName){
	      this();
	      this.fName = fName;
	      this.lName = lName;
	      
	}
	public String getFullName(){
              return ( fName + " " + lName);
	}
	public String getStudentDetails(){
              return(fName + " " + lName + " " +age);

	}
}