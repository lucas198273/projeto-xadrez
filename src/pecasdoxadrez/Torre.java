package pecasdoxadrez;

import tabuleiroxadrez.Tabuleiro;
import xadrez.Color;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

    public Torre(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
        
    }

    @Override
    public String toString() {
        return "T";
    }

    @Override
    public boolean[][] movimentoPossivel() {
        boolean[][] matriz = new boolean[getTabuleiro().getLinha()][getTabuleiro().getcoluna()]; // Boolean inicia como false
        return matriz;
    }
    
    

}
