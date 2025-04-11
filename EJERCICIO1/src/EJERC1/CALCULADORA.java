package EJERC1;

public class CALCULADORA {
private int n1, n2, n3;
private double num1, num2;
public CALCULADORA(int n1, int n2) {
	
	this.n1 = n1;
	this.n2 = n2;
}
public CALCULADORA(int n1, int n2, int n3) {
	
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;
}
public CALCULADORA(double num1, double num2) {
	
	this.num1 = num1;
	this.num2 = num2;
}
public int sumar(int n1, int n2) {
	return n1+n2;
}
public int sumar(int n1, int n2, int n3) {
	return n1+n2+n3;
}	
public double sumar(double num1, double num2) {
	return num1+num2;
}	
}

/*1. Ejercicio: Crea una clase Calculadora con un método llamado sumar que tenga tres versiones
sobrecargadas:
• Una que reciba dos enteros.
• Otra que reciba tres enteros.
• Otra que reciba dos números de tipo double*/