public class Quiz2{
	static int x = 3;
	
	public Quiz2() {
		x ++;
	}
	public static int mijnMethode(int i, int i2) {
		x += ( i-i2 );
		return x;
	}
	public static int resetX(int p1) {
		x = p1;
		return x;
	}
	public static void main(String[] args) {
		Quiz2 mk1 = new Quiz2();
		Quiz2 mk2 = new Quiz2();
		System.out.print(Quiz2.x + ", ");
		Quiz2 mk3 = new Quiz2();
		Quiz2.mijnMethode(8, 3);
		System.out.print(Quiz2.x + ", ");
		Quiz2.resetX(10);
		System.out.println(Quiz2.x);
	}
	
}