package com.juaracoding.ujianminggu3;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.Assert.*;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;

import com.juaracoding.ujianminggu3.fungsi.Kolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class TestKolam {
	static final Logger log = getLogger(lookup().lookupClass());
Kolam kolam;
	@Before
	public void setUp() throws Exception {
		kolam = new Kolam();
	}
		
	@Test
	@FileParameters("src/test/resources/kelkolam.csv")
	public void testKelKolam(double a, double b, double c, double expect) {
		log.debug("test");
		double actual = kolam.KelKolam(a,b,c);
		assertEquals(expect, actual, 0.0);
		
		
	}

	
	@Test
	public void testKelKolamBukanAngka() {
		log.debug("test");
		String aBukanAngka = "A";
		String bBukanAngka = "B";
		String cBukanAngka = "C";
		double converta = Double.parseDouble(aBukanAngka);
		double convertb = Double.parseDouble(bBukanAngka);
		double convertc = Double.parseDouble(cBukanAngka);
		
		double actual = kolam.KelKolam(converta, convertb, convertc);
		
		String expect = "A";
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
	}
	@Test
	public void testKelKolamAngkaNegatif() {
		log.debug("test");
		double a = 8;
		double b = -5;
		double c = 1;
		
		double actual = kolam.KelKolam(a, b, c);
		assertEquals(16, actual, 0.0);
		
	}
	@Test
	public void testKelKolamAngkaNull() {
		log.debug("test");
		double a = 0;
		double b = 0;
		double c = 0;
		Double aNull = null;
		Double bNull = null;
		Double cNull = null;
		
		double actual = kolam.KelKolam(a, b, c);
		assertNull(aNull);
		assertNull(bNull);
		assertNull(cNull);
		assertEquals(0, actual, 0.0);
	}
	@Test
	@FileParameters("src/test/resources/volkolam.csv")
	public void testVolKolam(double x, double y, double z, double expect) {
		log.debug("test");
		double actual = kolam.VolKolam(x, y, z);
		assertEquals(expect, actual, 0.0);
	}
	@Test
	public void testVolKolamBukanAngka() {
		log.debug("test");
		String xBukanAngka = "A";
		String yBukanAngka = "B";
		String zBukanAngka = "C";
		double convertx = Double.parseDouble(xBukanAngka);
		double converty = Double.parseDouble(yBukanAngka);
		double convertz = Double.parseDouble(zBukanAngka);
		
		double actual = kolam.VolKolam(convertx, converty, convertz);
		
		String expect = "A";
		assertEquals(Double.parseDouble(expect), actual, 0.0);
	}
	@Test
	public void testVolKolamAngkaNegatif() {
		log.debug("test");
		double x = 9;
		double y = -5;
		double z = -1;
		
		double actual = kolam.VolKolam(x, y, z);
		assertEquals(45, actual, 0.0);
		
	}
	@Test
	public void testVolKolamAngkaNull() {
		log.debug("test");
		double x = 0;
		double y = 0;
		double z = 0;
		Double xNull = null;
		Double yNull = null;
		Double zNull = null;
		
		double actual = kolam.VolKolam(x, y, z);
		assertNull(xNull);
		assertNull(yNull);
		assertNull(zNull);
		assertEquals(0, actual, 0.0);
	}
}
