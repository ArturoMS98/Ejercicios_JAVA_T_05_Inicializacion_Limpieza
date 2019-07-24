/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t_05_ej10;

/**
 *
 * @author manolo
 * 
 * Ejemplo 10: Flor_busca_fallos.java
 *Invocando a constructores con "this"
 */
public class UT5_10_FlorBuscaFallos{
	int numeroPetalos = 0;
	String s = "null";
	UT5_10_FlorBuscaFallos(int petalos){
		numeroPetalos = petalos;
		System.out.println("Constructor. Parametro entero solo, Numero de petalos = " + numeroPetalos);
	}
	UT5_10_FlorBuscaFallos(String ss){
		System.out.println("Constructor. Parametro cadena solo, s = " + ss);
		s = ss;
	}
	UT5_10_FlorBuscaFallos(String s, int petalos){
		this(petalos);
		//this(s);  
		this.s = s; // Otro uso de "this"
		System.out.println("Cadena y entero parametros");
	}
	UT5_10_FlorBuscaFallos(){
		this("Hola", 47);
		System.out.println("Constructor por defecto (sin parametros)");
	}
	void print(){
		this(11);
		System.out.println("Numero de petalos = " + numeroPetalos + ", s = " + s);
	}
	
	public static void main(String[] args){
		UT5_10_FlorBuscaFallos x = new UT5_10_FlorBuscaFallos();
		print();
	}
}