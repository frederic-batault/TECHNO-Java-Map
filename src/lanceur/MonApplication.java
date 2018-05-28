package lanceur;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import domaine.Employe;

public class MonApplication {								

	public static void main (String arg[]) {
		
		// 1. Déclaration d'un dictionnaire 
		Map<String,Employe> monDictionnaire = new HashMap<String,Employe>();

		// 2. Déclaration des employés
		Employe employe1 = new Employe("BA","Ibrahima");
		Employe employe2 = new Employe("KONE","Bruno");
		Employe employe3 = new Employe("MARTIN","Antoine");
		
		// 3. Ajout des employés dans le dictionnaire
		monDictionnaire.put("IBA",employe1);
		monDictionnaire.put("BKO",employe2);
		monDictionnaire.put("AMA",employe3);
			   
		// 4. recherche dans le dictionnaire 
		  Employe monEmploye = monDictionnaire.get("IBA");
		  
		  System.out.println(monEmploye);
		  
		  Set <String> monSet = monDictionnaire.keySet();
		  System.out.println(monSet);
		  
		  
	}		
}