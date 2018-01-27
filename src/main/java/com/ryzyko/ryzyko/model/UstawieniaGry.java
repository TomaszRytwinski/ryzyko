package com.ryzyko.ryzyko.model;

public class UstawieniaGry {
	
	private boolean losowaniePrzedGra;
	private boolean klasyk;
	private int czasNaKolejke;
	//lista polaczen
	public int dominacja;
	private int gracze = 6;
	private int iloscPol = 48;
	private boolean ojk;
	private boolean hawaje;
	private boolean falklandy;
	private boolean svalbard;
	private boolean filipiny;
	private boolean nowaZelandia;
	private int amerykaPln;
	private int amerykaPld;
	private int afryka;
	private int azja;
	private int europa;
	private int australia;
	
	
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

	public boolean isLosowaniePrzedGra() {
		return losowaniePrzedGra;
	}

	public void setLosowaniePrzedGra(boolean losowaniePrzedGra) {
		this.losowaniePrzedGra = losowaniePrzedGra;
	}

	public boolean isKlasyk() {
		return klasyk;
	}

	public void setKlasyk(boolean klasyk) {
		this.klasyk = klasyk;
	}

	public int getDominacja() {
		return dominacja;
	}

	public void setDominacja(int dominacja) {
		this.dominacja = dominacja;
	}

	public int getAmerykaPln() {
		return amerykaPln;
	}

	public void setAmerykaPln(int amerykaPln) {
		this.amerykaPln = amerykaPln;
	}

	public int getAmerykaPld() {
		return amerykaPld;
	}

	public void setAmerykaPld(int amerykaPld) {
		this.amerykaPld = amerykaPld;
	}

	public int getAfryka() {
		return afryka;
	}

	public void setAfryka(int afryka) {
		this.afryka = afryka;
	}

	public int getAzja() {
		return azja;
	}

	public void setAzja(int azja) {
		this.azja = azja;
	}

	public int getEuropa() {
		return europa;
	}

	public void setEuropa(int europa) {
		this.europa = europa;
	}

	public int getAustralia() {
		return australia;
	}

	public void setAustralia(int australia) {
		this.australia = australia;
	}
	
}
