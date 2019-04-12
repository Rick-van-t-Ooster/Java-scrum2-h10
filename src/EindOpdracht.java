import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class EindOpdracht {

	public static void main(String [] args) {
		System.out.println("Om iets toe te voegen, type T, om iets te verwijderen toets V: ");
        Scanner keuze = new Scanner(System.in);
        String input = keuze.nextLine();
        
        if(input.equals("T") || input.equals("t")) {
        System.out.print("Type hier een woord dat je wil invoegen: ");
        Scanner toevoegen = new Scanner(System.in);
        String str = toevoegen.nextLine();
        System.out.println(str);
        voegToe("lijst.txt", str);
        }
		

        else if(input.equals("V")|| input.equals("v")) { 
		System.out.print("Type hier een woord dat je wil verwijderen: ");
        Scanner verwijder = new Scanner(System.in);
        String string = verwijder.nextLine();
        System.out.println(string);
        verwijder("lijst.txt", string);
	}
        else {
        	System.out.println("ongeldige input");
        	main(null);
        }
        
	}
	
	//begin method area
	
	//method om een woord toe te voegen aan het bestand.
	public static void voegToe(String bestand, String woord) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(bestand),true));
			writer.write(woord);
			writer.close();
		} catch (IOException e) {
			System.out.println("bestand niet gevonden");
			e.printStackTrace();
		}
	}
	
	public static void verwijder(String bestand, String woord) {
		System.out.println("verwijder method gecalled");
		try {
			//Er word gebruik gemaakt van 2 bestanden omdat je niet kan schrijven naar een bestand die word gebruikt door een andere fileReader/fileWriter.
			File leesBestand = new File(bestand);
			File tempBestand = new File("tempLijst.txt");
			//aanmaken file io
			BufferedReader reader = new BufferedReader(new FileReader(leesBestand));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempBestand));
			String huidigeRegel;
			String trimmedLine;
			while((huidigeRegel = reader.readLine())!=null) {
				trimmedLine = huidigeRegel.trim();
				//wanneer de huidige regel matched met het woord dat verwijdert moet worden dan word er een nieuwe iteratie gedaan
				if(trimmedLine.equalsIgnoreCase(woord)) continue; 
				//wanneer de huidige regel niet matched met het woord dat verwijdert moet worden. dan word dit naar het tijdelijke bestand geschreven.
				writer.write(huidigeRegel + "\n"); 
				
			}
			
			//sluiten van bestanden
			reader.close();
			writer.close();
			
			//zorgen dat de content van het tijdelijk bestand in het normale bestand komt.
			leesBestand.delete();
			tempBestand.renameTo(leesBestand);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
	
	
	//TODO een method voor weergeven van een lijst
	
	
	//einde method area
	
}
