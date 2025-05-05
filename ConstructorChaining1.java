package patterns;

public class ConstructorChaining1 {
	public static void main(String[] args) {
		Ticket t1=new Ticket();
		System.out.println(t1);
		Ticket t2=new Ticket("Chetan");
		System.out.println(t2);
		Ticket t3=new Ticket("Satish", "Pune");
		System.out.println(t3);
		Ticket t4=new Ticket("Ishwar", "Mumbai", "Cabin");
		System.out.println(t4);
	}

}
