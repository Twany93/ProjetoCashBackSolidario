package br.com.generation.CashBackSolidario;

public class Ongs {

	String nome;

	void calcularCashback(String nome, double valorCashBack) {

		// ajustar resultado para que apare�a apenas 2 casas decimais depois da virgula
		System.out.println("\n------------VALOR DE CASHBACK--------");
		System.out.println(nome + " voc� possui um CashBack de " + "R$ " + valorCashBack);
		// fimcalcularCashBack
	}

}// fim calcularCashBack
