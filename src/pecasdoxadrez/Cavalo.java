package pecasdoxadrez;

import tabuleiroxadrez.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Cavalo extends PecaXadrez {

    public Cavalo(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "C";
    }
    
}
