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
import com.juaracoding.ujianminggu3.fungsi.FkeC;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testFkeC {
	static final Logger log = getLogger(lookup().lookupClass());
FkeC fkec;

	@Before
	public void setUp() throws Exception {
		
		fkec = new FkeC();
	}

	@Test
	@FileParameters("src/test/resources/FkeC.csv")

	public void testConvertkec(double a, double expect) {
		
		log.debug("test1");
		double actual = fkec.convertkec(a);
		assertEquals(expect, actual, 0.9);
		
	
		
	}
	@Test
	public void testFkeCBukanAngka() {
		
		
		log.debug("test2");
		String aBukanAngka = "A";
		
		double converta = Double.parseDouble(aBukanAngka);

		
		double actual = fkec.convertkec(converta);
		
		String expect = "A";
		assertEquals(Double.parseDouble(expect), actual, 0.0);
		
		
	}
	
	@Test
	public void testFkeCAngkaNegatif() {
		log.debug("test3");
		double a = 68;
		
		
		double actual = fkec.convertkec(a);
		assertEquals(20, actual, 0.0);
		
	}
	@Test
	public void testFkeCAngkaNull() {
		log.debug("test4");
		double a = 32;
		
		Double aNull = null;
		
		
		double actual = fkec.convertkec(a);
		assertNull(aNull);
		
		assertEquals(0, actual, 0.0);
	}

}
