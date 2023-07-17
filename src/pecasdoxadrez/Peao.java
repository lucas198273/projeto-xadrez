package pecasdoxadrez;

import tabuleiroxadrez.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Peao extends PecaXadrez {

    public Peao(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "P";
    }
    
}
