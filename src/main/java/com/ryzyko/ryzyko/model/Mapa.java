package com.ryzyko.ryzyko.model;

public class Mapa {
	
	private Pole[] pola = new Pole[47];
	
	private String AMERYKAPLN = "AMERYKAPLN";
	private String AMERYKAPLD = "AMERYKAPLD";
	private String AFRYKA = "AFRYKA";
	private String AZJA = "AZJA";
	private String EUROPA = "EUROPA";
	private String AUSTRALIA = "AUSTRALIA";
	
	public Mapa(UstawieniaGry ustawienia){
		
		ustawNazwyIKontynent();
		
	}
	
	private void ustawNazwyIKontynent(){
		int j=0;
		for(int i=0;i<Nazwy.AMARYKAPLN.length;i++){
			j=i;
			pola[j] = new Pole();
			pola[j].setKontynent(AMERYKAPLN);
			pola[j].setNazwa(Nazwy.AMARYKAPLN[i]);
			
		}
		
		for(int i=0;i<Nazwy.AMERYKAPLD.length;i++){
			j=i;
			pola[j] = new Pole();
			pola[j].setKontynent(AMERYKAPLD);
			pola[j].setNazwa(Nazwy.AMERYKAPLD[i]);
		}
		
		for(int i=0;i<Nazwy.AFRYKA.length;i++){
			j=i;
			pola[j] = new Pole();
			pola[j].setKontynent(AFRYKA);
			pola[j].setNazwa(Nazwy.AFRYKA[i]);
		}
		
		for(int i=0;i<Nazwy.AZJA.length;i++){
			j=i;
			pola[j] = new Pole();
			pola[j].setKontynent(AZJA);
			pola[j].setNazwa(Nazwy.AZJA[i]);
		}
		
		for(int i=0;i<Nazwy.EUROPA.length;i++){
			j=i;
			pola[j] = new Pole();
			pola[j].setKontynent(EUROPA);
			pola[j].setNazwa(Nazwy.EUROPA[i]);
		}
		
		for(int i=0;i<Nazwy.AUSTRALIA.length;i++){
			j=i;
			pola[j] = new Pole();
			pola[j].setKontynent(AUSTRALIA);
			pola[j].setNazwa(Nazwy.AUSTRALIA[i]);
		}
	}

}
