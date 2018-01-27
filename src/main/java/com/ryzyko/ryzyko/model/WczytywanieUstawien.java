package com.ryzyko.ryzyko.model;

import java.io.*;
import java.lang.reflect.Field;

public class WczytywanieUstawien {
	
	UstawieniaGry ustawieniaGry = new UstawieniaGry();
	Field polaZmiennych[] = ustawieniaGry.getClass().getDeclaredFields();
	
	public void wczytywanieUstawienDomyslnych() throws IllegalArgumentException, IllegalAccessException {
		
		try {
			
			File plik = new File("ustawieniaDomyslne.txt");
			if (!plik.exists()) {
				throw new IOException("Nie znaleziono pliku");
			}
			
			BufferedReader ustawieniaDomyslne = new BufferedReader(new FileReader("ustawieniaDomyslne.txt"));
			
			String wczytaneUstawieniaDomysnlne = "";		
			while ((wczytaneUstawieniaDomysnlne = ustawieniaDomyslne.readLine()) != null) {
				String wczytaneZmienne[] = wczytaneUstawieniaDomysnlne.split(" ");
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
				String wczytaneZmienne[] = wczytaneUstawienia.split(" ");
				for (int i = 0; i < polaZmiennych.length; i++) {
					if (polaZmiennych[i].getName().equals(wczytaneZmienne[0])) {
						if (wczytaneZmienne[1].equals("true")) {
							polaZmiennych[i].setAccessible(true);
							polaZmiennych[i].set(ustawieniaGry, Boolean.parseBoolean(wczytaneZmienne[1]));
						}
						else if (wczytaneZmienne[1].equals("false")) {
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
	
	public void zapisywanieUstawien(){
		
		try {
			
			File plik = new File("ustawienia.txt");
			if (!plik.exists()) {
				throw new IOException("Nie znaleziono pliku");
			}
			
			BufferedWriter ustawienia = new BufferedWriter(new FileWriter("ustawienia.txt"));
			
			
			
			ustawienia.close();
			
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
