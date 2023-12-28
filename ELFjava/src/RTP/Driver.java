package RTP;

public class Driver {
public static void main(String[] args) {
	Bike b=new Bike();
	
	Ride r=new Ride();
	r.ride(b);
	
	Auto a=new Auto();
	r.ride(a);
	
	Car c=new Car();
	r.ride(c);
	
	Vehicle v1=new Vehicle();
	r.ride(v1);
	
}
}
