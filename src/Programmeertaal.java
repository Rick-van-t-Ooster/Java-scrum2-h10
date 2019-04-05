public class Programmeertaal {

	static int aantalTalen = 0;
	static String taal = "";	
	
	public static void main(String[] args) {
		talenBijhouden("Java ");
		talenBijhouden("C++ ");
		talenBijhouden("Python ");
		talenBijhouden("PHP ");
		talenBijhouden("Ruby");
		
		System.out.println("Het aantal talen is " + aantalTalen + " talen.");
		System.out.println("Alle talen tot nu toe zijn: " + taal);
	}
	
	public static void talenBijhouden(Object x) {
		taal += x;
		aantalTalen += 1;
	}
}
