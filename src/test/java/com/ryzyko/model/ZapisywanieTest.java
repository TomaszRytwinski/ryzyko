package com.ryzyko.model;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.junit.Test;

import com.ryzyko.ryzyko.model.UstawieniaGry;

public class ZapisywanieTest {

	@Test
	public void test()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		UstawieniaGry ustawieniaGry = new UstawieniaGry();
		Field polaZmiennych[] = ustawieniaGry.getClass().getDeclaredFields();
		String[] polaWartosci = new String[polaZmiennych.length];
		ArrayList<String> potrebneUstawienia = new ArrayList<String>();
		ArrayList<String> zbedneUstawienia = new ArrayList<String>();

		
		try {
			BufferedReader niePotrzebneUstawienia = new BufferedReader(new FileReader("potrzebneUstawienia.txt"));
			
			String zbedneUstawienie = null;
			
			while ((zbedneUstawienie = niePotrzebneUstawienia.readLine()) != null) {
				String odrzuconeUstawienia = zbedneUstawienie;
				for(int i = 0; i < polaZmiennych.length; i++) {
					if ((polaZmiennych[i].getName().equals(odrzuconeUstawienia))) {
						potrebneUstawienia.add(odrzuconeUstawienia);
					}
				}
			}
			
			niePotrzebneUstawienia.close();
			
			}
			catch (IOException ex) {
				System.out.println(ex);
			}

		for (int i = 0; i < polaZmiennych.length; i++) {
			polaWartosci[i] = polaZmiennych[i].getName();
		}

		try {

			File plik = new File("ustawienia.txt");
			if (!plik.exists()) {
				plik.createNewFile();
			}

			BufferedWriter ustawienia = new BufferedWriter(new FileWriter("ustawienia.txt"));

			String wartoscDoZapisania = "";

			for (int i = 0; i < polaZmiennych.length; i++) {
				Field poleWartosc = ustawieniaGry.getClass().getDeclaredField(polaWartosci[i]);
				poleWartosc.setAccessible(true);
				Object wartosc = poleWartosc.get(ustawieniaGry);
				wartoscDoZapisania = wartosc.toString();
				if (!(polaWartosci[i].equals("czasNaKolejke") || polaWartosci[i].equals("gracze") || polaWartosci[i].equals("iloscPol"))) {
					ustawienia.write(polaWartosci[i] + " " + wartoscDoZapisania);
					ustawienia.newLine();
				}

				System.out.println(polaWartosci[i] + " " + wartoscDoZapisania);
			}

			ustawienia.close();

		} catch (IOException ex) {
			System.out.println(ex);
		}
		
//		for (int i = 0; i < zbedneUstawienia.size(); i++){
			System.out.println(potrebneUstawienia);
			System.out.println(zbedneUstawienia);
			
//		}
	}

}
