package maquinasDeCafe;

public abstract class maquinasDeCafe {

	private int gramosDeCafe;
	private static final int GRAMOS_POR_CAFE =10;
	private static final int GRAMOS_iNICIAL_DE_CAFE =1000;
	public maquinasDeCafe() {
			this.gramosDeCafe = GRAMOS_iNICIAL_DE_CAFE;
	}
	
	public VasoDeCafe servirCafe() {
		if (this.puedeServir()) {
			this.restarCafe();
			return new VasoDeCafe(true);
		}
		return new VasoDeCafe(false);
	}
	
	protected void restarCafe() {
		this.gramosDeCafe -= GRAMOS_POR_CAFE;
	}
	protected boolean puedeServir() {
		return this.gramosDeCafe >= GRAMOS_POR_CAFE;
	}

	public int getGramosDeCafe() {
		// TODO Auto-generated method stub
		return this.gramosDeCafe;
	}
}
