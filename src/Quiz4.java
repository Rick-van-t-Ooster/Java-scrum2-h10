/**
 * 
 * @author Rick van 't Ooster
 *
 */


public class Quiz4 {
	//class attributes 
	static int x = 2;
	
	//constructor
	Quiz4(){
		x++; // x += 4; vervangen door x++; Dit veranderde de output van 11 naar 5.
	}
	
	//method area
	
	static void methodeA(int i) {
		x  = x-i;
	}
	
	int methodeB(int i) {
		return x + i;
	}
	
	//eind method area.
	
	//main method
	public static void main(String[] args) {
		//aanmaken 2 objecten van de class Quiz4 en het uitvoeren van de methods methodeA en methodeB.
		Quiz4 mk1 = new Quiz4();
		mk1.methodeA(2);
		Quiz4 mk2 = new Quiz4();
		System.out.println(mk2.methodeB(3));
	}
	
}
