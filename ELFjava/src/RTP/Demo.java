package RTP;

public class Demo {
public static void main(String[] args) {
	Creditcard c1=new Creditcard();
	Debitcard d1=new Debitcard();
	Card c2=new Card();
	Swipe s1=new Swipe();
	s1.swippingmachine(c1);
	s1.swippingmachine(d1);
	s1.swippingmachine(c2);
	
	
}
}
