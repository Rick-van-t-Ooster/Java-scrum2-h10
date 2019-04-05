import java.util.Scanner;

public class ArrayList {

	public static void main(String [] args) {
		System.out.println("Om iets toe te voegen, type T, om iets te verwijderen toets V: ");
        Scanner keuze = new Scanner(System.in);
        String input = keuze.nextLine();
        
        if(input.equals("T") || input.equals("t")) {
        System.out.print("Type hier een woord dat je wil invoegen: ");
        Scanner toevoegen = new Scanner(System.in);
        String str = toevoegen.nextLine();
        System.out.println(str);
        }
		

        else if(input.equals("V")|| input.equals("v")) { 
		System.out.print("Type hier een woord dat je wil verwijderen: ");
        Scanner verwijder = new Scanner(System.in);
        String string = verwijder.nextLine();
        System.out.println(string);
	}
        else {
        	System.out.println("ongeldige input");
        	main(null);
        }
	}
}
