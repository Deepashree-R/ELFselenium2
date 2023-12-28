package Encapsulation;

public class Enduser {
public static void main(String[] args) {
	Bank b1=new Bank("Megha", 50000, "abc123", "vijaynagar", 123456);
	System.out.println(b1.getcustomerName());
	b1.setcustomerName("Akash");
	System.out.println(b1.getcustomerName());
	System.out.println(b1.getbalance());
	System.out.println(b1.getIFSC());
}
}
