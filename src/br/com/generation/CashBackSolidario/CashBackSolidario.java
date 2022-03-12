package br.com.generation.CashBackSolidario;

import java.util.Scanner;

public class CashBackSolidario {

//Variaveis Globais
	static String nome;
	static double valorDaCompra, valorCashBack;
	static int EscolhaDoar, EscolhaProjeto;
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Ongs ong = new Ongs();

		imprimirTituloApp();

		// Solicitação dos dados do cliente

		cliente.nomecliente();
		nome = leia.next();
		cliente.valordoacao(nome);
		valorDaCompra = leia.nextDouble();

		// fim da solicitação

		// Calculo e impressão do valor do cashback
		valorCashBack = valorDaCompra * 0.10;
		ong.calcularCashback(nome, valorCashBack);
		// fim calculo

		// Decisao de doar
		cliente.decisaoDeDoarCashBack(nome);
		EscolhaDoar = leia.nextInt();
		cliente.decisaoDoarFinal(nome, EscolhaDoar, valorCashBack);
		// fim decisão

		// Decisão de escolher projeto
		EscolhaProjeto = leia.nextInt();
		cliente.escolhaProjeto(EscolhaProjeto);
		// fim decisão

	}
	// fim main

	public static void imprimirTituloApp() {

		System.out.println("///////////////////////////////");
		System.out.println("       CASH BACK SOLIDÁRIO     ");
		System.out.println("//////////////////////////////");
		System.out.println(
				"Olá agora que finalizou a compra no nosso site te convido a conhecer o nosso projeto de cashback solidario");

	}


}
