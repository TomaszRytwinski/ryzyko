package com.ryzyko.ryzyko.model;

import java.util.List;

public class Pole {
	private String nazwa;
	private int iloscZawodnikow;
	private int gracz;
	private String kontynent;
	private int id;
	private List<Pole> granice;
	
	public String getNazwa(){
		return nazwa;
	}
	public void setNazwa(String nazwa){
		this.nazwa = nazwa;
	}
	public int getIloscZawodnikow(){
		return iloscZawodnikow;
	}
	public void setIloscZawodnikow(int iloscZawodnikow){
		this.iloscZawodnikow = iloscZawodnikow;
	}
	public int getGracz(){
		return gracz;
	}
	public void setGracz(int gracz){
		this.gracz = gracz;
	}
	public String getKontynent(){
		return kontynent;
	}
	public void setKontynent(String kontynent){
		this.kontynent = kontynent;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public List<Pole> getGranice(){
		return granice;
	}
	public void setGranice(List<Pole> granice){
		this.granice = granice;
	}
}


