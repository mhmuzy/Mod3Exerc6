	package Hitss.Treinamento.Apresentacao;
/// *** Implementação do Programa na Parte do Treinamento
	import java.util.Scanner; /// *** O Assembly para dar o suporte neste trabalho

	public class Show {
		public static void main(String[] args) {
			try {
				/// *** Inicialização do Tratamento
				String mercadoria; /// *** Variável para falar o Nome da Mercadoria
				double preco, quantTotal; /// *** Variável preço da mercadoria e a quantidade do valor
				/// *** Total da mercadoria
				
				quantTotal = 0; /// *** O valor da quantidade total vai se iniciar com 0
				
				Scanner teclado = new Scanner(System.in); /// *** Declaração da variável para digitar o 
				/// *** Valor pelo teclado
				
				
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("         Hitss Treinamento"); /// *** Título do Programa
				System.out.println(""); /// *** Pula 1 linha
				System.out.println("Digite a quantidade de mercadoria que você deseja comprar:");
				/// *** O Programa solicitando para digitar a quantidade de produtos que deseja comprar
				int mercad = teclado.nextInt(); /// *** Variável para digitar a quantidade de mercadoria que 
				/// *** Deseja comprar
				System.out.println(""); /// *** Pula 1 linha
				for (int i = 1; i <= mercad; i++) { /// *** Laço for para inicializar a compra a quantidade 
					/// *** De mercadoria com 1 e vai até a quantidade digitada da mercadoria que solicitou 					
					/// *** Enquanto a quantidade da mercadoria não foi digitada vai fazendo o laço
					System.out.println("Digite a Marcadoria " + i + ":"); /// *** O Programa pede para digitar 
					/// *** A Mercadoria e o Nº dela para saber se está ou não acabando a compra
					System.out.println(""); /// *** Pula 1 linha
					mercadoria = teclado.next(); /// *** O Comando para digitar o nome da mercadoria
					System.out.println(""); /// *** Pula 1 linha
					System.out.println("Digite o Preço do Produto:"); /// *** O Programa pede para digitar o 
					/// *** Preço do Produto 
					System.out.println(""); /// *** Pula 1 linha
					preco = teclado.nextDouble(); /// *** O Comando para digitar o Preço do Produto
					System.out.println(""); /// *** Pula 1 linha 
					quantTotal += preco;
				
				if (i == mercad) {
					System.out.println("A quantidade total do Valor da Venda é de: R$ " + quantTotal);
					System.out.println("Fim do Programa.");
			
				}
						
				} 
			} catch (Exception e) {
				System.out.println("Erro de Processamento: " + e.getMessage());
			}
		}
	}

