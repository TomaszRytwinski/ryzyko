package com.ryzyko.ryzyko.model;

public class UstawieniaGry {
	
	private boolean losowaniePrzedGra;
	private boolean klasyk;
	private int czasNaKolejke;
	//lista polaczen
	private int dominacja;
	private int gracze = 6;
	private int iloscPol = 48;
	private boolean ojk = true;
	private boolean hawaje = true;
	private boolean falklandy = true;
	private boolean svalbard = true;
	private boolean filipiny = true;
	private boolean nowaZelandia = true;
	
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

	public boolean isOjk() {
		return ojk;
	}

	public void setOjk(boolean ojk) {
		this.ojk = ojk;
	}

	public boolean isHawaje() {
		return hawaje;
	}

	public void setHawaje(boolean hawaje) {
		this.hawaje = hawaje;
	}

	public boolean isFalklandy() {
		return falklandy;
	}

	public void setFalklandy(boolean falklandy) {
		this.falklandy = falklandy;
	}

	public boolean isSvalbard() {
		return svalbard;
	}

	public void setSvalbard(boolean svalbard) {
		this.svalbard = svalbard;
	}

	public boolean isFilipiny() {
		return filipiny;
	}

	public void setFilipiny(boolean filipiny) {
		this.filipiny = filipiny;
	}

	public boolean isNowaZelandia() {
		return nowaZelandia;
	}

	public void setNowaZelandia(boolean nowaZelandia) {
		this.nowaZelandia = nowaZelandia;
	}
	
}
