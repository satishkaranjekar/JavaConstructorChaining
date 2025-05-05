package patterns;

public class Ticket {
	private String name;
	private String destination;
	private String seatType;
	
	Ticket(){
		this("Guest");
		
	}
	Ticket(String name){
		this(name, "Not Specified");
		
	}
	Ticket(String name, String destination){
		this(name, destination, "General");
		
	}
	Ticket(String name, String destination, String seatType){
		super();
		this.name=name;
		this.destination=destination;
		this.seatType=seatType;
		
	}
	@Override
	public String toString() {
		return "TrainTicket [name=" + name + ", destination=" + destination + ", seatType=" + seatType + "]";
	}
}

