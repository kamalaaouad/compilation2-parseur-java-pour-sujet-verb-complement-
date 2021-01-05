package tokenmanager;

import java.util.StringTokenizer;

public class TokenManager {
	private StringTokenizer entree;
	public TokenManager(String entree ) {
		this.entree=new StringTokenizer(entree);
	}
	public String suivant() {
		
		while(entree.hasMoreTokens()) {
			return entree.nextToken();
		}
		return "#";
	}
}
