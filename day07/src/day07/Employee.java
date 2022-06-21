package day07;

public class Employee {
		int id;
		String name;
		float salary;
		
		Employee(){
			  System.out.println("User defined No-arg constructor is called");
		}
public Employee(int i, String s, float f) {
	  id=i;
	  name=s;
	  salary=f;
	  
}
		void display() {
			  System.out.println(id +" "+ name +" " +salary);
		}
		public static void main(String[] args) {
			  Employee e1=new Employee(33,"arjun",1999);
			  Employee e2=new Employee(22,"rama",2000);
			  Employee e3=new Employee();
			  
			  e1.display();
			  e2.display();
              e3.display();
	}

}
