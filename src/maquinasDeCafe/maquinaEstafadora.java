package maquinasDeCafe;

public class maquinaEstafadora extends maquinaPremium {
private boolean yaEstafe =true;


@Override
public VasoDeCafe servirCafe() {
	if(yaEstafe) {
		this.yaEstafe = false;
		return super.servirCafe();
			}	else	{
		this.yaEstafe=true;
		return new VasoDeCafe(false);
	}
}
}
