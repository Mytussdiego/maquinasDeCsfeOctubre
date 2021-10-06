package maquinasDeCafe;

public class maquinaEconomica extends maquinasDeCafe {

	private int contadorDeServidos =0;
	
	@Override
	public void restarCafe() {
		this.contadorDeServidos ++;
		if(this.contadorDeServidos %3 ==0) {
			super.restarCafe();
			this.contadorDeServidos=0;
		}
		
	}
}
