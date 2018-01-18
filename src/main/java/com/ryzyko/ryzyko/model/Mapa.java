package com.ryzyko.ryzyko.model;

public class Mapa {
	
	public Pole[] pola = new Pole[48];
	
	private String AMERYKAPLN = "AMERYKAPLN";
	private String AMERYKAPLD = "AMERYKAPLD";
	private String AFRYKA = "AFRYKA";
	private String AZJA = "AZJA";
	private String EUROPA = "EUROPA";
	private String AUSTRALIA = "AUSTRALIA";
	
	public Mapa(UstawieniaGry ustawienia){
		
		ustawNazwyIKontynent();
		
	}
	
	public Mapa(){
	
	}
	
	public void ustawNazwyIKontynent(){
		int j=0;
		for(int i=0;i<Nazwy.AMERYKAPLN.length;i++){
			pola[j] = new Pole();
			pola[j].setKontynent(AMERYKAPLN);
			pola[j].setNazwa(Nazwy.AMERYKAPLN[i]);
			j++;
			
		}
		
		for(int i=0;i<Nazwy.AMERYKAPLD.length;i++){
			pola[j] = new Pole();
			pola[j].setKontynent(AMERYKAPLD);
			pola[j].setNazwa(Nazwy.AMERYKAPLD[i]);
			j++;
		}
		
		for(int i=0;i<Nazwy.AFRYKA.length;i++){
			pola[j] = new Pole();
			pola[j].setKontynent(AFRYKA);
			pola[j].setNazwa(Nazwy.AFRYKA[i]);
			j++;
		}
		
		for(int i=0;i<Nazwy.AZJA.length;i++){
			pola[j] = new Pole();
			pola[j].setKontynent(AZJA);
			pola[j].setNazwa(Nazwy.AZJA[i]);
			j++;
		}
		
		for(int i=0;i<Nazwy.EUROPA.length;i++){
			pola[j] = new Pole();
			pola[j].setKontynent(EUROPA);
			pola[j].setNazwa(Nazwy.EUROPA[i]);
			j++;
		}
		
		for(int i=0;i<Nazwy.AUSTRALIA.length;i++){
			pola[j] = new Pole();
			pola[j].setKontynent(AUSTRALIA);
			pola[j].setNazwa(Nazwy.AUSTRALIA[i]);
			j++;
		}
	}

}
