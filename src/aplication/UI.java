package aplication;


import java.util.InputMismatchException;
import java.util.Scanner;

import tabuleiroxadrez.Peca;
import xadrez.Color;
import xadrez.PecaXadrez;
import xadrez.PosicaoXadrez;
public class UI {
    // Esta classe é responsavel por exibir o jogo de xadrez
    public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
    public static void limpaTela(){
        System.out.print("\033[H\033[2J");
        System.out.flush();   //
        //O código é uma forma de limpar a tela em um console 
        //usando sequências de escape ANSI.
    }
    public static PosicaoXadrez lerPosicaoXadrez(Scanner sc){
        try{
            String s = sc.nextLine();
            char coluna = s.charAt(0); // coluna é o primeiro item
            int linha = Integer.parseInt(s.substring(1));// linha é o segundo item
            return new PosicaoXadrez(coluna, linha);
        }
        catch(RuntimeException e){
            throw new InputMismatchException("Erro na entrada de dados, somente valores entre a1 ate h8!");
        }
    }
    public static void exibirtabuleiro(PecaXadrez[][] peca){
        for(int i=0;i< peca.length;i++){ // Imprimi linha
            System.out.print((8-i) +"  ");
            for(int j=0;j<peca.length;j++){ // imprime coluna

                exibirPeca( peca[i][j], false);; // Verifica se a Peça esta vazia , se nao imprime a peca
            }
            System.out.println();
        }
        System.out.println("\n   a b c d e f g h");
        
    }

    	private static void exibirPeca(PecaXadrez piece, boolean background) {
		if (background) {
			System.out.print(ANSI_BLUE_BACKGROUND);
		}
    	if (piece == null) {
            System.out.print("-" + ANSI_RESET);
        }
        else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE + piece + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
}
