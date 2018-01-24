package com.ryzyko.model;


import org.junit.Assert;
import org.junit.Test;

import com.ryzyko.ryzyko.model.Gra;
import com.ryzyko.ryzyko.model.Pole;



public class GraTest {

	@Test
	public void test() {
		
		int[] gracze = new int[6];
		Gra gra = new Gra();
		gra.nowaGra();
		gra.losowaniePol();
		for(int i=0;i<gracze.length;i++){
			gracze[i] = policzPola(i,gra.mapa.pola);
		}
		Assert.assertNotNull(gra.mapa.pola[10].getGracz());
		Assert.assertEquals(8, gracze[0]);
		Assert.assertEquals(8, gracze[1]);
		Assert.assertEquals(8, gracze[2]);
		Assert.assertEquals(8, gracze[3]);
		Assert.assertEquals(8, gracze[4]);
		Assert.assertEquals(8, gracze[5]);
	}
	
	private int policzPola(int gracz, Pole[] pola){
		int iloscPol=0;
		for(int i=0;i<pola.length;i++){
			if(pola[i].getGracz()==gracz){
				iloscPol++;
			}
		}
		return iloscPol;
	}

}
