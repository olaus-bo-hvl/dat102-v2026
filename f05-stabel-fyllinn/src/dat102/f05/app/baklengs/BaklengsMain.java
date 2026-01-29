package dat102.f05.app.baklengs;

import dat102.f05.stabel.StabelADT;
import dat102.f05.stabel.tabellstabel.TabellStabel;


public class BaklengsMain {
	
	public static void main(String[] args) {
		
		String[] tabell = {"Anne", "Per", "Lise", "Knut"};
		
		StabelADT<String> stabel = new TabellStabel<>();

        for (String navn : tabell) {
            stabel.push(navn);
        }
        while (!stabel.isEmpty()) {
            System.out.println(stabel.pop());
        }
		
	}
	
}