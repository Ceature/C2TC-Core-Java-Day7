package day07;

 class Constructor02 {
	int id;
	String name;
	float salary;
	Constructor02(){
		System.out.println("user define no argument "+" constructor executed");
		
	}
 
	void display() {
		System.out.println(id+" "+name + " "+ salary);
	}
 }

 public class Constructor {
	    public static void main(String[] srgs) {
	   	 Constructor02 e1=new Constructor02();
	   	 Constructor02 e2=new Constructor02();
	   	 e1.display();
	   	 e2.display();
	    }

}
