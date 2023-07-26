package pecasdoxadrez;

import tabuleiroxadrez.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Bispo extends PecaXadrez {

    public Bispo(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'movimentosPossiveis'");
    }
    
}
