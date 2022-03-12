package br.com.generation.CashBackSolidario;

import java.util.Scanner;

public class Case_4 {
	
	private int contQ1a = 0,contQ1b = 0,contQ1c=0;
	private int contQ2a = 0,contQ2b=0,contQ2c=0;
	private int contQ3a = 0,contQ3b=0,contQ3c=0;
	
	public void opcao4 (){
		Scanner entrada=new Scanner(System.in);

			System.out.println("-----------------------------PESQUISA DE COMPATIBILIDADE---------------------------------------\n");
			System.out.println("Pesquisa de compatibilidade para indicar o destino de sua doação: \n");
			System.out.println("1-Se você você viajar amanhã qual destas opções você mais se identifica ?");
			System.out.println("    digite A- Ir a uma excursão para conhecer a vida animal de uma região.");
			System.out.println("    digite B- Visitar uma aldeia indígena e conhecer seus costumes");
			System.out.println("    digite C- Visitar a praia do nordeste e aproveitar a comida típica e cultura local");
			System.out.println("\nEscolha uma das opções acima: ");
			String Q1=entrada.next();
			System.out.println();
			
			switch(Q1)
			{
			   case"a","A":
					contQ1a=1;
					break;
					
			   case"b","B":
					contQ1b=1;
					break;
					
			   case"c","C":
					contQ1c=1;
					break;
			   default:
					System.out.println("Opção inválida\n");
					break;
				
			}
		
			System.out.println("Qual desses artistas mais você se identifica ? ");
			System.out.println("    digite A- Luisa Mell\n    digite B- Gisele Bündchen\n    digite C- Alceu Valença");
			System.out.println("\nEscolha uma das opões acima: ");
			String Q2=entrada.next();
			System.out.println();
			
			switch(Q2)
			{
			   case"a","A":
					contQ2a=1;
					break;
					
			   case"b","B":
				    contQ2b=1;
					break;
					
			   case"c","C":
					contQ2c=1;
					break;
			   default:
					System.out.println("Opção inválida");
					break;
				
			}
			
			System.out.println("3- Se você fosse se voluntariar a alguma causa, qual dessas seria ? ");
			System.out.println("    digite A- Um abrigo de animais");
			System.out.println("    digite B- Uma ONG de criação de brinquedos feitos a partir de material reciclado para crianças carentes");
			System.out.println("    digite C- Uma ONG que utiliza artesanatos típicos nordestinos para a geração de renda e valorização da cultura local");
			String Q3=entrada.next();
			System.out.println();
			
			switch(Q3)
			{
			   case"a","A":
					contQ3a=1;
					break;
					
			   case"b","B":
					contQ3b=1;
					break;
					
			   case"c","C":
					contQ3c=1;
					break;
			   default:
					System.out.println("Opção inválida");
					break;
				
			}
			
			int ResultadoLuisaMell=0;
			int MarLimpo=0;
			int AmigosDoBem=0;
			
			ResultadoLuisaMell=(contQ1a+contQ2a+contQ3a)*100/3;
			MarLimpo=(contQ1b+contQ2b+contQ3b)*100/3;
			AmigosDoBem=(contQ1c+contQ2c+contQ3c)*100/3;
			
			
			if (ResultadoLuisaMell!=MarLimpo || AmigosDoBem!=MarLimpo || AmigosDoBem!=ResultadoLuisaMell) {
			int comparacao = 0;
			
			if(comparacao < ResultadoLuisaMell) {
				comparacao = ResultadoLuisaMell;
				System.out.println("\n\"---------OBRIGADE PELA SUA DOAÇÃO PARA O INSTITUTO LUIZA MEL--------\"");
				System.out.println("Os nossos pets agradecem sua solidariedade- visite nossa página  "
							+ "e acompanhe nossas ações: https://ilm.org.br/  ");
			}else if(MarLimpo > comparacao) {
				comparacao = MarLimpo;
				System.out.println("------------OBRIGADE PELA SUA DOAÇÃO MAR LIMPO---------------------");
				System.out.println("A vida marinha agradece sua solidariedade!visite nossa página e "
						+ "acompanhe nossas ações:  https://marlimpo.org.br/ ");
			}else if(AmigosDoBem > comparacao) {
				comparacao = AmigosDoBem;
				System.out.println("---------OBRIGADE PELA SUA DOAÇÃO PARA OS AMIGOS DO BEM--------------");
				System.out.println(" O Sertão nordestino agradece sua solidariedade- visite nossa página "
						+ "\n e acompanhe nossas ações : https://www.amigosdobem.org/ ");
			}
			
			
			
			
			}else if(ResultadoLuisaMell==MarLimpo && ResultadoLuisaMell==AmigosDoBem && AmigosDoBem==MarLimpo) 
			{
				System.out.println("4-Quais dessas situações mais comovem ? ");
				System.out.println("    digite A- Ver animais abandonados ");
				System.out.println("    digite B- Ver resíduos sendo despejados em lugares indevidos");
				System.out.println("    digite C- Ver a desigualdade de uma população");
				String Q4=entrada.next();
				System.out.println();
			switch(Q4)
			{
			   case"a","A":
				   System.out.println("\n\"---------OBRIGADE PELA SUA DOAÇÃO PARA O INSTITUTO LUIZA MEL--------\"");
				   System.out.println("Os nossos pets agradecem sua solidariedade- visite nossa página  "
							+ "e acompanhe nossas ações: https://ilm.org.br/  ");
					break;
					
			   case"b","B":
				   System.out.println("------------OBRIGADE PELA SUA DOAÇÃO MAR LIMPO---------------------");
				   System.out.println("A vida marinha agradece sua solidariedade!visite nossa página e "
						+ "acompanhe nossas ações:  https://marlimpo.org.br/ ");
					break;
					
			   case"c","C":
				   System.out.println("---------OBRIGADE PELA SUA DOAÇÃO PARA OS AMIGOS DO BEM--------------");
				   System.out.println(" O Sertão nordestino agradece sua solidariedade- visite nossa página "
						+ "\n e acompanhe nossas ações : https://www.amigosdobem.org/ ");
					break;
			   default:
					System.out.println("Opção inválida");
					break;
				
			}
			
			entrada.close();
			
	}
}
}
