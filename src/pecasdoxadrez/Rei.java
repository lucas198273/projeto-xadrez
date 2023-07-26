package pecasdoxadrez;

import tabuleiroxadrez.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez{

    public Rei(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
        
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'movimentosPossiveis'");
    }
    

}
