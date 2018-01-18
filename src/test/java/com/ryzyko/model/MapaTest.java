package com.ryzyko.model;



import org.junit.Assert;
import org.junit.Test;

import com.ryzyko.ryzyko.model.Mapa;
import com.ryzyko.ryzyko.model.Nazwy;

public class MapaTest {

	@Test
	public void test() {
		
		Mapa mapa = new Mapa();
		mapa.ustawNazwyIKontynent();
		Assert.assertEquals(Nazwy.AMERYKAPLN[0], mapa.pola[0].getNazwa());
	}

}
