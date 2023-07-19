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
    public boolean[][] movimentoPossivel() {
        boolean[][] matriz = new boolean[getTabuleiro().getLinha()][getTabuleiro().getcoluna()]; // Boolean inicia como false
        return matriz;
    }
    
    

}
