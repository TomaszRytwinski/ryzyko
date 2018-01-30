package com.ryzyko.model;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.Test;

import com.ryzyko.ryzyko.model.UstawieniaGry;


public class WczytywanieTest {

	@Test
	public void test() throws IllegalArgumentException, IllegalAccessException  {
		
		UstawieniaGry ustawieniaGry = new UstawieniaGry();
		Field polaZmiennych[] = ustawieniaGry.getClass().getDeclaredFields();
		
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
							continue;
						}
						else {
						polaZmiennych[i].setAccessible(true);
						polaZmiennych[i].set(ustawieniaGry, Integer.parseInt(wczytaneZmienne[1]));
						continue;
						}
					}
				}
			}
			ustawieniaDomyslne.close();
		}
		catch (IOException ex) {
			System.out.println(ex);
		}
		
		boolean losowanieprzedgra = ustawieniaGry.isLosowaniePrzedGra();
		int dominacja = ustawieniaGry.getDominacja();
		int europa = ustawieniaGry.getEuropa();
		boolean falklandy = ustawieniaGry.isFalklandy();
	
		Assert.assertEquals(true, losowanieprzedgra);
		Assert.assertEquals(60, dominacja);
		Assert.assertEquals(6, europa);
		Assert.assertEquals(false, falklandy);
		
	}

}
