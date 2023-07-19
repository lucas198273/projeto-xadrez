package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import tabuleiroxadrez.ExcecaoTabuleiro;
import tabuleiroxadrez.Posicao;
import tabuleiroxadrez.Tabuleiro;
import xadrez.ExcecaoXadrez;
import xadrez.PartidaXadrez;
import xadrez.PecaXadrez;
import xadrez.PosicaoXadrez;

public class Programa {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        
    
        while (true) {
            try{
            UI.limpaTela();
            UI.exibirtabuleiro(partidaXadrez.getPecaTabuleiros());
            System.out.println();
            System.out.print("Posição Partida: ");
            PosicaoXadrez partida = UI.lerPosicaoXadrez(sc);
    
            System.out.println();
            System.out.print("Posição Destino: ");
            PosicaoXadrez destino = UI.lerPosicaoXadrez(sc);
    
            // Realizando movimento
            PecaXadrez pecaCapturada = partidaXadrez.executarMovimento(partida, destino);
    
            // Process captured pieces or check for game-ending conditions if needed
            }
            catch(ExcecaoXadrez e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    
        // Close the scanner after the loop ends
        
    }
    
}
