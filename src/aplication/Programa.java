package aplication;

import tabuleiroxadrez.Posicao;
import tabuleiroxadrez.Tabuleiro;
import xadrez.PartidaXadrez;

public class Programa {
    
    public static void main(String[] args) throws Exception {
       
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.exibirtabuleiro(partidaXadrez.getPecaTabuleiros());
        
        System.out.println();
        System.out.println(' ');
    }
}
