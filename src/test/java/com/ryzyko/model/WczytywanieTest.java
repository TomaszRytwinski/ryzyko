package com.ryzyko.model;


import org.junit.Assert;
import org.junit.Test;

import com.ryzyko.ryzyko.model.UstawieniaGry;
import com.ryzyko.ryzyko.model.WczytywanieUstawien;


public class WczytywanieTest {

	@Test
	public void test() throws IllegalArgumentException, IllegalAccessException  {
		
		UstawieniaGry ustawieniagry = new UstawieniaGry();
		WczytywanieUstawien wczytywanieustawien = new WczytywanieUstawien();

		
		
		wczytywanieustawien.wczytywanieUstawienDomyslnych();

	
		Assert.assertEquals(true, ustawieniagry.isLosowaniePrzedGra());
		
	}

}
