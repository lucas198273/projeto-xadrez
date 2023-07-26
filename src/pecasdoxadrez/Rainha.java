package pecasdoxadrez;
import tabuleiroxadrez.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;


public class Rainha extends PecaXadrez {

    public Rainha(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "D";
    }

    @Override
    public boolean[][] movimentosPossiveis() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'movimentosPossiveis'");
    }
}
