package maquinasDeCafe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class maquinaPremiumTest {
	
	maquinasDeCafe maquina;
	@Before
	public void setUp() {
		maquina = new maquinaPremium();
	}

	@Test
	public void queDevuelveUnVasoAlServir() {
		VasoDeCafe vaso = maquina.servirCafe();
		Assert.assertNotNull(vaso);
	}
	
	@Test
	public void quePuedeServirUnCafe() {
				Assert.assertTrue(maquina.puedeServir());
	}
	
	@Test
	public void queSeAgotaElCafe() {
		for (int i= 0; i <100; i++) {
			maquina.servirCafe();
		}
		Assert.assertFalse(maquina.puedeServir());
	}

}
