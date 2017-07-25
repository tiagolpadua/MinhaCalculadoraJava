package com.caelum.calculadora;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println("calc.soma(1, 2):\t\t" + calc.soma(1, 2));
		System.out.println("calc.incrementa(3):\t" + calc.incrementa(3));
	}
}
