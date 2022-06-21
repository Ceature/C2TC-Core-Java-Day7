package day07;

public class Employee02 {
	int id;
	String name;
	float salary;
	void display() {
		  System.out.println(id +" "+ name +" " +salary);
	}
	public Employee02( int id,  String name,  float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		  Employee02 e1=new Employee02(222,"vishwa",5000);
		  Employee02 e2=new Employee02(333,"vishnu",5000);
		  e1.display();
		  e2.display();

}

}


