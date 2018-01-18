package com.ryzyko.ryzyko.model;

import java.util.ArrayList;
import java.util.Random;

public class Gra {
	
	public Mapa mapa;
	private int iloscGraczy;
	private int iloscPol;
	
	public void nowaGra(){
		UstawieniaGry ustawienia = new UstawieniaGry();
		mapa = new Mapa(ustawienia);
		iloscGraczy = ustawienia.getGracze();
		iloscPol = ustawienia.getIloscPol();
		
//		wybieraniePol();
	}
	
	private void wybieraniePol(){
		
	}
	
	public void losowaniePol(){
		
		Random generator = new Random();
		int pustePola = iloscPol;
		int wylosowanePole;
		int przypisanePole;
		int gracz = 0;
		
		ArrayList<Integer> listaPol = new ArrayList<Integer>();
		
		for (int i = 0; i < iloscPol; i++)
			listaPol.add(i);
		
		while (pustePola > 0){
			wylosowanePole = generator.nextInt(listaPol.size());
			przypisanePole = listaPol.get(wylosowanePole);
			mapa.pola[przypisanePole].setGracz(gracz);
			
			gracz++;
			if (gracz == iloscGraczy)
				gracz = 0;
			
			listaPol.remove(wylosowanePole);
			
			pustePola--;
		}
		
	}
	
	public void fazaDodawania(){
		
	}
	
	public void fazaAtakowania(){
		
	}
	
	public void fazaPrzenoszenia(){
		
	}
	

}
