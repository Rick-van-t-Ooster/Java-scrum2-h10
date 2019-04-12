public class Q3H10{
    static int x = 6;
    int y = 3;

    Q3H10(){
        x+=3;
        y+=2;
    }
    public void mijnMethode(int i){
        this.y = y-i;
        x++;
    }

    public static void main(String[]args){
        Q3H10 mk1 = new Q3H10();
        Q3H10 mk2 = new Q3H10();
        Q3H10 mk3 = new Q3H10();
        mk1.mijnMethode(3);
        System.out.print(mk2.x + ", " + mk1.y);
    }
}
