
import java.util.Scanner;
//JOKENPO
//2 JOGADORES
//ELEMENTOS: PEDRA(1),PAPEL(2)/TESOURA(3)
//PONTOS: PLACAR
//REGRAS DO JOGO: 
// N JOGADAS (RODADAS WHILE/FOR)
//ELEMENTOS IGUAIS SÃO EMPATE 
//PEDRA GANHA DE TESOURA 
//TESOURA GANHA DE PAPEL 
//REINICIAR O JOGO 

public class Jokenpo {
	//PLACAR
	private static int placarJogador = 0;
	private static int placarComputador = 0;
	//ESCOLHA DOS JOGADORES
	private static int escolhaJogador;
	private static int escolhaComputador;
	//PRINCIPAL
	public static void main(String[] args) {
		//QUANTIDADE DE RODADAS
		int rodadas = 0;
		int reinicia = 1;
		Scanner insere = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Boas Vindas ao Pedra, Papel ou Tesoura");
		System.out.println("Deseja jogar quantas rodadas ? ");
		rodadas = input1.nextInt();
		
		//DICA: COLOCAR DENTRO DO WHILE PARA RENICIAR O JOGO
		
		while(reinicia == 1) {
		for(int i = 1; i <= rodadas; ++i) {
			escolhaComputador = (int) (Math.random()*3)+1;
			rotuloEscolhaJogador();
			escolhaJogador = input1.nextInt();
			verificaResultado();	
			System.out.println("Deseja continuar jogando");
			System.out.println("(1) SIM (0) NÃO");
			reinicia = insere.nextInt();	
		}
		exibirPlacar();
		}
			
	}
	//VERIFICAR OS RESULTADOS
	public static void verificaResultado() {
		switch (escolhaJogador){
		case 1: 
			switch (escolhaComputador){ 
				case 1:
					System.out.println("Empate!");
					break;
				case 2:
					System.out.println("Computador Ganhou");
					++placarComputador;
					break;
				case 3:
					System.out.println("Jogador Ganhou");
					++placarJogador;
					break;
					default: 
						System.out.println ("Opção Inválida!");
			} break;
		case 2:
			switch(escolhaComputador) {
				case 1: 
					System.out.println("Jogador Ganhou");
					++placarJogador;
					break;
				case 2:
					System.out.println("Empate");
					break;
				case 3:
					System.out.println("Computador Ganhou");
					++placarComputador;
					break;
				default: 
					System.out.println ("Opção Inválida!");
			} break;
		case 3:
			switch(escolhaComputador) {
					case 1:
						System.out.println("Computador Ganhou");
						++placarComputador;
						break;
					case 2:
						System.out.println("Jogador Ganhou");
						++placarJogador;
						break;
					case 3:
						System.out.println("Empate");
						break;
					default: 
			            System.out.println ("Opção Inválida!");
			} break;
		default: 
			System.out.println ("Opção Invalida!");
	}
		
	} 
	//EXIBIR O PLACAR
	//DICA: USAR A SYSTEM.OUT PARA CHAMAR A VARIÁVEL PLACAR
	public static void exibirPlacar() {
		System.out.println("O placar do Computador: " + placarComputador);
		System.out.println("O placar do Jogador: " + placarJogador);
		
	}
	//ROTULO JOGADOR
	public static void rotuloEscolhaJogador() {
		System.out.println("::: Jogador, insira: ");
		System.out.println("::: 1 -> para Pedra. ");
		System.out.println("::: 2 -> para Papel. ");
		System.out.println("::: 3 -> para Tesoura. ");
		System.out.println("::: Escolha uma opção: ");
	}
	
}
