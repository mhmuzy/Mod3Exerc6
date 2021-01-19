	package Hitss.Treinamento.Apresentacao;
/// *** Implementa��o do Programa na Parte do Treinamento
	import java.util.Scanner; /// *** O Assembly para dar o suporte neste trabalho

	public class Show {
		public static void main(String[] args) {
			try {
				/// *** Inicializa��o do Tratamento
				String mercadoria; /// *** Vari�vel para falar o Nome da Mercadoria
				double preco, quantTotal; /// *** Vari�vel pre�o da mercadoria e a quantidade do valor
				/// *** Total da mercadoria
				
				quantTotal = 0; /// *** O valor da quantidade total vai se iniciar com 0
				
				Scanner teclado = new Scanner(System.in); /// *** Declara��o da vari�vel para digitar o 
				/// *** Valor pelo teclado
				
				
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("         Hitss Treinamento"); /// *** T�tulo do Programa
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("Digite a quantidade de mercadoria que voc� deseja comprar:");
				/// *** O Programa solicitando para digitar a quantidade de produtos que deseja comprar
				int mercad = teclado.nextInt(); /// *** Vari�vel para digitar a quantidade de mercadoria que 
				/// *** Deseja comprar
				System.out.println(""); /// *** Pula 1 linha
				for (int i = 1; i <= mercad; i++) { /// *** La�o for para inicializar a compra a quantidade 
					/// *** De mercadoria com 1 e vai at� a quantidade digitada da mercadoria que solicitou 					
					/// *** Enquanto a quantidade da mercadoria n�o foi digitada vai fazendo o la�o
					System.out.println("Digite a Marcadoria " + i + ":"); /// *** O Programa pede para digitar 
					/// *** A Mercadoria e o N� dela para saber se est� ou n�o acabando a compra
					System.out.println(""); /// *** Pula 1 linha
					mercadoria = teclado.next(); /// *** O Comando para digitar o nome da mercadoria
					System.out.println(""); /// *** Pula 1 linha
					System.out.println("Digite o Pre�o do Produto:"); /// *** O Programa pede para digitar o 
					/// *** Pre�o do Produto 
					System.out.println(""); /// *** Pula 1 linha
					preco = teclado.nextDouble(); /// *** O Comando para digitar o Pre�o do Produto
					System.out.println(""); /// *** Pula 1 linha 
					quantTotal += preco;
				
				if (i == mercad) {
					System.out.println("A quantidade total do Valor da Venda � de: R$ " + quantTotal);
					System.out.println("Fim do Programa.");
			
				}
						
				} 
			} catch (Exception e) {
				System.out.println("Erro de Processamento: " + e.getMessage());
			}
		}
	}

