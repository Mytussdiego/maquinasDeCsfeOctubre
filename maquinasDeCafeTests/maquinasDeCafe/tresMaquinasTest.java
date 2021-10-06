package maquinasDeCafe;

import org.junit.Test;

public class tresMaquinasTest {

	@Test
	public void test() {
		maquinasDeCafe maquinaEco = new maquinaEconomica();
		maquinasDeCafe maquinaEsta = new maquinaEstafadora();
		maquinasDeCafe maquinaPre = new maquinaPremium();
		
		maquinasDeCafe [] maquinas = new maquinasDeCafe[3];
		
		maquinas[0] = maquinaEco;
		maquinas[1] = maquinaEsta;
		maquinas[2] = maquinaPre;
		
		for (maquinasDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
		}
		for (maquinasDeCafe cadaUna : maquinas) {
			System.out.println(cadaUna.servirCafe());
	}

	}
}
