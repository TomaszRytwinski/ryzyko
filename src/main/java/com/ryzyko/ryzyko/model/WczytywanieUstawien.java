package com.ryzyko.ryzyko.model;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class WczytywanieUstawien {
	
	UstawieniaGry ustawieniaGry = new UstawieniaGry();
	Field[] polaZmiennych = ustawieniaGry.getClass().getDeclaredFields();
	String[] polaWartosci = new String[polaZmiennych.length];
	ArrayList<String> zbedneUstawienia = new ArrayList<String>();
	
	public void wczytywanieUstawienDomyslnych() throws IllegalArgumentException, IllegalAccessException {
		
		try {
			
			File plik = new File("ustawieniaDomyslne.txt");
			if (!plik.exists()) {
				throw new IOException("Nie znaleziono pliku");
			}
			
			BufferedReader ustawieniaDomyslne = new BufferedReader(new FileReader("ustawieniaDomyslne.txt"));
			
			String wczytaneUstawieniaDomysnlne = "";		
			while ((wczytaneUstawieniaDomysnlne = ustawieniaDomyslne.readLine()) != null) {
				String[] wczytaneZmienne = wczytaneUstawieniaDomysnlne.split(" ");
				for (int i = 0; i < polaZmiennych.length; i++) {
					if (polaZmiennych[i].getName().equals(wczytaneZmienne[0])) {
						if (wczytaneZmienne[1].equals("true") || wczytaneZmienne[1].equals("false")) {
							polaZmiennych[i].setAccessible(true);
							polaZmiennych[i].set(ustawieniaGry, Boolean.parseBoolean(wczytaneZmienne[1]));
						}
						else {
							polaZmiennych[i].setAccessible(true);
							polaZmiennych[i].set(ustawieniaGry, Integer.parseInt(wczytaneZmienne[1]));
						}
					}
				}
			}
			ustawieniaDomyslne.close();
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
	}
	
	public void wczytywanieUstawien() throws IllegalArgumentException, IllegalAccessException {
		
		try {
			
			File plik = new File("ustawienia.txt");
			if (!plik.exists()) {
				throw new IOException("Nie znaleziono pliku");
			}			
			
			BufferedReader ustawienia = new BufferedReader(new FileReader("ustawienia.txt"));
			
			String wczytaneUstawienia = "";
						
			while ((wczytaneUstawienia = ustawienia.readLine()) != null) {
				String[] wczytaneZmienne = wczytaneUstawienia.split(" ");
				for (int i = 0; i < polaZmiennych.length; i++) {
					if (polaZmiennych[i].getName().equals(wczytaneZmienne[0])) {
						if (wczytaneZmienne[1].equals("true") || wczytaneZmienne[1].equals("false")) {
							polaZmiennych[i].setAccessible(true);
							polaZmiennych[i].set(ustawieniaGry, Boolean.parseBoolean(wczytaneZmienne[1]));
						}
						else {
							polaZmiennych[i].setAccessible(true);
							polaZmiennych[i].set(ustawieniaGry, Integer.parseInt(wczytaneZmienne[1]));
						}
					}
				}
			}			
			ustawienia.close();
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
	}
	
	public void zapisywanieUstawien() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		for (int i = 0; i < polaZmiennych.length; i++) {
			polaWartosci[i] = polaZmiennych[i].getName();
		}
		
		try {
			
			File plik = new File("ustawienia.txt");
			if (!plik.exists()) {
				plik.createNewFile();
			}
			
			BufferedWriter ustawienia = new BufferedWriter(new FileWriter("ustawienia.txt"));
			
			String wartoscDoZapisania = null;
						
			for (int i = 0; i < polaZmiennych.length; i++){
				Field poleWartosc = ustawieniaGry.getClass().getDeclaredField(polaWartosci[i]);
				poleWartosc.setAccessible(true);
				Object wartosc = poleWartosc.get(ustawieniaGry);
				wartoscDoZapisania = wartosc.toString();
				if (!(polaWartosci[i].equals("czasNaKolejke") || polaWartosci[i].equals("gracze") || polaWartosci[i].equals("iloscPol"))) {
					ustawienia.write(polaWartosci[i] + " " + wartoscDoZapisania);
					ustawienia.newLine();
				}
			}
					
			ustawienia.close();
			
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}
	public void niePotrzebneUstawienia() {
		
		try {
		BufferedReader niePotrzebneUstawienia = new BufferedReader(new FileReader("potrzebneUstawienia.txt"));
		
		String zbedneUstawienie = null;
		
		while ((zbedneUstawienie = niePotrzebneUstawienia.readLine()) != null) {
			String odrzuconeUstawienia = zbedneUstawienie;
			for(int i = 0; i < polaZmiennych.length; i++) {
				if (!(polaZmiennych[i].getName().equals(odrzuconeUstawienia))) {
					zbedneUstawienia.add(odrzuconeUstawienia);
				}
			}
		}
		
		niePotrzebneUstawienia.close();
		
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
	}
}
