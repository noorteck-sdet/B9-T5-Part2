package team;

public class Demo extends EncapsulationDemo{
public static void main(String[] args) {
	
	EncapsulationDemo obj = new EncapsulationDemo();
	
	obj.setName("Lakha");
	obj.setAge(40);
	
	System.out.println(obj.getName());
	System.out.println(obj.getAge());
}
}
