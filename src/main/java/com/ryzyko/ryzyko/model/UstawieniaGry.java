package com.ryzyko.ryzyko.model;

public class UstawieniaGry {
	
	private boolean losowaniePrzedGra;
	private boolean klasyk;
	private int czasNaKolejke;
	//lista polaczen
	private int dominacja;
	private int gracze = 6;
	private int iloscPol = 48;
	
	public UstawieniaGry(){
		
	}
	
	private void domyslneUstawienia(){
		
	}
	
	private void ustawieniaBaza(){
		
	}
	
	public int getGracze(){
		return gracze;
	}
	
	public void setGracze(int gracze){
		this.gracze = gracze;
	}
	
	public int getIloscPol(){
		return iloscPol;
	}
	
	public void setIloscPol(int iloscPol){
		this.iloscPol = iloscPol;
	}

}
