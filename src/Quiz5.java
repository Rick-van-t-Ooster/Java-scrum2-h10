/**
 * 
 * @author Rick van 't Ooster
 * hoofdstuk 10 quiz 5.
 *
 */
public class Quiz5 {

	static int x; //static heeft invloed op de uitvoer van dit programma.
	
	static StringBuffer sb = new StringBuffer();
	
	public Quiz5() {
		mijnMethode();
	}
	public void mijnMethode() {
		 x += 3;
		 sb.append(x);
	}
	
	public static void main(String[] args) {
		Quiz5 mk = new Quiz5();
		Quiz5 mk2 = new Quiz5();
		Quiz5 mk3 = new Quiz5();
		
		System.out.println(mk.sb);
	}
	
}
