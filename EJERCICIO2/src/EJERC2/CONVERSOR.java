package EJERC2;

public class CONVERSOR {
private double celsius;
private int km, seg;
public CONVERSOR(double celsius) {
	this.celsius = celsius;
}
public CONVERSOR(int km) {

	this.km = km;
}
public CONVERSOR(int seg,  boolean flag) {

	this.seg = seg;
}
public double convertir(double celsius) {
	return celsius*9/5+32;
	
}
public double convertir(int km) {
	return km*0.621371;
	
}
public String convertir(int seg, boolean abc) {
	int min=seg/60; //minutos
	int res=seg%60; //residuo - segundos
	return min + " minutos(s)" + " y " +res+ " segundos" ;
	
}
}
