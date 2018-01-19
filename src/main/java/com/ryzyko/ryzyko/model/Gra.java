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
		UstawieniaGry dodatkowePola = new UstawieniaGry();
		
		Random generator = new Random();
		int pustePola = iloscPol;
		int wylosowanePole;
		int przypisanePole;
		int gracz = 0;
		
		ArrayList<Integer> listaPol = new ArrayList<Integer>();
		
		for (int i = 0; i < 48; i++)
			listaPol.add(i);
		
		if (dodatkowePola.isOjk() == false)
			listaPol.remove(2);
		
		if (dodatkowePola.isHawaje() == false)
			listaPol.remove(10);
		
		if (dodatkowePola.isFalklandy() == false)
			listaPol.remove(15);
		
		if (dodatkowePola.isSvalbard() == false)
			listaPol.remove(34);
		
		if (dodatkowePola.isFilipiny() == false)
			listaPol.remove(43);
		
		if (dodatkowePola.isNowaZelandia() == false)
			listaPol.remove(47);
		
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
