package test;

import parseur.Parseur;
import tokenmanager.TokenManager;

public class Main {
	public static void main(String[] args) {
		System.out.println("=======Aaouad Kamal Grp 03============");
		String chaine="la souris mange le pain";
		TokenManager tm=new TokenManager(chaine);
		Parseur p= new Parseur(tm);
		if(p.valider())
			System.out.println(chaine +" \"est valide\"");
		else
			System.out.println(chaine +" n'est pas valide");
	}
}
