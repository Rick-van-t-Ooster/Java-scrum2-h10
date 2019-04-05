
public class Quiz3 {

	   static int x = 6;
	    int y = 3;

	    Quiz3(){
	        x+=3;
	        y+=2;
	        }
	        void mijnMethode(int i){
	        this.y = y-i;
	        x++;
	        }

	    public static void main(String[]args){
	        Quiz3 mk1 = new Quiz3();
	        Quiz3 mk2 = new Quiz3();
	        Quiz3 mk3 = new Quiz3();
	        mk1.mijnMethode(3);
	        System.out.print(mk2.x + ", " + mk1.y);
	    }
	
	
}
