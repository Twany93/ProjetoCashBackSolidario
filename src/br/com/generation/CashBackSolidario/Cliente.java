package br.com.generation.CashBackSolidario;

public class Cliente {

	String nome;
	Case_4 caso4 = new Case_4();
	void nomecliente() {
		System.out.println("\n---------DIGITE SEUS DADOS--------");
		System.out.println("Informe o seu nome: ");

	}

	void valordoacao(String nome) {
		System.out.println(nome + " informe o valor de sua compra: ");
	}

	void decisaoDeDoarCashBack(String nome) {
		System.out.println("\n--------------GOSTARIA DE DOAR SEU CASHBACK----------------");
		System.out
				.println(nome + " gostaria de doar seu cash back para uma causa social? \n" + "Digite: 1-N�o ou 2-Sim");

	}

	void decisaoDoarFinal(String nome, int EscolhaDoar, double valorCashBack) {

		switch (EscolhaDoar) {

		default:
			System.out.println(" C�digo inv�lido ");
			break;
		case 1:
			System.out.println(
					"----------------------------------------CASHBACK LIBERADO---------------------------------------");
			System.out.println(nome + " Voc� possui R$" + valorCashBack
					+ " em CashBack e poder� ser utilizado em sua pr�xima compra!");
			break;

		case 2:
			System.out.println("-------------------DOA��O DE CASHBACK--------------------");
			System.out.println(nome + " Escolha um dos projetos listados abaixo para doar seu CashBack Solid�rio: \n"
					+ "\n digite 1-Amigos do Bem- Visa acabar com a fome no Sert�o Nordestino."
					+ "\n digite 2-Projeto Instituto Luisa Mell- Visa resgatar animais feridos ou em situa��o de risco."
					+ "\n digite 3-Projeto Mar limpo- Visa limpar os oceanos , conscientizar a popula��o."
					+ "\n digite 4-Responda a pesquisa e doe por compatibilidade.");
		}// fim switch (EscolhaDoar)
	}// fim decisaoDoarFinal

	void escolhaProjeto(int EscolhaProjeto) {

		switch (EscolhaProjeto) {
		
		default:

			System.out.println(" c�digo inv�lido ");
			break;
			
		case 1:

			System.out.println("---------OBRIGADE PELA SUA DOA��O PARA OS AMIGOS DO BEM--------------");
			System.out.println(" O Sert�o nordestino agradece sua solidariedade- visite nossa p�gina "
					+ "\n e acompanhe nossas a��es : https://www.amigosdobem.org/ ");
			break;

		case 2:

			System.out.println("---------OBRIGADE PELA SUA DOA��O PARA O INSTITUTO LUIZA MEL--------");
			System.out.println("Os nossos pets agradecem sua solidariedade- visite nossa p�gina  "
					+ "e acompanhe nossas a��es: https://ilm.org.br/  ");
			break;

		case 3:

			System.out.println("------------OBRIGADE PELA SUA DOA��O MAR LIMPO---------------------");
			System.out.println("A vida marinha agradece sua solidariedade!visite nossa p�gina e "
					+ "acompanhe nossas a��es:  https://marlimpo.org.br/ ");
			break;

		case 4:
			caso4.opcao4();
			break;
			

		}// fim switch (EscolhaProjeto)
	}// fim metodo escolhaProjeto
}// fim classe Cliente
