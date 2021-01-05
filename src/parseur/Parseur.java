package parseur;

import java.util.Stack;
import java.util.StringTokenizer;

import tokenmanager.TokenManager;

public class Parseur {
	private TokenManager tm;
	private Stack<String> pile;
	public String tc;
	public Parseur(TokenManager tm) {
		this.tm=tm;
		pile = new Stack<>();
		pile.push("$");
		pile.push("P");
		avancer();
	}
	public void avancer() {
		this.tc =tm.suivant();
	}
	public boolean valider() {
		boolean termine= false;
		while(!termine) {
			System.out.println(pile.peek()+" "+tc);
			
			switch(pile.peek()) {
			case "P":
				if(tc.equals("le")) {
					pile.pop();
					pile.push("C");
					pile.push("V");
					pile.push("S");
				}else if(tc.equals("la")) {
					pile.pop();
					pile.push("C");
					pile.push("V");
					pile.push("S");
				}else
					termine=true;
				break;
			case "S":
				if(tc.equals("la")) {
					pile.pop();
					pile.push("N");
					pile.push("A");
					
				}else if(tc.equals("le")) {
					pile.pop();
					pile.push("N");
					pile.push("A");
					
				}else
					termine=true;
				break;
			case "V":
				if(tc.equals("mange")) {
					pile.pop();
					avancer();;
				}else
					termine=true;
				break;
			case "C":
				if(tc.equals("le")) {
					pile.pop();
					pile.push("N");
					pile.push("A");
				}else if(tc.equals("la")){
					System.out.println("rah dkhel");
					pile.pop();
					pile.push("N");
					pile.push("A");
				}else
					termine=true;
				break;
			case "A":
				if(tc.equals("le")) {
					pile.pop();
					avancer();
				}else if(tc.equals("la")) {
					pile.pop();
					avancer();
				}else
				termine=true;
				break;
			case "N":
				if(tc.equals("souris")) {
					pile.pop();
					avancer();
				}else if(tc.equals("pain")) {
					pile.pop();
					avancer();
				}else
				termine=true;
				break;
			default:
				termine=true;
				break;
			}
		}
		return tc=="#" && pile.peek()=="$";
	}
}
